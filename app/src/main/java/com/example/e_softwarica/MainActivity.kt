package com.example.e_softwarica
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.e_softwarica.Fragments.AboutFragment
import com.example.e_softwarica.Fragments.HomeFragment


class MainActivity : AppCompatActivity() {
    private lateinit var edtUserName: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtUserName = findViewById(R.id.edtUserName)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(object : View.OnClickListener {
            private fun validate(): Boolean {
                var flag = true
                if (TextUtils.isEmpty(edtUserName.text.toString())) {
                    edtUserName.error = "Enter username!"
                    edtUserName.requestFocus()
                    flag = false
                } else if (TextUtils.isEmpty(edtPassword.text.toString())) {
                    edtPassword.error = "Enter the password!"
                    edtPassword.requestFocus()
                    flag = false
                }
                return flag

            }

            override fun onClick(v: View?) {
                if (validate()) {
                    val username = edtUserName.getText().toString()
                    val password = edtPassword.getText().toString()
                    when {
                        "softwarica" != username -> {
                            edtUserName.error = "Invalid username!"
                            edtUserName.requestFocus()
                        }
                        "coventry" != password -> {
                            edtPassword.error = "Invalid password!"
                            edtPassword.requestFocus()
                        }

                    }
                }
            }
        })
        val intent = Intent(this@MainActivity, Display::class.java)
        startActivity(intent)
    }
}
