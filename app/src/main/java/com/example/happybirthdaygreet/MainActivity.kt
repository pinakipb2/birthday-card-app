package com.example.happybirthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greet.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayGreet(view: View) {
        val name = inputName.editableText.toString()
        if (name.isEmpty()) {
            Toast.makeText(this, "Please Enter a Valid Name", Toast.LENGTH_LONG).show();
            return;
        }
        if (name.length >40) {
            Toast.makeText(this, "Please Enter a Valid Name", Toast.LENGTH_LONG).show();
            return;
        }
        val intent = Intent(this,BirthdayGreetActivity::class.java)
        intent.putExtra(BirthdayGreetActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}