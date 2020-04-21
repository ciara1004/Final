package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp

class Table2 : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_table2)


        val table7 = findViewById<TextView>(R.id.table7)
        table7.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table8 = findViewById<TextView>(R.id.table8)
        table8.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table9 = findViewById<TextView>(R.id.table9)
        table9.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table10 = findViewById<TextView>(R.id.table10)
        table10.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table11 = findViewById<TextView>(R.id.table11)
        table11.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val table12 = findViewById<TextView>(R.id.table12)
        table12.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        FirebaseAuth.getInstance().signOut()
    }


}