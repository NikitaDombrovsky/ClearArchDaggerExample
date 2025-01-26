package com.example.smallnote.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.domain.usecase.GetNote
import com.example.domain.usecase.SaveNote

class NoteViewFactory(
    val getNote: GetNote,
    val saveNote: SaveNote

) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(
            _getNote = getNote,
            _saveNote = saveNote
        ) as T
    }
}