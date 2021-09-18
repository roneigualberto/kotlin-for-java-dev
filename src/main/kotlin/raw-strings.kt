fun main() {

    val title = "Title"
    val htmlContent = """ 
       |<html>
       | <h1>$title</h1> 
       |<html>
    """.trimMargin()

    println(htmlContent)
}