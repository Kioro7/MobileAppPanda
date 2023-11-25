package com.example.mobileapppanda

import org.junit.Assert.assertEquals
import org.junit.Test

class LoginActivityTest {

    @Test
    fun testLoginWithCorrect() {
        val result = LoginActivity.AuthUtil.loginValidation("ilzam@mail.ru", "Aa123456!")
        assertEquals(true, result)
    }

    @Test
    fun testLoginWithIncorrect() {
        val result = LoginActivity.AuthUtil.loginValidation("incorrect@mail.ru", "wrongpassword")
        assertEquals(false, result)
    }
}