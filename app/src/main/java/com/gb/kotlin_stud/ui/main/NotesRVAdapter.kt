package com.gb.kotlin_stud.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gb.kotlin_stud.R
import com.gb.kotlin_stud.data.entity.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NotesRVAdapter: RecyclerView.Adapter<NotesRVAdapter.ViewHolder>() {

    var notes: List<Note> = listOf()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (
       LayoutInflater.from(parent.context).inflate(
           R.layout.item_note,
           parent,
           false
            )
        )


    override fun getItemCount(): Int =notes.size

    override fun onBindViewHolder(vh: ViewHolder, pos: Int) =vh.bind(notes[pos])


    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(note: Note)= with(itemView){
            tv_title.text=note.title
            tv_text.text=note.text
            setBackgroundColor(note.color)
        }
    }
}