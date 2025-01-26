package com.example.domain.usecase

import com.example.domain.models.Note
import com.example.domain.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {
    operator fun invoke(): Note = noteRepository.getNote()
}
