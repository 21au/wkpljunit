package com.example.audrey

import org.junit.Assert

import org.junit.Test

class junitTest {
    @Test //ini itu untuk menandai kalau metode yang mengikuti anotasi ini itu metode pengujian
    fun test() { //Inisiasi metode pengujian, nama metodenya itu test
        val audrey = junit() //membuat objek audrey lalu memanggil junit
        val result = audrey.tambah(3,3) //memanggil tambah lalu diberi 2 argumen yaitu 3 dan 3
        Assert.assertEquals("Berhasil",6,result) //hasil uji menggunakan method assert yang disediakan
        //oleh jUnit tampilan akhirnya yaitu pesan Berhasil angka 6 sebagai hasil, result itu nilai yang diuji
    }
}