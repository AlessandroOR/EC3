package com.alessandroorozco.ec3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alessandroorozco.ec3.R
import com.alessandroorozco.ec3.databinding.FragmentTheboysAffiliationsBinding
import com.alessandroorozco.ec3.databinding.FragmentTheboysEpisodesBinding


class TheboysEpisodesFragment : Fragment() {

    private lateinit var binding: FragmentTheboysEpisodesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentTheboysEpisodesBinding.inflate (inflater,container,false  )
        return binding.root
    }
}