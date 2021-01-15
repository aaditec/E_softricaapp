package com.example.e_softwarica.Fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.e_softwarica.R

class AddFragment : Fragment() {
    private lateinit var btnSave: Button
    private lateinit var edtFullName: EditText
    private lateinit var edtAge: EditText
    private lateinit var edtAddress: EditText
    private lateinit var rdoMale: RadioButton
    private lateinit var rdoFemale: RadioButton
    private lateinit var rdoOther: RadioButton
    private lateinit var gender: String
    var img: Int = 0
    private lateinit var tvGender: TextView
    private lateinit var rdoGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        tvGender = view.findViewById(R.id.tvGender)
        edtFullName = view.findViewById(R.id.edtFullName)
        edtAge = view.findViewById(R.id.edtAge)
        edtAddress = view.findViewById(R.id.edtAddress)
        rdoGroup = view.findViewById(R.id.rdoGroup)
        rdoMale = view.findViewById(R.id.rdoMale)
        rdoFemale = view.findViewById(R.id.rdoFemale)
        rdoOther = view.findViewById(R.id.rdoOther)
        btnSave = view.findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            edtFullName.text.toString()
            edtAddress.text.toString()
            edtAge.text.toString()

            if (rdoMale.isChecked) {
                img = R.drawable.mann
                gender = "male"
                rdoMale.isSelected = false
                rdoMale.isChecked = false
            }
            if (rdoFemale.isChecked) {
                gender = "female"
                img = R.drawable.female
                rdoFemale.isSelected = false
                rdoFemale.isChecked = false
            } else if (rdoOther.isChecked) {
                gender = "other"
                img = R.drawable.mann
                rdoOther.isSelected = false
                rdoOther.isChecked = false
            }
            // HomeFragment.list.add(StudentModel(img, fullname, Address, Age, R.drawable.delete, gender))
        }

        edtFullName.setText("")
        edtAddress.setText("")
        edtAge.setText("")
        Toast.makeText(activity, "Successfully Saved ! ", Toast.LENGTH_SHORT)
                .show()

        return view
    }

    private fun validate(): Boolean {
        var flag = true
        val isSelected = rdoGroup.checkedRadioButtonId
        when {
            TextUtils.isEmpty(edtFullName.text.toString()) -> {
                edtFullName.error = "Enter your full name!"
                edtFullName.requestFocus()
                flag = false
            }
            TextUtils.isEmpty(edtAge.text.toString()) -> {
                edtAge.error = "Enter your age!"
                edtAge.requestFocus()
                flag = false
            }
            isSelected == -1 -> {
                tvGender.error = "Select your gender!"
                tvGender.requestFocus()
                flag = false
            }
            TextUtils.isEmpty(edtAddress.text.toString()) -> {
                edtAddress.error = "Enter your address!"
                edtAddress.requestFocus()
                flag = false

            }
        }
        return flag
    }
}

