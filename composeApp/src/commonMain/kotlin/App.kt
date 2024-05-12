import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlingb.KotlinGB
import kotlingb.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Preview
@Composable
fun App() {
    MaterialTheme {
        LaunchedEffect(Unit) {
            val kotlinGB = KotlinGB()

            val bytes = Res.readBytes("files/hello-world.gb")
            kotlinGB.start(bytes)
        }

        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("hello, world")
        }
    }
}
