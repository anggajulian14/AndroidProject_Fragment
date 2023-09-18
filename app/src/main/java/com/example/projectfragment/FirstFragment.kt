package com.example.projectfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.projectfragment.databinding.ActivityMainBinding
import com.example.projectfragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        val myButton = binding.btnFirstFragment

        myButton.setOnClickListener {
            Toast.makeText(activity,"First Fragment",Toast.LENGTH_SHORT).show()
        }

        return view
    }
}

