package com.example.mobileapppanda.ui.home

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
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

        val goToTariffPlans: TextView = root.findViewById(R.id.goToTariffPlans)
        goToTariffPlans.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.main_home, TariffPlansFragment(), "TariffPlans").commit()
        }

        val showTariff1: CardView = root.findViewById(R.id.show_tariff1)
        showTariff1.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_tariff1, null)
            val dialogForm = Dialog(requireContext())
            dialogForm.setContentView(dialogBinding)
            dialogForm.setCancelable(true)
            dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogForm.show()

            val btnBuyTariff1: Button = dialogForm.findViewById(R.id.btn_buy_tariff1)
            btnBuyTariff1.setOnClickListener {
                dialogForm.dismiss()
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}