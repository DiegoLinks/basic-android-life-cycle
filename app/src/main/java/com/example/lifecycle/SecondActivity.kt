package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "SecondActivity passed onCreate", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity has passed onCreate")
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "SecondActivity passed onStart", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity has passed onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "SecondActivity passed onResume", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity has passed onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "SecondActivity passed onPause", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity has passed onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "SecondActivity passed onRestart", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity has passed onRestart")
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(this, "SecondActivity passed onStop", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity passed onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "SecondActivity passed onDestroy", Toast.LENGTH_SHORT).show()
        Log.i("Info", "SecondActivity passed onDestroy")
    }
}