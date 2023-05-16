package com.example.armcokenyalimited

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.armcokenyalimited.AIRCONDITIONERS.AirConditioners
import com.example.armcokenyalimited.BLENDERS.Blenders
import com.example.armcokenyalimited.CART.Cart
import com.example.armcokenyalimited.COOLINGFANS.CoolingFans
import com.example.armcokenyalimited.DVDS.Dvds
import com.example.armcokenyalimited.FAVOURITES.Favourites
import com.example.armcokenyalimited.FOODPROCESSORS.FoodProcessors
import com.example.armcokenyalimited.FREESTANDINGCOOKERS.FreeStandingCookers
import com.example.armcokenyalimited.HOMETHEATRES.HomeTheatres
import com.example.armcokenyalimited.IRONS.Irons
import com.example.armcokenyalimited.KETTLES.Kettles
import com.example.armcokenyalimited.MICROWAVES.Microwaves
import com.example.armcokenyalimited.PORTABLECOOKERS.PortableCookers
import com.example.armcokenyalimited.PROFILE.Profile
import com.example.armcokenyalimited.REFRIGERATORS.Refrigerators
import com.example.armcokenyalimited.RICECOOKERS.RiceCookers
import com.example.armcokenyalimited.TV.TV
import com.example.armcokenyalimited.TVWALLBRACKETS.TvWallBrackets
import com.example.armcokenyalimited.WATERDISPENSERS.WaterDispensers
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.drawer_layout


class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navView: NavigationView
    private lateinit var drawerLayout: DrawerLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        navView = findViewById(R.id.nav_view)
        drawerLayout = findViewById(R.id.drawer_layout)



        toggle = ActionBarDrawerToggle(this, drawer_layout, R.string.open, R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.HomeActivity -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT).show()
                }
                R.id.ProfileActivity ->{
                    startActivity(Intent(this, Profile::class.java))
                    Toast.makeText(applicationContext, "Clicked Profile", Toast.LENGTH_SHORT).show()
                }
                R.id.CartActivity ->{
                    startActivity(Intent(this, Cart::class.java))
                    Toast.makeText(applicationContext, "Clicked Cart", Toast.LENGTH_SHORT).show()
                }
                R.id.FavouriteActivity -> {
                    startActivity(Intent(this, Favourites::class.java))
                    Toast.makeText(applicationContext, "Clicked Favourite", Toast.LENGTH_SHORT).show()
                }
                R.id.Settings -> {
                    startActivity(Intent(this, Settings::class.java))
                    Toast.makeText(applicationContext, "Clicked Settings", Toast.LENGTH_SHORT).show()
                }
                R.id.Email -> {
                    startActivity(Intent(this, Communications::class.java))
                    Toast.makeText(applicationContext, "Clicked Email", Toast.LENGTH_SHORT).show()
                }
                R.id.Whatsapp -> {
                    startActivity(Intent(this, Communications::class.java))
                    Toast.makeText(applicationContext, "Clicked Whatsapp", Toast.LENGTH_SHORT).show()
                }
                R.id.PhoneCall -> {
                    startActivity(Intent(this, Communications::class.java))
                    Toast.makeText(applicationContext, "Clicked Phone Call", Toast.LENGTH_SHORT).show()
                }
                R.id.Share -> {
                    startActivity(Intent(this, Explore::class.java))
                    Toast.makeText(applicationContext, "Clicked Share", Toast.LENGTH_SHORT).show()
                }
                R.id.RateUs ->{
                    startActivity(Intent(this, Explore::class.java))
                    Toast.makeText(applicationContext, "Clicked Rate Us", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }



//Called When User Clicks On The Television Sets Button
        buttonTelevisionSets.setOnClickListener {
            val intent = Intent(this, TV::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Tv Wall Brackets Button
        buttonTvWallBrackets.setOnClickListener {
            val intent = Intent(this, TvWallBrackets::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The HomeTheatres Button
        buttonHomeTheatres.setOnClickListener {
            val intent = Intent(this, HomeTheatres::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Dvds Button
        buttonDvds.setOnClickListener {
            val intent = Intent(this, Dvds::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Blenders Button
        buttonBlenders.setOnClickListener {
            val intent = Intent(this, Blenders::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Portable Cookers Button
        buttonPortableCookers.setOnClickListener {
            val intent = Intent(this, PortableCookers::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Food Processors Button
        buttonFoodProcessors.setOnClickListener {
            val intent = Intent(this, FoodProcessors::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Rice Cookers Button
        buttonRiceCookers.setOnClickListener {
            val intent = Intent(this, RiceCookers::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Refrigerators Button
        buttonRefrigerators.setOnClickListener {
            val intent = Intent(this, Refrigerators::class.java)
            startActivity(intent)
        }


//Called When User Clicks On The Free Standing Cookers Button
        buttonFreeStandingCookers.setOnClickListener {
            val intent = Intent(this, FreeStandingCookers::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Air Conditioners Button
        buttonAirConditioners.setOnClickListener {
            val intent = Intent(this, AirConditioners::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Water Dispensers Button
        buttonWaterDispensers.setOnClickListener {
            val intent = Intent(this, WaterDispensers::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Cooling Fans Button
        buttonCoolingFans.setOnClickListener {
            val intent = Intent(this, CoolingFans::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Microwaves Button
        buttonMicrowaves.setOnClickListener {
            val intent = Intent(this, Microwaves::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Irons Button
        buttonIrons.setOnClickListener {
            val intent = Intent(this, Irons::class.java)
            startActivity(intent)
        }

//Called When User Clicks On The Kettles Button
        buttonKettles.setOnClickListener {
            val intent = Intent(this, Kettles::class.java)
            startActivity(intent)
        }


    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
            return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (drawerLayout.isOpen) {
            drawerLayout.close()
        } else {
            super.onBackPressed()
        }
    }
}




