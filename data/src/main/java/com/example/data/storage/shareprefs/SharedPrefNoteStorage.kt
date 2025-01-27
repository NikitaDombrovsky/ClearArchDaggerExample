package com.example.data.storage.shareprefs

import android.content.Context
import android.content.SharedPreferences
import com.example.data.storage.NoteStorage
import com.example.data.storage.models.NoteData

private const val SHARED_PREFS_NAME = "shared_pref_name"
private const val KEY_ID = "id"
private const val KEY_TITLE = "title"
private const val KEY_CONTENT = "content"


class SharedPrefNoteStorage(context: Context) : NoteStorage {

    private val sharedPreferences =
        context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveNote(note: NoteData): Boolean {
        val editor : SharedPreferences.Editor = sharedPreferences.edit()

        editor.putString(KEY_ID, note.id)
        editor.putString(KEY_TITLE, note.title)
        editor.putString(KEY_CONTENT, note.content)
        editor.apply()
/*        // TODO коммит
        sharedPreferences.edit().putString(KEY_ID, note.id)
        sharedPreferences.edit().putString(KEY_TITLE, note.title)
        sharedPreferences.edit().putString(KEY_CONTENT, note.content)*/
        // TODO Умен
        return true
    }

    override fun getNote(): NoteData {
        val id = sharedPreferences.getString(KEY_ID, "") ?: KEY_ID
        val title = sharedPreferences.getString(KEY_TITLE, "") ?: KEY_TITLE
        val content = sharedPreferences.getString(KEY_CONTENT, "") ?: KEY_CONTENT
        return NoteData(
            id = id,
            title = title,
            content = content
        )
    }
}