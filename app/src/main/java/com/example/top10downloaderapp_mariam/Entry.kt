package com.example.top10downloaderapp_mariam

class Entry {
    var name: String = ""
    override fun toString(): String {
        return """
            name = $name
           """.trimIndent()
    }
}
