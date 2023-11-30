package com.zhalz.animalcatalog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zhalz.animalcatalog.R
import com.zhalz.animalcatalog.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val binding: ActivityDetailBinding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvToolbarTitle.isSelected = true

        binding.toolbar.setOnMenuItemClickListener {
            when (it.itemId){
                R.id.menu_info -> Toast.makeText(this, "Created by Faishal Mukhammad Syarief", Toast.LENGTH_SHORT).show()
            }
            true
        }

        val title = intent.getStringExtra("title") ?: getString(R.string.my_name)
        val subtitle = intent.getStringExtra("subtitle") ?: getString(R.string.my_email)
        val description = intent.getStringExtra("description") ?: getString(R.string.my_desc)
        val image = intent.getIntExtra("image", R.drawable.me)

        binding.tvTitle.text = title
        binding.tvSubtitle.text = subtitle
        binding.tvDescription.text = description
        binding.ivImage.setImageResource(image)

        binding.toolbar.setNavigationOnClickListener { finish() }
    }
}