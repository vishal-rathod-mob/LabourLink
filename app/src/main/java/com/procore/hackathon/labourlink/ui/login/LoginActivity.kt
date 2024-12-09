package com.procore.hackathon.labourlink.ui.login

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels


class LoginActivity: ComponentActivity() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LoginScreen(
                onLoginClicked = { email, password ->
                    viewModel.login(email, password)
                },
                onSignUpClicked = {
                    Toast.makeText(this, "Navigate to Sign-Up Screen", Toast.LENGTH_SHORT).show()
                },
                viewModel = viewModel
            )
        }
    }
}