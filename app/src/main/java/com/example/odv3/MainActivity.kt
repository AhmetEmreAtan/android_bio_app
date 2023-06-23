package com.example.odv3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnBio : Button
    lateinit var btnGallery : Button
    lateinit var btnSkills : Button
    lateinit var btnLink : Button
    lateinit var btnGit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnBio = findViewById(R.id.mybiobtn)
        btnGallery = findViewById(R.id.mygallerybtn)
        btnSkills = findViewById(R.id.myskillsbtn)
        btnLink = findViewById(R.id.mylinkedinbtn)
        btnGit = findViewById(R.id.mygithubbtn)


        btnBio.setOnClickListener {
            intent = Intent(this, Hakkinda::class.java)
            Toast.makeText(this, "My Bio!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        btnGallery.setOnClickListener {
            intent = Intent(this, Galeri::class.java)
            Toast.makeText(this, "My Gallery", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        btnSkills.setOnClickListener {
            intent = Intent(this, Iletisim::class.java)
            Toast.makeText(this, "My Skills", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        btnLink.setOnClickListener {
            intent = Intent(this, Blog::class.java)
            Toast.makeText(this, "My LinkedIn", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


        btnGit.setOnClickListener {
            intent = Intent(this, Github::class.java)
            Toast.makeText(this, "My Github", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }



    }
}