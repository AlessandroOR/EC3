package com.alessandroorozco.ec3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alessandroorozco.ec3.R

import com.alessandroorozco.ec3.databinding.FragmentTheboysListBinding

class TheboysListFragment : Fragment() {

    private lateinit var binding: FragmentTheboysListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentTheboysListBinding.inflate (inflater,container,false  )
        return binding.root


    }


}