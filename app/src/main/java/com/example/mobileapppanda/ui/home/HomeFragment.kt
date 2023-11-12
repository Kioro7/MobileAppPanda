package com.example.mobileapppanda.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.mobileapppanda.MainActivity
import com.example.mobileapppanda.R
import com.example.mobileapppanda.databinding.FragmentHomeBinding
import com.example.mobileapppanda.ui.tariffPlans.TariffPlansFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    fun goToTariffPlans(view: View) {
//        val textView = view.findViewById<View>(R.id.goToTariffPlans)
//        textView.setOnClickListener {
//            val fragment = TariffPlansFragment()
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.nav_tariffPlans, fragment)?.commit()
//        }
//    }
}