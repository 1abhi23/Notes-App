package com.example.notesapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notesapp.repository.NoteRepository
import java.lang.Appendable

class NoteViewModelFactory(val app: Application, private val noteRepository: NoteRepository) :
    ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelclass: Class<T>): T {
        return NoteViewModel(app, noteRepository) as T
    }
}