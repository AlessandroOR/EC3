package com.alessandroorozco.ec3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alessandroorozco.ec3.R
import com.alessandroorozco.ec3.databinding.FragmentTheboysAffiliationsBinding
import com.alessandroorozco.ec3.databinding.FragmentTheboysListBinding


class TheboysAffiliationsFragment : Fragment() {

    private lateinit var binding:FragmentTheboysAffiliationsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentTheboysAffiliationsBinding.inflate (inflater,container,false  )
        return binding.root
    }
    }


