package com.example.hustlerbay.chem_data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hustlerbay.MainActivity
import com.example.hustlerbay.R

class chem_chapter_act: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chem_act)

        // connecting the adapter with recycler view
        val rec = findViewById<RecyclerView>(R.id.chem_recycler)
        rec.layoutManager = LinearLayoutManager(this)
        val adapter = chem_Adapter(this , chaptersChem.chapter)
        rec.adapter = adapter
    }

    // function for the getting back to home screen
    fun backtoHome(view: View) {
        val intent = Intent(this , MainActivity::class.java)
        startActivity(intent)
    }
}