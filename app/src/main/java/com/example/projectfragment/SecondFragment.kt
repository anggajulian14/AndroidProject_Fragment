package com.example.projectfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.projectfragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root

        val myButton = binding.btnSecondFragment

        myButton.setOnClickListener {
            Toast.makeText(activity, "Second Fragment", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}

