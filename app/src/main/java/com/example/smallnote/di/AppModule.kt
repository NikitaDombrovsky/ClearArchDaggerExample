package com.example.smallnote.di

import android.content.Context
import com.example.domain.usecase.GetNote
import com.example.domain.usecase.SaveNote
import com.example.smallnote.presentation.NoteViewFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule(val context: Context) {
    @Provides
    fun provideContext(): Context{
        return context
    }
    @Provides
    fun provideNoteViewFactory(
         getNote: GetNote,
         saveNote: SaveNote
    ): NoteViewFactory {
        return NoteViewFactory(
            getNote = getNote,
            saveNote = saveNote
        )
    }
}