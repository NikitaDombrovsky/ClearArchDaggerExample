package com.example.smallnote.presentation

// Presentation Layer
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.domain.models.Note
import com.example.domain.usecase.GetNote
import com.example.domain.usecase.SaveNote

// Точно?

class NoteViewModel(
    private val _getNote: GetNote,
    private val _saveNote: SaveNote
    /*private val repository: NoteRepository*/
) : ViewModel() {


    init {
        Log.e("NoteViewModel", "init")
    }
    fun saveNote(note: Note): Boolean{
        _saveNote(note = note)
        return true
    }
    fun getNote(){
        _getNote
    }
  //  private val mutableLiveData: MutableLiveData<Note> = MutableStateFlow<Note>()

/*    fun saveNote(note: Note) {
        //repository.saveNote(note)
    }*/

 /*   fun getNote(id: Int): Note? {
        return repository.getNote(id)
    }*/
}