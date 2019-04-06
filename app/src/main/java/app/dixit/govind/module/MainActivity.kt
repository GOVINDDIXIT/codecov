package app.dixit.govind.module

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.NewTheme)
        setContentView(R.layout.activity_main)
    }

    fun isValidMail(email:String):Boolean {
        return email.indexOf("@")>-1
    }
}
