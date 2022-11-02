package com.example.pr18_19plahotnyyg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var TextChapter : TextView;
    lateinit var Drawer :DrawerLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TextChapter = findViewById(R.id.MainText)
        Drawer = findViewById(R.id.drawer)
    }
    fun ShowToast(text : String)
    {
        val message = Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
    fun onClick(view: View)
    {
        fun changeTextAndCloseMenu(text:String)
        {
            TextChapter.setText(text)
            Drawer.closeDrawer(GravityCompat.START)
        }
        when(view.id)
        {
            R.id.row1 -> changeTextAndCloseMenu(getString(R.string.chapter1))
            R.id.row2 -> changeTextAndCloseMenu(getString(R.string.chapter2))
            R.id.row3 -> changeTextAndCloseMenu(getString(R.string.chapter3))
            R.id.row4 -> changeTextAndCloseMenu(getString(R.string.chapter4))
            R.id.row5 -> changeTextAndCloseMenu(getString(R.string.chapter5))
            R.id.row6 -> changeTextAndCloseMenu(getString(R.string.chapter6))
            R.id.row7 -> changeTextAndCloseMenu(getString(R.string.chapter7))
            R.id.row8 -> changeTextAndCloseMenu(getString(R.string.chapter8))
            R.id.content -> Drawer.openDrawer(GravityCompat.START)
        }
    }
}