package one

import kotlinx.serialization.Serializable

@Serializable
data class Project(val name: String, val language: String)

fun main() {
    Project.serializer()
}