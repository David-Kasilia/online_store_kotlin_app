package com.example.armcokenyalimited.TV

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R


class TvAdapter(val context: Context, var televisionSetsList: ArrayList<TelevisionSets>) : RecyclerView.Adapter<TvAdapter.TvViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item_products, parent, false)
        return TvViewHolder(itemView)

    }

    override fun onBindViewHolder(tvViewHolder: TvViewHolder, position: Int) {

        val televisionSets = televisionSetsList[position]
        tvViewHolder.setData(televisionSets, position)

    }

    override fun getItemCount(): Int = televisionSetsList.size

    inner class TvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition = -1
        private var currentTelevisionSets: TelevisionSets? = null

        private val productName = itemView.findViewById<TextView>(R.id.productName)
        private val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val favourites = itemView.findViewById<ImageView>(R.id.addToFavourites)
        private val textFavourites = itemView.findViewById<TextView>(R.id.favourites)
        private val addToCart = itemView.findViewById<ImageView>(R.id.addToCart)
        private val cart = itemView.findViewById<TextView>(R.id.cart)
        private val buyNowImage = itemView.findViewById<ImageView>(R.id.buyNowImage)
        private val buyNow = itemView.findViewById<TextView>(R.id.buyNow)


        private val FavouriteFilledImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_black_24dp, null)
        private val BorderedFavouriteImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_border_black_24dp, null)
        private val AddToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_add_shopping_cart_black_24dp, null)
        private val AddedToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_shopping_cart_black_24dp, null)
        private val BuyProductNow = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_paid_black_24dp, null)
        private val ProductBought = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_store_black_24dp, null)


        fun setData(televisionSets: TelevisionSets, position: Int) {
            this.currentPosition = position
            this.currentTelevisionSets = televisionSets

            productName.text = televisionSets.productTvName
            productImage.setImageResource(televisionSets.productTvImageId)
            textFavourites.text = televisionSets.addToFavourites
            cart.text = televisionSets.addToCart
            buyNow.text = televisionSets.buyNow


            if (televisionSets.isTvFavourite)
                favourites.setImageDrawable(FavouriteFilledImage)
            else
                favourites.setImageDrawable(BorderedFavouriteImage)

            if (televisionSets.isTvAddToCart)
                addToCart.setImageDrawable(AddedToCart)
            else
                addToCart.setImageDrawable(AddToCart)


            if (televisionSets.isTvBuyNow)
                buyNowImage.setImageDrawable(BuyProductNow)
            else
                buyNowImage.setImageDrawable(ProductBought)

        }
    }
}



