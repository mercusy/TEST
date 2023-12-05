import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MyViewModel : ViewModel() {

    var name by mutableStateOf("")
    var token by mutableStateOf("")

    val dialogState = mutableStateOf(false)
}
