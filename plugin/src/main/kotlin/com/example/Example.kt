import java.nio.file.Path
import kotlin.io.path.writeText

fun thisWorks() {
    Path.of("thisWorks").toFile().writeText("Hello World")
}

fun thisDoesNotWork() {
    Path.of("thisDoesNotWork").writeText("Hello World")
}