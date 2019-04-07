package tech.ajsf.flashcards

import kotlinx.serialization.Serializable

@Serializable
data class Flashcard(val question: String, val answer: String, val category: String)