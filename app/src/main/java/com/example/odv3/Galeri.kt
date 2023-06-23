package com.example.odv3

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class Galeri : AppCompatActivity() {

    lateinit var btnAlert2 : Button
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)



        btnAlert2 = findViewById(R.id.button2)

        btnAlert2.setOnClickListener {

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


        listView = findViewById(R.id.galeriListView)
        val adapter = CustomListAdapter(this)
        listView.adapter = adapter

        // Örneğin, gösterilecek resimleri ve diğer verileri tanımlayın
        val imageResources = listOf(
            R.drawable.picture2,
            R.drawable.picture3,
            R.drawable.picture4,
            R.drawable.picture5,
            R.drawable.picture6
        )

        // Her bir liste öğesi için verileri ayarlayın
        for (resourceId in imageResources) {
            val listItem = CenteredImageListItem(this)
            listItem.setImage(resourceId)
            adapter.add(listItem)
        }
    }

    class CustomListAdapter(context: Context) : ArrayAdapter<CenteredImageListItem>(context, 0) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val listItem = getItem(position)

            return listItem ?: super.getView(position, convertView, parent)
        }
    }
}
