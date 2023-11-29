import java.util.*

fun main() {
    val kiritish = Scanner(System.`in`)
    val matn = kiritish.next()
    var rost = false
    var nuqta = false
    var haqiqiy = false
    for (i in matn.indices) {

        if (matn[i] == '.') {
            nuqta = true
        }
        if (matn[i].code >= 48 && matn[i].code <= 57) {
            rost = true
        } else if (!(matn[i].code >= 48 && matn[i].code <= 57) && matn[i] != '.') {
            rost = false
            break
        }


    }

    if (rost && !nuqta) {
        print("$matn bu son butun son")
    } else if (rost && nuqta) {
        println("$matn bu son haqiqiy son")
    } else {
        println("0")
    }


}