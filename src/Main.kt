//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
nameSum(7,8)
    calculateFactorial(5)
    reverseString("kenya")



}
fun nameSum(a:Int,b:Int):Int{
    var c=a+b
    println(c)
    return c
}
fun calculateFactorial(k:Int):Int{
    var f = 1
    for(e in 1..k){
       f *= e
    }
    println(f)
    return f//return outside so that it does not loop

}
fun reverseString(word:String):String{
    var g = ""
    for( y in word.length - 1 downTo 0){
        g+= word[y]
    }
    println(g)
    return g
}


