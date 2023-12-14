fun main() {

    val ali = talaba()

    ali.ismi="Ali"
    ali.yil=2000
    ali.yoshi=23

    val vali = talaba()

    vali.ismi="Vali"
    vali.yil=2008
    vali.yoshi=15

    println(ali.ismi)


}

class talaba(){
    var ismi=""
    var yoshi=0
    var yil=0

    fun chiqar()
    {
        print(ismi)
    }
}