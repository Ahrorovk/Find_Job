package com.ahrorovkspace.afkorhackathon.di

import android.content.Context
import com.ahrorovkspace.afkorhackathon.core.Constants
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.data.network.AfkorHackRepositoryImpl
import com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideAfkorHackApi(): AfkorHackApi =
        Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .readTimeout(120, TimeUnit.SECONDS)
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .build()
            )
            .build()
            .create(AfkorHackApi::class.java)

    @Singleton
    @Provides
    fun provideAfkorHackRepository(
        api: AfkorHackApi
    ): AfkorHackRepository = AfkorHackRepositoryImpl(api)

    @Singleton
    @Provides
    fun provideSessionManager(
        @ApplicationContext context: Context
    ) = DataStoreManager(context)
}