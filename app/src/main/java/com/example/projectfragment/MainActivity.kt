package com.example.projectfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.projectfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val fm: FragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnFirstFragment = binding.firstFragment
        val btnSecondFragment = binding.secondFragment

        btnFirstFragment.setOnClickListener {
            val fragment = FirstFragment()
            loadFragment(fragment)
        }

        btnSecondFragment.setOnClickListener {
            val fragment = SecondFragment()
            loadFragment(fragment)
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val FragmentTransaction = fm.beginTransaction()

        FragmentTransaction.replace(R.id.frameLayout,fragment)
        FragmentTransaction.commit()
    }
}




