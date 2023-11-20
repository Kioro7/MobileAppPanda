package com.example.mobileapppanda.ui.tariffPlans

import android.app.Dialog
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
import androidx.lifecycle.ViewModelProvider
import com.example.mobileapppanda.R
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

        val showTariff2: CardView = root.findViewById(R.id.show_tariff2)
        showTariff2.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_tariff2, null)
            val dialogForm = Dialog(requireContext())
            dialogForm.setContentView(dialogBinding)
            dialogForm.setCancelable(true)
            dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogForm.show()

            val btnBuyTariff1: Button = dialogForm.findViewById(R.id.btn_buy_tariff2)
            btnBuyTariff1.setOnClickListener {
                dialogForm.dismiss()
            }
        }

        val showTariff3: CardView = root.findViewById(R.id.show_tariff3)
        showTariff3.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_tariff3, null)
            val dialogForm = Dialog(requireContext())
            dialogForm.setContentView(dialogBinding)
            dialogForm.setCancelable(true)
            dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogForm.show()

            val btnBuyTariff1: Button = dialogForm.findViewById(R.id.btn_buy_tariff3)
            btnBuyTariff1.setOnClickListener {
                dialogForm.dismiss()
            }
        }

        val showTariff4: CardView = root.findViewById(R.id.show_tariff4)
        showTariff4.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_tariff4, null)
            val dialogForm = Dialog(requireContext())
            dialogForm.setContentView(dialogBinding)
            dialogForm.setCancelable(true)
            dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogForm.show()

            val btnBuyTariff1: Button = dialogForm.findViewById(R.id.btn_buy_tariff4)
            btnBuyTariff1.setOnClickListener {
                dialogForm.dismiss()
            }
        }

        val showTariff5: CardView = root.findViewById(R.id.show_tariff5)
        showTariff5.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_tariff5, null)
            val dialogForm = Dialog(requireContext())
            dialogForm.setContentView(dialogBinding)
            dialogForm.setCancelable(true)
            dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogForm.show()

            val btnBuyTariff1: Button = dialogForm.findViewById(R.id.btn_buy_tariff5)
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