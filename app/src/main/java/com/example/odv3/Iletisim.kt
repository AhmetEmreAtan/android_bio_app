package com.example.odv3

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Iletisim : AppCompatActivity() {

    lateinit var btnAlert : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iletisim)



        btnAlert = findViewById(R.id.button3)

        btnAlert.setOnClickListener {

            var titleView = layoutInflater.inflate(R.layout.button_alert, null)
            var alert = AlertDialog.Builder(this)
            alert.setCustomTitle(titleView!!)
            alert.setMessage("Are you sure you want to return to the homepage?")
            alert.setCancelable(false)
            //buttons
            alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            })
            alert.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
            })

            alert.setIcon(R.drawable.baseline_info_24)

            alert.show()
        }

    }
}