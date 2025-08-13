package org.example.project

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContent {
           var searchbarState by remember {
               mutableStateOf("")
           }
           val navController = rememberNavController()
           val startDestination = MatchesScreen
           NavHost(
               navController = navController,
               startDestination = MatchesScreen,
           ){
               composable<MatchesScreen>{
                   Scaffold (
                       modifier = Modifier.fillMaxSize().padding(top = 30.dp)

                   ){
                       Row (modifier = Modifier.fillMaxWidth()){
                           Column (
                               modifier = Modifier.fillMaxWidth(0.2f)
                                   .padding(start = 20.dp)
                           ) {
                               NavigationRail {
                                   NavigationRailItem(
                                       selected = true,
                                       onClick = {},
                                       icon = {
                                           Icon(
                                               imageVector = Icons.Filled.AddLocation,
                                               contentDescription = "Matches",
                                               tint = Color(0f,0f,0f, 1f),
                                               modifier = Modifier.size(30.dp)
                                           )
                                       },

                                   )
                                   NavigationRailItem(
                                       selected = false,
                                       onClick = {},
                                       icon = {
                                           Icon(
                                               imageVector = Icons.Filled.Checklist,
                                               contentDescription = "Scouting Forms",
                                               tint = Color(0f,0f,0f, 1f),
                                               modifier = Modifier.size(30.dp)
                                           )
                                       },
                                       )
                                   NavigationRailItem(
                                       selected = false,
                                       onClick = {},
                                       icon = {
                                           Icon(
                                               imageVector = Icons.Filled.Schedule,
                                               contentDescription = "Schedule",
                                               tint = Color(0f,0f,0f, 1f),
                                               modifier = Modifier.size(30.dp)
                                           )
                                       },

                                       )
                                   NavigationRailItem(
                                       selected = false,
                                       onClick = {},
                                       icon = {
                                           Icon(
                                               imageVector = Icons.Filled.Person,
                                               contentDescription = "Your Matches",
                                               tint = Color(0f,0f,0f, 1f),
                                               modifier = Modifier.size(30.dp)
                                           )
                                       },

                                       )
                                   NavigationRailItem(
                                       selected = false,
                                       onClick = {},
                                       icon = {
                                           Icon(
                                               imageVector = Icons.Filled.AdminPanelSettings,
                                               contentDescription = "Admin Controls",
                                               tint = Color(0f,0f,0f, 1f),
                                               modifier = Modifier.size(30.dp)
                                           )
                                       },

                                       )
                               }
                           }
                           Column (
                               modifier = Modifier.fillMaxWidth().padding(end = 15.dp)


                           ) {
                               Row (
                                   modifier = Modifier.fillMaxWidth(),
                                   verticalAlignment = Alignment.CenterVertically,
                                   horizontalArrangement = Arrangement.Center
                               ) {
                                   TextField(
                                       modifier = Modifier.fillMaxWidth(0.7f),
                                       value = searchbarState,
                                       label = {
                                           Text("Search Matches")
                                       },
                                       onValueChange = {
                                           searchbarState = it
                                       },
                                       singleLine = true,

                                       )
                                   Button(
                                       modifier = Modifier,
                                       colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                       onClick = {}

                                   ) {
                                       Icon(
                                           imageVector = Icons.Filled.Search,
                                           contentDescription = "Search",
                                           tint = Color(0f,0f,0f, 1f),
                                           modifier = Modifier.size(30.dp)
                                       )
                                   }
                               }

                           }
                       }


                   }
               }

           }




        }
    }
}
@Serializable
object MatchesScreen


