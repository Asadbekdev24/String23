import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val kiritish = Scanner(System.`in`)
    val matn = kiritish.next()
    val qush_ayr=ArrayList<Char>()
    val son=ArrayList<Int>()
    var sum=0
 for( i in 0 until matn.length){
     if (matn[i].equals("+") || matn[i].equals("-")) {
         qush_ayr[i]=matn[i]
     }else{
         son[i]=matn[i].toInt()
     }
 }
    for (i in 0 until qush_ayr.size+1)
    {
        if (qush_ayr[i].equals("+")){
          sum = son[i]+son[i+1]
        }else if (qush_ayr[i].equals("-")){
            sum = son[i]-son[i+1]
        }
    }
    println("Javop")
    println(sum)



}