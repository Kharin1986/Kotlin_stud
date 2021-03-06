package com.gb.kotlin_stud.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.GridLayout
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.gb.kotlin_stud.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var adapter: NotesRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        rv_notes.layoutManager = GridLayoutManager(this,2)
        adapter = NotesRVAdapter()
        rv_notes.adapter = adapter

        viewModel.viewState().observe(this, Observer { value ->
            value?.let{adapter.notes = it.notes}
        })
    }
}
