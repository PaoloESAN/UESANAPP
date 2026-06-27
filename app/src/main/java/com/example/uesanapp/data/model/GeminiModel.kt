package com.example.uesanapp.data.model

data class Part(
    val text: String
)

data class Content(
    val parts: List<Part>
)

data class GeminiRequest(
    val content: List<Content>
)

data class Cantidate(
    val content: Content
)

data class GeminiResponse(
    val cantidate: List<Cantidate>
)