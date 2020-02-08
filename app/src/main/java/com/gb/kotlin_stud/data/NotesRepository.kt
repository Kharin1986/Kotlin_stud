package com.gb.kotlin_stud.data

import com.gb.kotlin_stud.data.entity.Note

object NotesRepository {
    private val notes: List<Note>
    init{
        notes= listOf(
            Note("Первая заметка","Очень важный текст",0xfff06292.toInt()),
            Note("Вторая заметка","Очень важный текст",0xfff06292.toInt()),
            Note("Третья заметка","Очень важный текст",0xfff06292.toInt()),
            Note("Четвертая заметка","Очень важный текст",0xfff06292.toInt()),
            Note("Пятая заметка","Очень важный текст",0xfff06292.toInt()),
            Note("Шестая заметка","Очень важный текст",0xfff06292.toInt())
        )
    }
    fun getNotes(): List<Note> {
        return notes
    }
}