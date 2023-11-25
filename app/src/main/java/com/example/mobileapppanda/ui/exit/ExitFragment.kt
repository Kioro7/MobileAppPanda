package com.example.mobileapppanda.ui.exit

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mobileapppanda.LoginActivity
import com.example.mobileapppanda.R

class ExitFragment : Fragment() {
    @SuppressLint("InflateParams")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ViewModelProvider(this)[ExitViewModel::class.java]

        val dialogBinding = layoutInflater.inflate(R.layout.dialog_exit, null)
        val dialogForm = Dialog(requireContext())
        dialogForm.setContentView(dialogBinding)
        dialogForm.setCancelable(true)
        dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogForm.show()

        val btnExit: Button = dialogForm.findViewById(R.id.btn_exit)
        btnExit.setOnClickListener {
            dialogForm.dismiss()
            val context: Context? = context
            val intent = Intent(context, LoginActivity::class.java)
            context?.startActivity(intent)
        }

        val btnHome: Button = dialogForm.findViewById(R.id.btn_home)
        btnHome.setOnClickListener {
            dialogForm.dismiss()
            activity?.supportFragmentManager?.popBackStack()
        }

        return inflater.inflate(R.layout.fragment_exit, container, false)
    }
}