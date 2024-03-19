package elmer.arredondo.sqlite.presentacion

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import elmer.arredondo.sqlite.data.Note

data class NoteState(

    val notes: List<Note> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description: MutableState<String> = mutableStateOf("")

)