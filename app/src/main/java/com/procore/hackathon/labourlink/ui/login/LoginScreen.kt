package com.procore.hackathon.labourlink.ui.login

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.procore.hackathon.labourlink.MainActivity
import com.procore.hackathon.labourlink.R


@Composable
fun LoginScreen(
    onLoginClicked: (String, String) -> Unit,
    onSignUpClicked: () -> Unit,
    viewModel: LoginViewModel
) {
    var email by remember { mutableStateOf("james.mathew@example.com") }
    var password by remember { mutableStateOf("password123") }
    val loginResult by viewModel.loginResult.observeAsState()
    val context = LocalContext.current // Obtain the context in a composable-safe way

    Surface(modifier = Modifier.fillMaxSize()) {
        Box(
                    modifier = Modifier.fillMaxSize(),
                                     //  .paint(painterResource(id = R.drawable.ic_labourlink),
                                     //   contentScale = ContentScale.Fit),
                    contentAlignment = Alignment.Center
        )
        {
            Card(
                shape = RoundedCornerShape(16.dp), // Increased corner radius for better visual appeal
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp), // Correct usage of CardElevation
                modifier = Modifier.padding(16.dp).fillMaxWidth(0.8f)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_labourlink),
                        contentDescription = "Labour Link",
                        modifier = Modifier.size(300.dp)
                    )
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        singleLine = true,
                        visualTransformation = if (password.isNotEmpty()) PasswordVisualTransformation() else VisualTransformation.None,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            if (email.isNotEmpty() && password.isNotEmpty()) {
                                onLoginClicked(email, password)
                                context.startActivity(Intent(context, MainActivity::class.java))
                                (context as Activity).finish()
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                    ) {
                        Text(text = "Login", color = Color.White)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    ClickableText(
                        text = AnnotatedString("Don't have an account? Sign Up"),
                        onClick = { onSignUpClicked() },
                        style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.primary)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ClickableText(
                        text = AnnotatedString("Forgot Password?"),
                        onClick = { onSignUpClicked() },
                        style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.primary)
                    )
                }
            }
        }
    }
}