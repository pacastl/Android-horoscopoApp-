package com.pacastl.horoscopoapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pacastl.horoscopoapp.R
import com.pacastl.horoscopoapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    private var _binding: FragmentHoroscopeBinding? = null

    //    Cuando se pida binding lo que ahces es devolver _binding porque cuadno alguien queira acceder al binding, accede al
    //    no tiene "_" y ese es fijo, no se puede romper. El otro sí que se puede modificar y romper
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
}