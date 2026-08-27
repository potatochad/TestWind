package com.productivity.testwind

import com.productivity.testwind.Imports.Utils.Log.*
import com.productivity.testwind.Imports.Utils.Generic_list.*
import com.productivity.testwind.Imports.Utils.Renames.*
import com.productivity.testwind.Imports.Utils.AppsAndDevice.*
import com.productivity.testwind.Imports.Utils.NavControl.*
import com.productivity.testwind.Imports.Utils.ToX.*
import com.productivity.testwind.Imports.Utils.String.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.material.icons.Icons
import com.productivity.testwind.Imports.*
import androidx.compose.material.icons.outlined.*
import com.productivity.testwind.Imports.Utils.*
import com.productivity.testwind.Imports.UI_visible.*



@Composable
fun Achievements() {
    LazyScreen("Achievements") {
            
        LazyItem(
            icon = { Icon.Edit() },
            title = "Typed letters",
            endUI = {
                Text("${toHumanReadableAmountWritten(Bar.LettersTyped)}")
            }
        )
    }
}
