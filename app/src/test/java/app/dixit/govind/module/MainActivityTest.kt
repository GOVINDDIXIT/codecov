package app.dixit.govind.module

import org.junit.Assert.*
import org.junit.Test

class MainActivityTest {

    private var mainActivity= MainActivity()

    @Test
    fun checkMailAddress(){
        assertTrue(mainActivity.isValidMail("abc@gmail.com"))
    }

}