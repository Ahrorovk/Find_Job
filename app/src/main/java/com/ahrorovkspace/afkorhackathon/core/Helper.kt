package com.ahrorovkspace.afkorhackathon.core

import android.annotation.SuppressLint
import android.content.ContentUris
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.net.ParseException
import android.net.Uri
import android.os.Environment
import android.provider.DocumentsContract
import android.provider.MediaStore
import androidx.core.content.ContextCompat.startActivity
import com.ahrorovkspace.afkorhackathon.core.states.RoleState
import com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationState
import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun getTopBarTitle(currentScreen: String, userId: String = "") = when (currentScreen) {
    Routes.ChatScreen.route -> "Чаты"
    Routes.ProfileScreen.route -> "Профиль"
    Routes.ChatWithUserScreen.route -> userId
    Routes.SettingsScreen.route -> "Настройки"
    Routes.ApplicationScreen.route -> "Заявки"
    Routes.MyApplicationScreen.route -> "Мои заявки"
    Routes.BrieflyDescScreen.route -> "Про проект"
    else -> ""
}

fun getRoles() =
    listOf<RoleState>(
        RoleState(
            "исполнитель", 1
        ),
        RoleState(
            "работодатель", 2
        )
    )

fun getEnable(state: RegistrationState) = state.email.isNotEmpty() &&
        state.password.isNotEmpty() &&
        state.passwordConfirm.isNotEmpty() &&
        state.passwordConfirm == state.password &&
        state.username.isNotEmpty() &&
        state.phone.isNotEmpty()

fun doesScreenHaveTopBar(currentScreen: String) =
    currentScreen != Routes.SplashScreen.route &&
            currentScreen != Routes.AuthorizationScreen.route &&
            currentScreen != Routes.RegistrationScreen.route

fun doesScreenHaveMenu(currentScreen: String) =
    currentScreen != Routes.SplashScreen.route &&
            currentScreen != Routes.AuthorizationScreen.route &&
            currentScreen != Routes.RegistrationScreen.route &&
            currentScreen != Routes.SettingsScreen.route &&
            currentScreen != Routes.ChatWithUserScreen.route &&
            currentScreen != Routes.ApplicationScreen.route

fun doesScreenHaveBottomBar(currentScreen: String) =
    currentScreen != Routes.SplashScreen.route &&
            currentScreen != Routes.AuthorizationScreen.route &&
            currentScreen != Routes.RegistrationScreen.route &&
            currentScreen != Routes.SettingsScreen.route &&
            currentScreen != Routes.ChatWithUserScreen.route &&
            currentScreen != Routes.ApplicationScreen.route &&
            currentScreen != BottomSheets.ApplicationSheet.route
@SuppressLint("NewApi")
fun parseDateTime(dateTimeString: String): LocalDateTime? {
    return try {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX")
        LocalDateTime.parse(dateTimeString, formatter)
    } catch (e: ParseException) {
        null
    }
}
 @SuppressLint("NewApi")
 fun formatDateTime(dateTime: LocalDateTime): String {
    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
    return dateTime.format(formatter)
}


fun openPdfFile(context: Context, file: File) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.setDataAndType(Uri.fromFile(file), "application/pdf")
    intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY or Intent.FLAG_GRANT_READ_URI_PERMISSION
    context.startActivity(intent)
}

fun savePdfToFile(base64Pdf: String, fileName: String): File {
    val dir = File(Environment.getExternalStorageDirectory().absolutePath + "/YourAppFolder")
    if (!dir.exists()) {
        dir.mkdirs()
    }

    val file = File(dir, fileName)
    val decodedBytes = android.util.Base64.decode(base64Pdf, android.util.Base64.DEFAULT)
    file.writeBytes(decodedBytes)
    return file
}

fun getRealPathFromURI(context: Context, uri: Uri): String? {
    when {
        // DocumentProvider
        DocumentsContract.isDocumentUri(context, uri) -> {
            when {
                // ExternalStorageProvider
                isExternalStorageDocument(uri) -> {
                    val docId = DocumentsContract.getDocumentId(uri)
                    val split = docId.split(":").toTypedArray()
                    val type = split[0]
                    // This is for checking Main Memory
                    return if ("primary".equals(type, ignoreCase = true)) {
                        if (split.size > 1) {
                            Environment.getExternalStorageDirectory().toString() + "/" + split[1]
                        } else {
                            Environment.getExternalStorageDirectory().toString() + "/"
                        }
                        // This is for checking SD Card
                    } else {
                        "storage" + "/" + docId.replace(":", "/")
                    }
                }
                isDownloadsDocument(uri) -> {
                    val fileName = getFilePath(context, uri)
                    if (fileName != null) {
                        return Environment.getExternalStorageDirectory()
                            .toString() + "/Download/" + fileName
                    }
                    var id = DocumentsContract.getDocumentId(uri)
                    if (id.startsWith("raw:")) {
                        id = id.replaceFirst("raw:".toRegex(), "")
                        val file = File(id)
                        if (file.exists()) return id
                    }
                    val contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://"),
                        java.lang.Long.valueOf(id)
                    )
                    return getDataColumn(context, contentUri, null, null)
                }
                isMediaDocument(uri) -> {
                    val docId = DocumentsContract.getDocumentId(uri)
                    val split = docId.split(":").toTypedArray()
                    val type = split[0]
                    var contentUri: Uri? = null
                    when (type) {
                        "image" -> {
                            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                        }
                        "video" -> {
                            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                        }
                        "audio" -> {
                            contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                        }
                    }
                    val selection = "_id=?"
                    val selectionArgs = arrayOf(split[1])
                    return getDataColumn(context, contentUri, selection, selectionArgs)
                }
            }
        }
        "content".equals(uri.scheme, ignoreCase = true) -> {
            // Return the remote address
            return if (isGooglePhotosUri(uri)) uri.lastPathSegment else getDataColumn(
                context,
                uri,
                null,
                null
            )
        }
        "file".equals(uri.scheme, ignoreCase = true) -> {
            return uri.path
        }
    }
    return null
}

fun getDataColumn(
    context: Context,
    uri: Uri?,
    selection: String?,
    selectionArgs: Array<String>?
): String? {
    var cursor: Cursor? = null
    val column = "_data"
    val projection = arrayOf(
        column
    )
    try {
        if (uri == null) return null
        cursor = context.contentResolver.query(
            uri, projection, selection, selectionArgs,
            null
        )
        if (cursor != null && cursor.moveToFirst()) {
            val index = cursor.getColumnIndexOrThrow(column)
            return cursor.getString(index)
        }
    } finally {
        cursor?.close()
    }
    return null
}

fun getFilePath(context: Context, uri: Uri?): String? {
    var cursor: Cursor? = null
    val projection = arrayOf(
        MediaStore.MediaColumns.DISPLAY_NAME
    )
    try {
        if (uri == null) return null
        cursor = context.contentResolver.query(
            uri, projection, null, null,
            null
        )
        if (cursor != null && cursor.moveToFirst()) {
            val index = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DISPLAY_NAME)
            return cursor.getString(index)
        }
    } finally {
        cursor?.close()
    }
    return null
}

/**
 * @param uri The Uri to check.
 * @return Whether the Uri authority is ExternalStorageProvider.
 */
fun isExternalStorageDocument(uri: Uri): Boolean {
    return "com.android.externalstorage.documents" == uri.authority
}

/**
 * @param uri The Uri to check.
 * @return Whether the Uri authority is DownloadsProvider.
 */
fun isDownloadsDocument(uri: Uri): Boolean {
    return "com.android.providers.downloads.documents" == uri.authority
}

/**
 * @param uri The Uri to check.
 * @return Whether the Uri authority is MediaProvider.
 */
fun isMediaDocument(uri: Uri): Boolean {
    return "com.android.providers.media.documents" == uri.authority
}

/**
 * @param uri The Uri to check.
 * @return Whether the Uri authority is Google Photos.
 */
fun isGooglePhotosUri(uri: Uri): Boolean {
    return "com.google.android.apps.photos.content" == uri.authority
}