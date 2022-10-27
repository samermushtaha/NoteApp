package com.example.noteapp.featureNote.presentation.screens.notes

import com.example.noteapp.featureNote.domain.util.NoteOrder
import com.example.noteapp.featureNote.domain.util.OrderType

data class NotesState(
    val notes: List<com.example.noteapp.featureNote.domain.model.Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)