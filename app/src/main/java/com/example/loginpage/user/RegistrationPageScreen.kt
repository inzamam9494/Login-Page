package com.example.loginpage.user

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginpage.ui.theme.EmailTextField
import com.example.loginpage.ui.theme.PasswordTextField
import com.example.loginpage.ui.theme.Purple40
import com.example.loginpage.ui.theme.UserTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationPageScreen(
    state: AuthState,
    onEvent: (AuthEvent) -> Unit,
    onClickToLogin: (Int) -> Unit,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        Text(text = "Hey there,")
        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Create an Account",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.padding(10.dp))

        UserTextField(
            state = state.userName,
            showHint = "Username",
            onEvent = { onEvent(AuthEvent.Username(it)) })
        EmailTextField(
            state = state.email,
            showHint = "Email ID",
            onEvent = { onEvent(AuthEvent.Email(it)) })
        PasswordTextField(
            state = state.password,
            showHint = "Password",
            onEvent = { onEvent(AuthEvent.Password(it)) })

        PasswordTextField(
            state = state.confirmPassword,
            showHint = "Confirm Password",
            onEvent = { onEvent(AuthEvent.ConfirmPassword(it)) })

        Spacer(modifier = Modifier.weight(0.1f))

        Row {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(0.1f)
                    .height(50.dp)
            ) {
                Text(
                    text = "Register",
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }


        Spacer(modifier = Modifier.padding(5.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Already hava an account? ")
            ClickableText(
                text = AnnotatedString("Login"),
                onClick = onClickToLogin,
                style = TextStyle(
                    color = Purple40
                )
            )
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun RegistrationScreenPreview() {
    val sampleState = AuthState(
        email = "mohdinzmamaAhmad",
        password = "kdjfoisdjf"
    )
    MaterialTheme {

    }
}