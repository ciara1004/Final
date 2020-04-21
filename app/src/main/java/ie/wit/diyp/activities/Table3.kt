package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp

class Table3 : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_table3)


        val table13 = findViewById<TextView>(R.id.table13)
        table13.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table14 = findViewById<TextView>(R.id.table14)
        table14.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table15 = findViewById<TextView>(R.id.table15)
        table15.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table16 = findViewById<TextView>(R.id.table16)
        table16.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table17 = findViewById<TextView>(R.id.table17)
        table17.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table18 = findViewById<TextView>(R.id.table18)
        table18.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        FirebaseAuth.getInstance().signOut()
    }


}