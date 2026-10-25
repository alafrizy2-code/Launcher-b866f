package com.family.launcher
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FamilyLauncherUI() }
    }
}

@Composable
fun FamilyLauncherUI() {
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF0a1628))) {
        Column(modifier = Modifier.fillMaxSize().padding(32.dp)) {
            Text("Google TV 14:32  Thu, 12 Sep", color = Color.White, fontSize = 22.sp)
            Spacer(Modifier.height(24.dp))
            Row(Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.width(240.dp).fillMaxHeight()
                        .background(Color(0xCC1a1a1a), RoundedCornerShape(20.dp))
                        .padding(16.dp)
                ) {
                    Text("MODDABLE Launcher", color = Color.White)
                    Spacer(Modifier.height(16.dp))
                    MenuItem("Home", true)
                    MenuItem("YouTube", false)
                    MenuItem("YouTube Music", false)
                    MenuItem("Netflix", false)
                    MenuItem("Plex", false)
                    MenuItem("Files", false)
                }
                Spacer(Modifier.width(24.dp))
                Box(modifier = Modifier.weight(1f).fillMaxHeight()
                    .background(Color(0xFF1e3a5f), RoundedCornerShape(16.dp)))
            }
        }
    }
}

@Composable
fun MenuItem(name: String, selected: Boolean) {
    Box(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            .background(
                if (selected) Color(0xFF4f75ff) else Color.Transparent,
                RoundedCornerShape(12.dp)
            ).padding(12.dp)
    ) {
        Text(name, color = Color.White, fontSize = 16.sp)
    }
}
