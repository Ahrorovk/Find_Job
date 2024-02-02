package com.ahrorovkspace.afkorhackathon.data.local

import android.content.Context
import androidx.compose.ui.res.integerResource
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

class DataStoreManager(val context: Context) {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("preferences_name")
        val REFRESH_TOKEN = stringPreferencesKey("REFRESH_TOKEN")
        val ACCESS_TOKEN = stringPreferencesKey("ACCESS_TOKEN")
        val ROLE_ID = intPreferencesKey("ROLE_ID")
    }
    suspend fun updateRefreshToken(token: String) {
        context.dataStore.edit { preferences ->
            preferences[REFRESH_TOKEN] = token
        }
    }
    suspend fun updateRoleId(id: Int) {
        context.dataStore.edit { preferences ->
            preferences[ROLE_ID] = id
        }
    }
    suspend fun updateAccessToken(token: String) {
        context.dataStore.edit { preferences ->
            preferences[ACCESS_TOKEN] = token
        }
    }
    val getRefreshToken = context.dataStore.data.map {
        it[REFRESH_TOKEN] ?: ""
    }
    val getRoleId = context.dataStore.data.map {
        it[ROLE_ID] ?: 0
    }
    val getAccessToken = context.dataStore.data.map {
        it[ACCESS_TOKEN] ?: ""
    }
}