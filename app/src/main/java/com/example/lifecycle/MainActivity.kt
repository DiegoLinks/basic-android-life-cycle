package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "MainActivity has passed onCreate", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity has passed onCreate")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "MainActivity has passed onStart", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity has passed onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "MainActivity has passed onResume", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity has passed onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "MainActivity has passed onPause", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity has passed onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "MainActivity has passed onRestart", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity has passed onRestart")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "MainActivity passed onStop", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity passed onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "MainActivity passed onDestroy", Toast.LENGTH_SHORT).show()
        Log.i("Info","MainActivity passed onDestroy")
    }
}