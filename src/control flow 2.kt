fun main(){
    println(isEven(25))
    println(isEven(24))
    println(Products("sunnlight",127.5,200.40,"soap"))
    println(Products("kales",2.5,35.50,"Vegetables"))
    println(indices("smart"))
    println(name(arrayOf("Gilly","Anne")))
}
fun isEven(p:Int):Boolean{
    if(p%2==0){
        return true
    }
    else{
        return false
    }
}
data class Products(var name:String,var weight:Double,var price:Double,var category:String){
    fun category(product:Products){
        var groceryList= mutableListOf<Products>()
        var hygieneList= mutableListOf<Products>()
        var otherList= mutableListOf<Products>()
        when(product.category){
            "groceries"->groceryList.add(product)
            "hygiene"->hygieneList.add(product)
            else->otherList.add(product)
        }
        println(groceryList)
        println(hygieneList)
        println(otherList)
    }
}
fun indices(trait:String):String{
    var character=" "
    trait.forEachIndexed{index,indices ->
        if(index %2==0 ){
            character+=indices
        }
    }
    return character
}
fun name(names:Array<String>):List<String>{
    var title= mutableListOf<String>()
    var count=0
    for(items in names){
        if (items.length%2==0){
            title.add(items)
        }}
    return title
}


