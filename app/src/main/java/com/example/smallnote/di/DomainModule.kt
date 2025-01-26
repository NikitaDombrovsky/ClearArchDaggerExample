package com.example.smallnote.di


import com.example.data.repository.NoteRepositoryImpl
import com.example.domain.repository.NoteRepository
import com.example.domain.usecase.GetNote
import com.example.domain.usecase.SaveNote
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun provideGetNote(noteRepository: NoteRepository): GetNote{
        return GetNote(
            noteRepository = noteRepository
        )
    }
    @Provides
    fun provideSaveNote(noteRepository: NoteRepository): SaveNote{
        return SaveNote(
            noteRepository = noteRepository
        )
    }
/*    @Provides
    fun provideGetNote(id: Int): Note {
        return NoteRepositoryImpl().getNote(id)
    }*/
}