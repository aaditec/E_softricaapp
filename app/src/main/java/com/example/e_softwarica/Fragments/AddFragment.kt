package com.example.e_softwarica.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_softwarica.R
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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
        btnSave.setOnClickListener(object : View.OnClickListener {
            private fun validate(): Boolean {
                var flag = true
                val isSelected = rdoGroup.getCheckedRadioButtonId()
                if (TextUtils.isEmpty(edtFullName.getText().toString())) {
                    edtFullName.setError("Enter your full name!")
                    edtFullName.requestFocus()
                    flag = false
                } else if (TextUtils.isEmpty(edtAge.getText().toString())) {
                    edtAge.setError("Enter your age!")
                    edtAge.requestFocus()
                    flag = false
                } else if (isSelected == -1) {
                    tvGender.setError("Select your gender!")
                    tvGender.requestFocus()
                    flag = false
                } else if (TextUtils.isEmpty(edtAddress.getText().toString())) {
                    edtAddress.setError("Enter your address!")
                    edtAddress.requestFocus()
                    flag = false
                }
                return flag
            }

            override fun onClick(v: View?) {
                if (validate()) {
                    val fullname = edtFullName.getText().toString()
                    val Address = edtAddress.getText().toString()
                    val Age = edtAge.getText().toString()
                    if (v.getId() === R.id.btnSave) {
                        if (rdoMale.isChecked()) {
                            img = R.drawable.mann
                            gender = "male"
                            rdoMale.setSelected(false)
                            rdoMale.setChecked(false)
                        }
                        if (rdoFemale.isChecked()) {
                            gender = "female"
                            img = R.drawable.female
                            rdoFemale.setSelected(false)
                            rdoFemale.setChecked(false)
                        } else if (rdoOther.isChecked()) {
                            gender = "other"
                            img = R.drawable.mann
                            rdoOther.setSelected(false)
                            rdoOther.setChecked(false)
                        }
                        // HomeFragment.list.add(StudentModel(img, fullname, Address, Age, R.drawable.delete, gender))
                    }
                    edtFullName.setText("")
                    edtAddress.setText("")
                    edtAge.setText("")
                    Toast.makeText(getActivity(), "Successfully Saved ! ", Toast.LENGTH_SHORT)
                        .show()
                }

        })

    }
}