package com.example.armcokenyalimited.HOMETHEATRES

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class HomeTheatresAdapter(val context: Context, var homeTheatreSetsList: ArrayList<HomeTheatreSets>) : RecyclerView.Adapter<HomeTheatresAdapter.HomeTheatresViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeTheatresViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item_products, parent, false)
        return HomeTheatresViewHolder(itemView)

    }

    override fun onBindViewHolder(homeTheatresViewHolder: HomeTheatresViewHolder, position: Int) {

        val televisionSets = homeTheatreSetsList[position]
        homeTheatresViewHolder.setData(televisionSets, position)

    }

    override fun getItemCount(): Int = homeTheatreSetsList.size

    inner class HomeTheatresViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition = -1
        private var currentHomeTheatreSets: HomeTheatreSets? = null

        private val productHomeTheatresName = itemView.findViewById<TextView>(R.id.productName)
        private val productHomeTheatresImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val HomeTheatresFavourites = itemView.findViewById<ImageView>(R.id.addToFavourites)
        private val textHomeTheatresFavourites = itemView.findViewById<TextView>(R.id.favourites)
        private val addHomeTheatresToCart = itemView.findViewById<ImageView>(R.id.addToCart)
        private val HomeTheatresCart = itemView.findViewById<TextView>(R.id.cart)
        private val buyHomeTheatresNowImage = itemView.findViewById<ImageView>(R.id.buyNowImage)
        private val buyHomeTheatresNow = itemView.findViewById<TextView>(R.id.buyNow)


        private val FavouriteFilledImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_black_24dp, null)
        private val BorderedFavouriteImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_border_black_24dp, null)
        private val AddToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_add_shopping_cart_black_24dp, null)
        private val AddedToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_shopping_cart_black_24dp, null)
        private val BuyProductNow = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_paid_black_24dp, null)
        private val ProductBought = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_store_black_24dp, null)


        fun setData(homeTheatreSets: HomeTheatreSets, position: Int) {
            this.currentPosition = position
            this.currentHomeTheatreSets = homeTheatreSets

            productHomeTheatresName.text = homeTheatreSets.productHomeTheatreName
            productHomeTheatresImage.setImageResource(homeTheatreSets.productHomeTheatreImageId)
            textHomeTheatresFavourites.text = homeTheatreSets.addHomeTheatreToFavourites
            HomeTheatresCart.text = homeTheatreSets.addHomeTheatreToCart
            buyHomeTheatresNow.text = homeTheatreSets.buyHomeTheatreNow


            if (homeTheatreSets.isHomeTheatreFavourite)
                HomeTheatresFavourites.setImageDrawable(FavouriteFilledImage)
            else
                HomeTheatresFavourites.setImageDrawable(BorderedFavouriteImage)

            if (homeTheatreSets.isHomeTheatreAddToCart)
                addHomeTheatresToCart.setImageDrawable(AddedToCart)
            else
                addHomeTheatresToCart.setImageDrawable(AddToCart)


            if (homeTheatreSets.isHomeTheatreBuyNow)
                buyHomeTheatresNowImage.setImageDrawable(BuyProductNow)
            else
                buyHomeTheatresNowImage.setImageDrawable(ProductBought)

        }
    }
}



