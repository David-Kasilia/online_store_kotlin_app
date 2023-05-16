package com.example.armcokenyalimited.TV


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R


class TV : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var arrayList : ArrayList<TelevisionSets>
    lateinit var tvSetsImages : Array<Int>
    lateinit var tvSetsProductName : Array<String>
    lateinit var tvSetsProductDescription : Array<String>
    lateinit var tvSetsAddToFavourite : Array<String>
    lateinit var tvSetsAddToCart : Array<String>
    lateinit var tvSetsBuyNow : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv)

        tvSetsImages = arrayOf(
            R.drawable.armco_led_t22h1_dc_22_inch,
            R.drawable.armco_led_t32eco_32_inch,
            R.drawable.armco_led_t32h1_32_inch,
            R.drawable.armco_led_t32smrt_32_inch,
            R.drawable.armco_led_tz15h1_digital_led,
            R.drawable.armco_led_tz15h1dc__digital_led,
            R.drawable.armco_led_tz17h1_digital_led,
            R.drawable.armco_led_tz17h1dc_digital_led,
            R.drawable.armco_led_tz19h1_digital,
            R.drawable.armco_led_tz19h1dc_digital_led,
            R.drawable.toshiba_32l3965_32_inch_result,
            R.drawable.toshiba_32l5995ee_32_inch,
            R.drawable.toshiba_40s2850ee_40_inch,
            R.drawable.toshiba_43l5965ee_43_inch_result,
            R.drawable.toshiba_50u7950ee_50_inch,
            R.drawable.toshiba_50u7950ee_55_inch_result,
            R.drawable.toshiba_65u7950ee_65_inch_result,
            R.drawable.toshiba_75u7950ee_75_inch__2_,
            R.drawable.armco_50_inch_result,
            R.drawable.armcouhd4kled_2048x2048_result,
            R.drawable._5_inch_armco_result,
            R.drawable._5inch_armco_result,
            R.drawable.toshiba_32s2850ee_32_inch_result,
            R.drawable.toshiba_24inch_result
        )


        tvSetsProductName = arrayOf(
            "ARMCO LED-T22H1-DC - 22 Inch Digital LED TV - Full HD, Tempered Glass Screen.",
            "ARMCO LED-T32ECO - 32 Inch Digital Television, LED TV, HD Ready, Ultra Slim.",
            "ARMCO LED-T32H1 - 32 Inch Digital Television, LED TV, HD Ready - Tempered Tough Screen",
            "ARMCO LED-T32SMRT - 32 Inch SMART TV, Digital, FULL HD.",
            "ARMCO LED-TZ15H1- Digital LED TV - HD READY - TOUGH SCREEN.",
            "ARMCO LED-TZ15H1DC- Digital LED TV - HD READY - TOUGH SCREEN.",
            "ARMCO LED-TZ17H1- Digital LED TV - HD READY - TOUGH SCREEN.",
            "ARMCO LED-TZ17H1DC - Digital LED TV - HD READY - TOUGH SCREEN.",
            "ARMCO LED-TZ19H1- Digital LED TV - HD READY - TOUGH SCREEN.",
            "ARMCO LED-TZ19H1DC - Digital LED TV - HD READY - TOUGH SCREEN.",
            "TOSHIBA 32L3965 - 32 inch Digital LED TV - HD.",
            "TOSHIBA 32L5995EE - 32 inch LED, Digital, Smart TV - 720p.",
            "TOSHIBA 40S2850EE - 40 inch 1080p Digital LED TV, FULL HD.",
            "TOSHIBA 43L5965EE - 43 inch Smart Android, LED, Digital TV - Full HD 1080p.",
            "TOSHIBA 50U7950EE - 50 inch LED Smart TV, Digital, UHD 4K.",
            "TOSHIBA 55U7950EE - 55 inch LED Smart TV, Digital, UHD 4K.",
            "TOSHIBA 65U7950EE - 65 inch LED Smart TV, Digital, UHD 4K.",
            "TOSHIBA 75U7950EE - 75 inch LED Smart TV, Digital, UHD 4K.",
            "ARMCO LED-T50SM-UHD - 50 Inch SMART TV, 4K UHD, Digital, Wireless Keyboard.",
            "ARMCO LED-T55SM-UHD - 55 inch LED, Digital, SMART, 4K UHD TV, Wireless Keyboard.",
            "ARMCO LED-T75SM-UHD - 75 inch Digital SMART LED TV, 4K UHD TV, Wireless Keyboard.",
            "ARMCO LED-T65SM-UHD - 65 inch LED, Digital, SMART, 4K UHD TV, Wireless Keyboard.",
            "TOSHIBA 32S2850EE - 32 inch Digital LED TV - 720p.",
            "TOSHIBA 24S1650EE - 24 inch Digital LED TV - 720p."
        )
        tvSetsProductDescription = arrayOf(

            "Product Description", "Product Description", "Product Description", "Product Description", "Product Description",
            "Product Description", "Product Description", "Product Description", "Product Description", "Product Description",
            "Product Description", "Product Description", "Product Description", "Product Description", "Product Description",
            "Product Description", "Product Description", "Product Description", "Product Description", "Product Description",
            "Product Description", "Product Description", "Product Description", "Product Description"
        )

        tvSetsAddToFavourite = arrayOf(
            "Add To Favourites", "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",
            "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",
            "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",
            "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites",  "Add To Favourites"
        )

        tvSetsAddToCart = arrayOf(
            "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart",
            "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart",
            "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart"
        )

        tvSetsBuyNow = arrayOf(
            "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now",
            "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now",
            "Buy Now", "Buy Now", "Buy Now", "Buy Now"
        )

        recyclerView = findViewById(R.id.tv_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf<TelevisionSets>()

        getUserData()

    }

    private fun getUserData() {
        for (i in tvSetsImages.indices) {

            val productTvImageId = tvSetsImages[i]
            val productTvName = tvSetsProductName[i]
            val productTvDescription = tvSetsProductDescription[i]
            val addToFavourites = tvSetsAddToFavourite[i]
            val addToCart = tvSetsAddToCart[i]
            val buyNow = tvSetsBuyNow[i]
            val televisionSets = TelevisionSets(productTvImageId, productTvName, productTvDescription, false, addToFavourites, false, addToCart,
                false, buyNow)

            arrayList.add(televisionSets)

        }

        recyclerView.adapter = TvAdapter(this, arrayList)

    }




}



