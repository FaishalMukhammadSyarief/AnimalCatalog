package com.zhalz.animalcatalog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zhalz.animalcatalog.data.Animal
import com.zhalz.animalcatalog.databinding.ItemAnimalBinding

class AnimalAdapter(private var items: List<Animal>): RecyclerView.Adapter<AnimalAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(var binding: ItemAnimalBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.tvTitle.text = items[position].title
        holder.binding.tvSubtitle.text = items[position].subtitle
        holder.binding.ivImage.setImageResource(items[position].image)
    }
}