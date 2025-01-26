package com.example.domain.usecase

import com.example.domain.models.Note
import com.example.domain.repository.NoteRepository

class SaveNote(private val noteRepository: NoteRepository) {
    operator fun invoke(note: Note): Boolean = noteRepository.saveNote(note)
}


