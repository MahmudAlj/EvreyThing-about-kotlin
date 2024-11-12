println("hello world")
print("merhaba mahmud")

var age = 20 
val name = "mahmud" 

// data types
var hight : Float = 1.81 
val last_name : String = "code" 
var monay : Double = 22.654
val favo : Character = 't'
var yes : Boolean = True 
val ok : Integer = 4

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
println("hello my name is " $name $last_name) // bir dizinin icine degisken ekleme
//boolean: true or false 
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



//kosul yapilari