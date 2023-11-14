package com.example.mobileapppanda.ui.profile

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mobileapppanda.R

class ProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

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
                tvName1.setText(etNameField1.text)
                tvName2.setText(etNameField2.text)
                tvName3.setText(etNameField3.text)
                tvAge.setText(etAgeField.text)
                tvTelephone.setText(etTelephoneField.text)
                tvEmail.setText(etEmailField.text)

                dialogForm.dismiss()
            }
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}