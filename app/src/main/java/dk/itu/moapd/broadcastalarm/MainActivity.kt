package dk.itu.moapd.broadcastalarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager
            .findFragmentById(R.id.fragment_main)
        if (fragment == null)
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_main, MainFragment())
                .commit()
    }

}
