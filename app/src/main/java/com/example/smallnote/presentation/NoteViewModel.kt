package com.example.smallnote.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.domain.models.Note
import com.example.domain.usecase.GetNote
import com.example.domain.usecase.SaveNote

class NoteViewModel(
    private val _getNote: GetNote,
    private val _saveNote: SaveNote
) : ViewModel() {
    val sharedData: MutableLiveData<Note> = MutableLiveData()

    init {
        Log.e("NoteViewModel", "init")
    }

    fun saveNote(note: Note): Boolean {
        return _saveNote(note = note)
    }

    fun getNote() = _getNote()

}