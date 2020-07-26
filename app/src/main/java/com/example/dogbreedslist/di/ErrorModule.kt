package com.example.dogbreedslist.di

import com.example.dogbreedslist.data.error.ErrorFactory
import com.example.dogbreedslist.data.error.ErrorManager
import com.example.dogbreedslist.data.error.mapper.ErrorMapper
import com.example.dogbreedslist.data.error.mapper.ErrorMapperInterface
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

// with @Module we Telling Dagger that, this is a Dagger module
@Module
abstract class ErrorModule {
    @Binds
    @Singleton
    abstract fun provideErrorFactoryImpl(errorManager: ErrorManager): ErrorFactory

    @Binds
    @Singleton
    abstract fun provideErrorMapper(errorMapper: ErrorMapper): ErrorMapperInterface
}
