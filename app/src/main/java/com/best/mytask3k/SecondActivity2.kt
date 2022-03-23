package com.best.mytask3k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.best.mytask3k.User.Users

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val textView: TextView= findViewById(R.id.txtbtn2)

        intent.let {
            val user = intent.extras?.getParcelable<Users>("user")
            textView.text = user.toString()
        }
    }
}