package com.example.recyclerview

data class Student(
    val id:Int,
    val name:String,
    val picture:Int,
    var isChecked: Boolean = false
)