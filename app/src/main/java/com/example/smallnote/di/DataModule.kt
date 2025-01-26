package com.example.smallnote.di

import android.content.Context
import com.example.data.repository.NoteRepositoryImpl
import com.example.data.storage.NoteStorage
import com.example.data.storage.shareprefs.SharedPrefNoteStorage
import com.example.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideNoteStorage(context: Context): NoteStorage {
        return SharedPrefNoteStorage(context = context)
    }

    // Dagger идет по модулю и ищет запрашиваемый возвращаемый тип
    @Provides
    fun provideNoteRepository(noteStorage: NoteStorage): NoteRepository {
        return NoteRepositoryImpl(
            noteStorage = noteStorage
        )
    }
}