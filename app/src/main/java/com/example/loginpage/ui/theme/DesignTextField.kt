package com.example.loginpage.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.loginpage.user.AuthState
import androidx.compose.material3.Icon as Icon


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailTextField(
    state: String,
    onEvent: (String) -> Unit,
    showHint: String
) {
    Row {
        OutlinedTextField(
            value = state,
            onValueChange =  onEvent ,
            placeholder = { Text(text = showHint) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Email icon"
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.White,
                unfocusedLabelColor = Color.White,
                containerColor = Color.White

            ),
            modifier = Modifier
                .border(
                    BorderStroke(
                        width = 1.dp,
                        color = PurpleGrey40
                    ),
                    shape = RoundedCornerShape(50)
                )
                .weight(0.1f)
        )
    }
    Spacer(modifier = Modifier.padding(5.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserTextField(
    state: String,
    onEvent: (String) -> Unit,
    showHint: String
) {
    Row {
        OutlinedTextField(
            value = state,
            onValueChange =  onEvent ,
            placeholder = { Text(text = showHint) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = "Email icon"
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.White,
                unfocusedLabelColor = Color.White,
                containerColor = Color.White

            ),
            modifier = Modifier
                .border(
                    BorderStroke(
                        width = 1.dp,
                        color = PurpleGrey40
                    ),
                    shape = RoundedCornerShape(50)
                )
                .weight(0.1f)
        )
    }
    Spacer(modifier = Modifier.padding(5.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(
    state: String,
    onEvent: (String) -> Unit,
    showHint:String
) {
    Row {
        var showPassword by remember { mutableStateOf(false) }

        OutlinedTextField(
            value = state,
            onValueChange =  onEvent ,
            placeholder = { Text(text = showHint) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "Email icon"
                )
            },
            visualTransformation = if (showPassword) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                if (showPassword) {
                    IconButton(onClick = { showPassword = false }) {
                        Icon(
                            imageVector = Icons.Filled.Visibility,
                            contentDescription = "password"
                        )
                    }
                } else {
                    IconButton(onClick = { showPassword = true }) {
                        Icon(
                            imageVector = Icons.Filled.VisibilityOff,
                            contentDescription = "password"
                        )
                    }
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.White,
                unfocusedLabelColor = Color.White,
                containerColor = Color.White

            ),
            modifier = Modifier
                .border(
                    BorderStroke(
                        width = 1.dp,
                        color = PurpleGrey40
                    ),
                    shape = RoundedCornerShape(50)
                )
                .weight(0.1f)
        )
    }
    Spacer(modifier = Modifier.padding(5.dp))
}
