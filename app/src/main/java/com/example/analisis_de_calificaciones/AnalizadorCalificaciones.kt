package com.example.analisis_de_calificaciones

class AnalizadorCalificaciones
{
    var calificaciones = mutableListOf<Float>()
    fun aggregaCalificacion(calificacion: Float)
    {
        calificaciones.add(calificacion)
    }
    fun imprimirCalf()
    {
        println("Las calificaciones son: ")
        for(i in 1..calificaciones.size)
        {
            println("La calificacion ${i} es: ${calificaciones[i-1]}")
        }
    }
    fun reprobados()
    {
        var rep: Int= 0
        for(i in calificaciones)
        {
            if(i<7.0f)
            {
                rep++
            }
        }
        println(rep)
    }
    fun aprobados()
    {
        var apr: Int= 0
        for(i in calificaciones)
        {
            if(i>=7.0f)
            {
                apr++
            }
        }
        println(apr)
    }
    fun calPromedio()
    {
        var cal = calificaciones.average()
        var calf = String.format("%.2f", cal)
        println("El promedio de las calificaciones es: ${calf}")
    }
    fun obPromedioMax()
    {
        var max = calificaciones.maxOrNull()
        println("El promedio mas alto es: ${max}")
    }
    fun obPromedioMin()
    {
        var min = calificaciones.minOrNull()
        println("El promedio mas bajo es: ${min}")

    }
}