package com.example.checkfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.checkfrag.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val binding =DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val binding =DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val navController=this.findNavController(R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=this.findNavController(R.id.fragment)
        return navController.navigateUp()
    }
}