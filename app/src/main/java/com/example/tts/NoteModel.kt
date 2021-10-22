package com.example.tts

data class NoteModel (
    val notes: List<Data>
        ) {
    data class Data (val id: String?, val note: String?)
}
