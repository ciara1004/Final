package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp


class Sections : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_section)


        val topsection = findViewById<TextView>(R.id.topsection)
        topsection.setOnClickListener{
            val intent = Intent(this, Table::class.java)
            startActivity(intent)
        }

        val grillroom = findViewById<TextView>(R.id.grillroom)
        grillroom.setOnClickListener{
            val intent = Intent(this, Table2::class.java)
            startActivity(intent)
        }

        val snug = findViewById<TextView>(R.id.snug)
        snug.setOnClickListener{
            val intent = Intent(this, Table3::class.java)
            startActivity(intent)
        }

    }


}