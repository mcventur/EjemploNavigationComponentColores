package com.mpd.pmdm.ejemplonavigationcomponentcolores

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.navigation.fragment.navArgs
import com.mpd.pmdm.ejemplonavigationcomponentcolores.databinding.FragmentColorBinding

/**
 * A simple [Fragment] subclass.
 */
class ColorFragment : Fragment() {
    private var _binding: FragmentColorBinding? = null
    private val binding get() = _binding!!
    private val args: ColorFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentColorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bgColor = args.bgColor
        updateColor(bgColor)
    }


    fun updateColor(@ColorInt color: Int){
        binding.layoutColor.setBackgroundColor(color)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}