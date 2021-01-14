package com.example.e_softwarica

class StudentModel {
    class StudentModel(photo:Int, name:String, address:String, age:String, icon:Int, gender:String) {
        var photo:Int = 0
        var name:String
        var address:String
        var age:String
        var icon:Int = 0
        var gender:String
        init{
            this.photo = photo
            this.name = name
            this.address = address
            this.age = age
            this.icon = icon
            this.gender = gender
        }
    }
}