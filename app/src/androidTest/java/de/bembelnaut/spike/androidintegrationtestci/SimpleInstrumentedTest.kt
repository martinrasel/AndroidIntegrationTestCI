package de.bembelnaut.spike.androidintegrationtestci

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import de.bembelnaut.spike.androidintegrationtestci.ui.theme.AndroidIntegrationTestCITheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SimpleInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun checkGreeting() {

        composeTestRule.setContent {
            AndroidIntegrationTestCITheme {
                Greeting(name = "John")
            }
        }

        composeTestRule.apply {
            onNodeWithTag("greetings_test_tag").assertIsDisplayed().assertTextContains("Hello John!")
        }
    }
}