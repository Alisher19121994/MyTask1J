package com.best.mytask3k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.best.mytask3k.User.Users

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            val users = Users("Alisher", 27)
            val intent = Intent(this, SecondActivity2::class.java)
            intent.putExtra("user", users)
            startActivity(intent)
        }

    }
}