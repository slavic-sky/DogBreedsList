package com.example.dogbreedslist.ui.favorites.favoritesadapter

import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.dogbreedslist.databinding.ItemFavoriteBinding
import com.example.dogbreedslist.ui.breeds.SubbreedsListFragmentDirections
import com.example.dogbreedslist.ui.favorites.FavoritesListFragmentDirections
import org.jetbrains.annotations.NotNull

class FavoriteViewHolder(val binding: ItemFavoriteBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: String) {
        binding.apply{
            setClickListener { toFavoritesPhotos(it, item) }
            breedName = item
            executePendingBindings()
        }
    }

    private fun toFavoritesPhotos(view: View, breedName: String) {
        val direction = FavoritesListFragmentDirections.actionListToPhotos(breedName)
        view.findNavController().navigate(direction)
    }
}