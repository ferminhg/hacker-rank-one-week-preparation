import java.text.SimpleDateFormat
import java.util.*

fun timeConversion(s: String): String {
    val inputFormat = SimpleDateFormat("hh:mm:ssa", Locale.getDefault())
    val outputFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return outputFormat.format(inputFormat.parse(s))
}