package com.example.audrey

import org.junit.Assert

import org.junit.Test

class junitTest {
    @Test
    fun test() {
        val audrey = junit()
        val result = audrey.tambah(3,3)
        Assert.assertEquals("Berhasil",6,result)
    }
}