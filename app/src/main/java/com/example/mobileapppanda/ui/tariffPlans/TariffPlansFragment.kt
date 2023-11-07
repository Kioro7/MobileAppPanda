package com.example.mobileapppanda.ui.tariffPlans

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mobileapppanda.databinding.FragmentTariffPlansBinding

class TariffPlansFragment : Fragment() {

    private var _binding: FragmentTariffPlansBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val tariffPlansViewModel =
            ViewModelProvider(this).get(TariffPlansViewModel::class.java)

        _binding = FragmentTariffPlansBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}