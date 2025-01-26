package com.example.data.storage.models

import com.example.domain.models.Note

// Domain Layer
data class NoteData(
    val id: String,
    val title: String,
    val content: String
) {
    companion object {}
}
fun NoteData.toModel(): Note{
    return Note(
        id = id,
        title = title,
        content = content
    )
}
fun NoteData.Companion.fromModel(note: Note) : NoteData{
    return NoteData(
        id = note.id,
        title = note.title,
        content = note.content
    )
}

