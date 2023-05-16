package com.example.armcokenyalimited.TVWALLBRACKETS

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class TvWallBracketsAdapter (val context: Context, var tvWallBracketSetsList: ArrayList<TvWallBracketsSets>) : RecyclerView.Adapter<TvWallBracketsAdapter.TvWallBracketViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvWallBracketViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item_products, parent, false)
        return TvWallBracketViewHolder(itemView)

    }

    override fun onBindViewHolder(tvWallBracketViewHolder: TvWallBracketViewHolder, position: Int) {

        val tvWallBracketSets = tvWallBracketSetsList[position]
        tvWallBracketViewHolder.setData(tvWallBracketSets, position)

    }

    override fun getItemCount(): Int =  tvWallBracketSetsList.size

    inner class TvWallBracketViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition = -1
        private var currentTvWallBrackets: TvWallBracketsSets? = null

        private val productWallBracketsName = itemView.findViewById<TextView>(R.id.productName)
        private val productWallBracketsImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val TvWallBracketsFavourite = itemView.findViewById<ImageView>(R.id.addToFavourites)
        private val textWallBracketsFavourites = itemView.findViewById<TextView>(R.id.favourites)
        private val addTvWallBracketsToCart = itemView.findViewById<ImageView>(R.id.addToCart)
        private val WallBracketsCart = itemView.findViewById<TextView>(R.id.cart)
        private val buyTvWallBracketsNowImage = itemView.findViewById<ImageView>(R.id.buyNowImage)
        private val buyWallBracketsNow = itemView.findViewById<TextView>(R.id.buyNow)


        private val FavouriteFilledImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_black_24dp, null)
        private val BorderedFavouriteImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_border_black_24dp, null)
        private val AddToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_add_shopping_cart_black_24dp, null)
        private val AddedToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_shopping_cart_black_24dp, null)
        private val BuyProductNow = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_paid_black_24dp, null)
        private val ProductBought = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_store_black_24dp, null)


        fun setData(tvWallBracketSets: TvWallBracketsSets, position: Int) {
            this.currentPosition = position
            this.currentTvWallBrackets = tvWallBracketSets

            productWallBracketsName.text = tvWallBracketSets.productTvWallBracketsName
            productWallBracketsImage.setImageResource(tvWallBracketSets.productTvWallBracketsImageId)
            textWallBracketsFavourites.text = tvWallBracketSets.addTvWallBracketsToFavourites
            WallBracketsCart.text = tvWallBracketSets.addTvWallBracketsToCart
            buyWallBracketsNow.text = tvWallBracketSets.buyTvWallBracketsNow


            if (tvWallBracketSets.isTvWallBracketsFavourite)
                TvWallBracketsFavourite.setImageDrawable(FavouriteFilledImage)
            else
                TvWallBracketsFavourite.setImageDrawable(BorderedFavouriteImage)

            if (tvWallBracketSets.isTvWallBracketsAddToCart)
                addTvWallBracketsToCart.setImageDrawable(AddedToCart)
            else
                addTvWallBracketsToCart.setImageDrawable(AddToCart)


            if (tvWallBracketSets.isTvWallBracketsBuyNow )
                buyTvWallBracketsNowImage.setImageDrawable(BuyProductNow)
            else
                buyTvWallBracketsNowImage.setImageDrawable(ProductBought)

        }
    }
}