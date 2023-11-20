package com.example.mobileapppanda.ui.profile

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mobileapppanda.R

class ProfileFragment : Fragment() {
    @SuppressLint("InflateParams")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ViewModelProvider(this)[ProfileViewModel::class.java]

        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val btnShowDialog: Button = view.findViewById(R.id.show_dialog)
        btnShowDialog.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_form, null)
            val dialogForm = Dialog(requireContext())
            dialogForm.setContentView(dialogBinding)
            dialogForm.setCancelable(true)
            dialogForm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val tvName1: TextView = view.findViewById(R.id.tvName1)
            val etNameField1: EditText = dialogForm.findViewById(R.id.etNameField1)
            val tvName2: TextView = view.findViewById(R.id.tvName2)
            val etNameField2: EditText = dialogForm.findViewById(R.id.etNameField2)
            val tvName3: TextView = view.findViewById(R.id.tvName3)
            val etNameField3: EditText = dialogForm.findViewById(R.id.etNameField3)
            val tvAge: TextView = view.findViewById(R.id.tvAge)
            val etAgeField: EditText = dialogForm.findViewById(R.id.etAgeField)
            val tvTelephone: TextView = view.findViewById(R.id.tvTelephone)
            val etTelephoneField: EditText = dialogForm.findViewById(R.id.etTelephoneField)
            val tvEmail: TextView = view.findViewById(R.id.tvEmail)
            val etEmailField: EditText = dialogForm.findViewById(R.id.etEmailField)

            etNameField1.setText(tvName1.text)
            etNameField2.setText(tvName2.text)
            etNameField3.setText(tvName3.text)
            etAgeField.setText(tvAge.text)
            etTelephoneField.setText(tvTelephone.text)
            etEmailField.setText(tvEmail.text)

            dialogForm.show()

            val btnSaveUserData: Button = dialogForm.findViewById(R.id.btn_save_user_data)
            btnSaveUserData.setOnClickListener {
                tvName1.text = etNameField1.text
                tvName2.text = etNameField2.text
                tvName3.text = etNameField3.text
                tvAge.text = etAgeField.text
                tvTelephone.text = etTelephoneField.text
                tvEmail.text = etEmailField.text

                dialogForm.dismiss()
            }
        }

        return view
    }
}