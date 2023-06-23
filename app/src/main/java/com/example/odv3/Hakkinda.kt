package com.example.odv3

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil

class Hakkinda : AppCompatActivity() {


    lateinit var btnAnasayfa : Button
    lateinit var btnAlert : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hakkinda)


        btnAnasayfa = findViewById(R.id.button)
        btnAlert = findViewById(R.id.button)


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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}