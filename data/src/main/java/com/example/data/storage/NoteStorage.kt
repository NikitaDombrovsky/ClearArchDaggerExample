package com.example.data.storage

import com.example.data.storage.models.NoteData

interface NoteStorage {
    fun saveNote(note: NoteData): Boolean
    fun getNote() : NoteData
}