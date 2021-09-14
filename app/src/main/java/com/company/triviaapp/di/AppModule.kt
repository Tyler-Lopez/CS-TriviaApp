package com.company.triviaapp.di

import com.company.triviaapp.data.repository.FlashcardRepositoryImpl
import com.company.triviaapp.domain.repository.FlashcardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /*

    This is necessary to prevent the following error: [Dagger/MissingBinding]
    https://stackoverflow.com/questions/66189930/android-hilt-viewmodel-cant-detect-dependency

     */

    @Provides
    fun provideService(): FlashcardRepository = FlashcardRepositoryImpl()

}