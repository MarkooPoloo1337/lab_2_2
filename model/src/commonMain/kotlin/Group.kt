package ru.altmanea.edu.server.model

import kotlinx.serialization.*

@Serializable
class Group(
    val name: String,
    val students: List<Student>
)