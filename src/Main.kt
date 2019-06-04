package Practice;

fun main(){
    var input = readLine()
    val intResult : Int = input?.toInt() ?:0


    input?:"paster"               //                ?:  если слева 0 то дефолтное значение
    input!!.toInt()

    if(input!=null){
        input.toInt()
        input.capitalize()
    }

}

/*
fun Array<String>.megasplit(separator: String) : Array<String>{
    var sum = emptyArray<String>
    for (tenp in this){
        sum.plus(temp.split(separator))
    }
}*/