package com.example.tugasregistrationform
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editEmail: EditText = findViewById(R.id.edit_email)
        val editFullname: EditText = findViewById(R.id.edit_fullname)
        val editUsername: EditText = findViewById(R.id.edit_username)
        val editPassword: EditText = findViewById(R.id.edit_pass)
        val btnSignup: Button = findViewById(R.id.btn_signup)

        btnSignup.setOnClickListener {
            val email = editEmail.text.toString()
            val fullname = editFullname.text.toString()
            val username = editUsername.text.toString()
            val password = editPassword.text.toString()

            Toast.makeText(this, "Email: $email\nFullname: $fullname\nUsername: $username\nPassword: $password", Toast.LENGTH_LONG).show()
        }
    }
}
