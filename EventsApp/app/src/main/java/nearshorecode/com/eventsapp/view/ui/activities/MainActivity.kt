package nearshorecode.com.eventsapp.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import nearshorecode.com.eventsapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBar(findViewById(R.id.toolbarMain))
        configNav()
    }

    fun configNav() {
        NavigationUI.setupWithNavController(
            bnvMenu,
            Navigation.findNavController(this, R.id.fragContent)
        )
    }
}
