import java.util.*

fun main() {

    val matn= readLine()!!


    var text=""

    text+=matn[0].uppercase()

    // salom dada.men keldim
    for (i in 1 until matn.length)
    {
        if(matn[i-1]=='.')
        {
            text+=matn[i].uppercase()
        }else
        {
            text+=matn[i]
        }
    }


    println(text)


}