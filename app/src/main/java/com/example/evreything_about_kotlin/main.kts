fun main () { // fun is used to declare a Function main is where my program starts from 

println("hello world") // functioon print their arguments to stardard output 
print("merhaba mahmud")

var age = 20 //   mutable variables 
val name = "mahmud" // read_only variables 

// data types
var hight : Float = 1.81f 
val last_name : String = "code" 
var monay : Double = 22.654
val favo : Character = 't'
var yes : Boolean = True 
val ok : Int = 4

//veri turleri
//numbers:  Byte, short, integer, long, float, double, boolean
//characters: char 
//string 
var txt : String  = "hello world" 
var txt2 : String = "mahmud code"
println(txt[0]) // h
println(txt.Length) // bir stringin karakter sayısını yazdırır
println(txt.ToUpperCase()) // karakterleri buyuk harfe donusturur
println(txt.ToLowerCase()) // karakterleri kucuk karaktere donusturur 
println(txt.Compareto(txt2)) // iki diziyi karsilastirir ( eger aynıysa 0 dondurur) 
println(txt.IndexOf("world")) // bir karakter dızısındekı belırlı karekterı yazdirir
println(name.Plus(last_name)) // iki dizini birlestirir
println("hello my name is  $name $last_name") // bir dizinin icine degisken ekleme
//boolean: true or false 
// collection types: list , Sets, Maps
//array 
val kalbim : String = ArrayOf("mahmud", "sinem", "code")
    println(kalbim[0])
    println(kalbim.size)
    if("sinem" in kalbim){
        println("COK MUTLUSUN")
    }else{
        println("hayatin bokum gibi")
    }
    for(x in kalbim){
        println(x)
    }
val liste : String = ListOf ("maho" , "musti", "sino")
println(liste)

val sekiller : MultableList <String> = mutableListOf ( "ucgen", "kare", "daire")
println(sekiller)
 
//type conversion
val sayi : Int  = 20





//kosul yapilari
if()



}