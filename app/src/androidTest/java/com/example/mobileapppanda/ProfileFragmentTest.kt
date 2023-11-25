package com.example.mobileapppanda

import androidx.fragment.app.testing.FragmentScenario
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mobileapppanda.ui.profile.ProfileFragment
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ProfileFragmentTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    private lateinit var fragmentScenario: FragmentScenario<ProfileFragment>

    @Before
    fun setUp() {
        fragmentScenario = FragmentScenario.launchInContainer(ProfileFragment::class.java)
        fragmentScenario.moveToState(Lifecycle.State.RESUMED)
    }

    @Test
    fun testDialogDisplay() {
        // Нажимаем на кнопку для отображения диалога
        onView(withId(R.id.show_dialog))
            .perform(click())

        // Проверяем, что диалог отображается
        onView(withId(R.id.idDialogForm))
            .check(matches(isDisplayed()))
    }
}