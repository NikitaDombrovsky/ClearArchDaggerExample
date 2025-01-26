package com.example.data.repository

import com.example.data.storage.NoteStorage
import com.example.data.storage.models.NoteData
import com.example.data.storage.models.fromModel
import com.example.data.storage.models.toModel
import com.example.domain.models.Note
import com.example.domain.repository.NoteRepository

/*

import com.example.smallnote.domain.Note
import com.example.smallnote.domain.NoteRepository

// Data Layer
class NoteRepositoryImpl : NoteRepository {
    private val notes = mutableListOf<Note>()

    override fun saveNote(note: Note) {
        notes.add(note)
    }

*/
/*    override fun getNote(id: Int): Note {
        return notes.find { it.id == id }
    }*//*

}*/
class NoteRepositoryImpl(private val noteStorage: NoteStorage) : NoteRepository {

    override fun saveNote(note: Note): Boolean {
        val result = noteStorage.saveNote(note = NoteData.fromModel(note))
        return true
    }

    override fun getNote(): Note {
        val note = noteStorage.getNote()
        return note.toModel()

    }

}



