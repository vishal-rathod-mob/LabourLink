package com.procore.hackathon.labourlink.ui.login

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.procore.hackathon.labourlink.ui.theme.AppTheme


class LoginActivity: ComponentActivity() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
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
    }
}