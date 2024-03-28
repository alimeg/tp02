import java.util.Scanner

const val PI = 3.14159

fun main() {

    val a = "immut"
    var b = "mut"

    //a = "immut_modif"// val cannot be reassigned
    b = "mut_modif"
    println("a=$a et b = $b et la constante: $PI")

    // const val PI = 3.14159 //is not applicable to 'local variable', elle doit etre declaree en dehors du main()
    var name = "Ali" // variable never modified so it can be declared as val

    println(name)


    //exo2
// bonne reference: https://www.pandacodeur.com/pages/tutoriels/kotlin/cours-kotlin-les-types-de-donnees.html
    var octet: Byte = 45
    var petit: Short = 45
    var age: Int = 45
    var grand: Long = 45
    var decimal_petit: Float = 1.2F
    var deciaml: Double = 0.0

    var carac: Char = 'A'

    var test: Boolean = true

    if (test) {

        println(
            "Byte:$octet\n Short: $petit\n Int: $age\n Long: $grand\n " +
                    "Float: $decimal_petit\n Double: $deciaml\n Char: $carac\n Boolean: $test\n"
        )
    }

    // exo3
//01
    var monNom: String = "Ali"

    println("La longueur de mon nom est: ${monNom.length}")
//02
    var monNomMinuscule = "ali"
    println(monNomMinuscule.toUpperCase()) // obselete, utilisez uppercase() a la place
//03
    var phrase = "cette phrase contient plusieurs mots separes par des espaces"

    var liste = phrase.split(" ")

    println(liste)

    // Exo 4 :Structure de donnees
    //01
    val fruits = listOf("fraise", "banane", "orange", "pomme", "kiwi", "ananas")

    for (fruit in fruits)
        println(fruit)

    //02 https://developer.android.com/codelabs/basic-android-kotlin-collections?hl=fr#3
    val collectionEntiers = mutableSetOf(2, 5, 10, 11, 90)
    collectionEntiers.add(4)
    println(collectionEntiers.size)
    collectionEntiers.add(5) // il ne sera pas ajoute car la collection assure l'unicite a l'interieur deses elements
    println(collectionEntiers.size)
    println(collectionEntiers)
    //03 MAp

    val paysCapitale = mapOf("France" to "Paris", "Allemagne" to "Berlin", "Espagne" to "Madrid")

    println(paysCapitale["France"])

    /////Exo 5 Les structures de décisions

    //01
    val scan = Scanner(System.`in`)

    print("Introduisez un entier de votre choix: ")

    var x = scan.nextInt()

    if (x < 0) {

        println("x est negatif et sa valeur est : $x")
    }
    else if(x == 0){
        println("x est nul et sa valeur est : $x")
    }
    else println("x est positif et sa valeur est : $x")

    //02: when jour de 1 a 7
    print("Introduisez un nombre entre 1 et 7: ")
    var jour = scan.nextInt()

    when(jour){

        1 -> println("Lundi")
        2 -> println("Mardi")
        3 -> println("Mercredi")
        4 -> println("Jeudi")
        5 -> println("Vendredi")
        6 -> println("Samedi")
        7 -> println("Dimanche")
        else -> println("veuillez introduire le bon nombre")

    }
    //03 range avec whenaffichage d'un nombre

    print("Introduisez un nombre : ")

    var cat = scan.nextInt()

    when(cat){

        in 1..9 -> println("1")
        in 10..99 -> println("10")
        in 100..999 -> println("100")

        else -> println("out of range")

    }


    //Exo 6 : Les structures de répétitions

    //01

    for(nbr in 1..10)
        print("$nbr" + " ")

    println("\nfin du exo6 : 01")

    //02 nombres pairs de 0 a 20 avec une boucle while

    var i : Int = 0

    while(i<=20) {
        if (i % 2 == 0) {
            print("$i" +" ")
        }
        i++
    }
    println("\nOn passe aux nombres impairs a travers le do while:")

    //03 do while les chiffres impairs
var it = 1
    do{
            if(it%2 != 0) {
                print("$it" + " ")
            }
        it++

    }while(it <= 19)
println("\nOn passe a l'exo7 ****")
    //Exo 07 Les objets

   // 01 class

    class Person{

        var name : String =""

        fun greet(nom:String):String {
            return "Hello $nom"
        }

    }

    var person = Person()

    println("veuillez introduire votre prenom")
    var votrePrenom = scan.next()
    println(person.greet(votrePrenom))

    //03 ajouter un parametre a la classe Person avec un contructorqui initialise name a name
    // a changer Person1 et name 1 a name et Person quand on les met chacun dans un fichier

    class Person1 {
        var name1: String = ""
        constructor(name1:String){

            this.name1 = name1
        }
        fun greet(nom:String):String {
            return "Hello $nom"
        }

    }

}