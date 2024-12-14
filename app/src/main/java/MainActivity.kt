package com.example.criticalthinkingfiveimagegallery
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val charactersList = listOf(
        R.drawable.hr_bubs,
        R.drawable.hr_homsar,
        R.drawable.hr_coach_z,
        R.drawable.hr_pom_pom,
        R.drawable.hr_trogdor,
        R.drawable.hr_homestar,
        R.drawable.hr_king_of_town,
        R.drawable.hr_marzipan,
        R.drawable.hr_strong_bad,
        R.drawable.hr_strong_mad,
        R.drawable.hr_strong_sad,
        R.drawable.hr_the_cheat
    )

    val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

    // Set the RecyclerView to use a GridLayoutManager with 2 columns
    recyclerView.layoutManager = GridLayoutManager(this, 2)

    // Attach the PhotoGridAdapter to the RecyclerView, passing in the image list
    recyclerView.adapter = PhotoGridAdapter(charactersList)

    }
}