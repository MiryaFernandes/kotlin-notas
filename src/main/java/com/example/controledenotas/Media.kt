package com.example.controledenotas

fun situacaoAluno(media: Int): String
{

    if(media >= 5){

        return "aprovado"
    }else{

        return "reprovado"
    }
}
fun calcularMedia (vararg notas:Int): Int {

    var soma = 0
    for (nota in notas){
        soma += nota
    }

    return soma / notas.size
}