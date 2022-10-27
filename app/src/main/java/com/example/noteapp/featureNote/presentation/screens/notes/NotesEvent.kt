package com.example.noteapp.featureNote.presentation.screens.notes

import com.example.noteapp.featureNote.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: com.example.noteapp.featureNote.domain.model.Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}