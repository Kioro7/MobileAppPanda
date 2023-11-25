package com.example.mobileapppanda

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityTest {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(LoginActivity::class.java)


    @Test
    fun testSuccessfulLogin() {
        // Вводим правильные данные для входа
        Espresso.onView(ViewMatchers.withId(R.id.editTextEmailAddress))
            .perform(ViewActions.typeText("ilzam@mail.ru"))
        Espresso.closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.editTextPassword))
            .perform(ViewActions.typeText("Aa123456!"))
        Espresso.closeSoftKeyboard()

        // Нажимаем на кнопку входа
        Espresso.onView(ViewMatchers.withId(R.id.btnEnterApp))
            .perform(ViewActions.click())

        // Проверяем, что активити MainActivity запустилась
        Espresso.onView(ViewMatchers.withId(R.id.idContentMain))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}