package com.example.analisis_de_calificaciones

fun main()
{
    val cal = AnalizadorCalificaciones()
    for(i in 1..7)
    {
        var entrada: String?
        var calificaion: Float
        do {
            println("Ingrese la calificacion: $i")
            entrada = readLine()!!
        }while(entrada.isNullOrBlank())
        calificaion = entrada.toFloat()
        cal.aggregaCalificacion(calificaion)
    }
    cal.imprimirCalf()
    cal.calPromedio()
    println("Reprobados: ")
    cal.reprobados()
    println("Aprobados: ")
    cal.aprobados()
    cal.obPromedioMax()
    cal.obPromedioMin()
}