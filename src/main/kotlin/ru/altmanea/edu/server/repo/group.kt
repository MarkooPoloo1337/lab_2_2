package ru.altmanea.edu.server.repo

import ru.altmanea.edu.server.model.Student
import ru.altmanea.edu.server.model.Config
import ru.altmanea.edu.server.model.Group

val groupRepo = ListRepo<Group>()

val groupTestData = Group(
    "Группа 29з",
    listOf(
        Student("Иван", "Иванович")
    )
)


