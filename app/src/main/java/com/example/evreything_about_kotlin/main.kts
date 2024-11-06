import java.io.BufferedReader
import java.io.InputStreamReader

fun runCommand(command: String): String {
    val process = ProcessBuilder(*command.split(" ").toTypedArray())
        .redirectErrorStream(true)
        .start()

    val output = StringBuilder()
    BufferedReader(InputStreamReader(process.inputStream)).use { reader ->
        reader.lines().forEach { output.append(it).append("\n") }
    }

    process.waitFor() // Process'in tamamlanmasını bekler
    return output.toString()
}

fun main() {
    val command = "ls" // Linux/Mac için. Windows için "dir" olabilir
    val output = runCommand(command)
    println(output)
}
