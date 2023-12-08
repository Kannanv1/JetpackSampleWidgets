package com.example.jetpacksamplewidgets

import android.os.Bundle
import android.view.RoundedCorner
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacksamplewidgets.ui.theme.JetpackSampleWidgetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackSampleWidgetsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextFiledwidgetAll()
                }
            }
        }
    }

    @Composable
    private fun TextFiledwidgetAll() {
        var firstName by remember { mutableStateOf("") }
        var secondName by remember { mutableStateOf("") }
        var passwordtxt by remember { mutableStateOf("") }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            TextField(value = firstName, onValueChange = { firstName = it },
                label = { Text(text = "FirstName") })

            OutlinedTextField(value = secondName, onValueChange = {secondName= it
            }, label = { Text(text = "LastName")})
            TextField(
                value = passwordtxt,
                onValueChange = {passwordtxt=it},
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                label = { Text(text = "Password")})

            Text(text = "$firstName $secondName $passwordtxt" )


        }


    }

    @Preview(showBackground = true)
    @Composable
    fun JetpackSampleWidgetsTheme() {
        TextFiledwidgetAll()
    }


}



