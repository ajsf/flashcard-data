package tech.ajsf.flashcards

import kotlinx.serialization.json.Json
import kotlinx.serialization.list
import java.io.File

fun main() {
    val data = allFlashcards()
    val json = Json.stringify(Flashcard.serializer().list, data)
    val filepath = "flashcards.json"
    File(filepath).writeText(json)
}