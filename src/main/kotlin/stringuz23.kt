import java.util.*


fun main() {
    val kiritish = Scanner(System.`in`)
    val matn = kiritish.next()

    var amalSoni = 0
    var raqamSoni = 0

    for (i in matn.indices) {
        if (matn[i] == '+' || matn[i] == '-') {
            amalSoni++
        } else {
            raqamSoni++
        }
    }

    val raqam = IntArray(raqamSoni)
    val belgi = CharArray(amalSoni)
    var summa = 0
    var k = 0
    var f = 0

    for (i in matn.indices) {
        when (matn[i]) {
            '0' -> raqam[k++] = 0
            '1' -> raqam[k++] = 1
            '2' -> raqam[k++] = 2
            '3' -> raqam[k++] = 3
            '4' -> raqam[k++] = 4
            '5' -> raqam[k++] = 5
            '6' -> raqam[k++] = 6
            '7' -> raqam[k++] = 7
            '8' -> raqam[k++] = 8
            '9' -> raqam[k++] = 9
            '+' -> belgi[f++] = '+'
            '-' -> belgi[f++] = '-'

        }
    }

    summa += raqam[0]
    for (i in 1..raqam.size - 1) {
        if (belgi[i - 1] == '+') {
            summa += raqam[i]
        } else {
            summa -= raqam[i]
        }
    }



    println(summa)
}