package com.example.hustlerbay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hustlerbay.chem_data.chem_chapter_act

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_chem = findViewById<Button>(R.id.into_chem)
        btn_chem.setOnClickListener{
            val intent = Intent(this , chem_chapter_act::class.java)
            startActivity(intent)
        }

    }


}