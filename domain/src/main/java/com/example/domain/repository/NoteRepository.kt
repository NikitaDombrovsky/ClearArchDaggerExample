package com.example.domain.repository

import com.example.domain.models.Note

interface NoteRepository {
   // suspend fun getCurrentWeather(city: String, language: String): WeatherListModel
    fun saveNote(note: Note) : Boolean
    fun getNote(): Note
    // fun getNote(id: Int): Note
}