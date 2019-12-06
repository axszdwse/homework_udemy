package com.train

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var tickets=scanner.nextInt()
    println("How many round-trip tickets: ")
    var round=scanner.nextInt()
    val ticket=TesterKotlin(tickets,round)
    ticket.print()
}

class TesterKotlin(var tickets:Int,var round:Int){
    var total=round*2000*90/100+(tickets-round)*1000
    fun print(){
        println("Total tickets: $tickets")
        println("Round-trip: $round")
        println("Total: $total")
    }
}