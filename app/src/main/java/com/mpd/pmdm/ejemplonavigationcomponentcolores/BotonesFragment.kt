package com.mpd.pmdm.ejemplonavigationcomponentcolores

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.mpd.pmdm.ejemplonavigationcomponentcolores.databinding.FragmentBotonesBinding


/**
 * A simple [Fragment] subclass.
 */
class BotonesFragment : Fragment() {
    private var _binding: FragmentBotonesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBotonesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRojo.setOnClickListener {
            val action = BotonesFragmentDirections.actionBotonesFragmentToColorFragment(Color.RED)
            view.findNavController().navigate(action)
        }

        binding.btnVerde.setOnClickListener {
            val action = BotonesFragmentDirections.actionBotonesFragmentToColorFragment(Color.GREEN)
            view.findNavController().navigate(action)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}