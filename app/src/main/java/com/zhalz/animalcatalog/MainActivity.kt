package com.zhalz.animalcatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhalz.animalcatalog.adapter.AnimalAdapter
import com.zhalz.animalcatalog.data.Animal
import com.zhalz.animalcatalog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val animalList = listOf(
            Animal(
                "Deer",
                "Gentle forest dweller with graceful antlers",
                "The deer is an exquisite creature, known for its graceful appearance and gentle disposition. Inhabiting serene forests, it's recognized for its slender build, elegant antlers, and agile movements, often symbolizing grace and harmony in various cultures. Its cautious demeanor and swift agility make it a symbol of both beauty and peace in the wild.",
                R.drawable.deer
            ),
            Animal(
                "Tiger",
                "Majestic predator ruling the jungle",
                "The tiger, a majestic and awe-inspiring predator, roams the dense jungles with unparalleled strength and stealth. With its distinctive striped coat and powerful physique, it embodies power and dominance in the animal kingdom. Revered for its fierce yet regal presence, the tiger stands as a symbol of strength, courage, and prowess in numerous mythologies and cultural beliefs.",
                R.drawable.tiger
            ),
            Animal(
                "Elephant",
                "Giant creature with a long, powerful trunk",
                "The elephant, a colossal and magnificent creature, symbolizes intelligence, strength, and familial bonds within its social groups. With its long, powerful trunk and imposing tusks, it signifies wisdom, endurance, and a deep sense of community. Revered in many cultures as a symbol of good fortune and resilience, the elephant's gentle nature juxtaposes its immense physical power.",
                R.drawable.elephant
            ),
            Animal(
                "Flamingo",
                "Elegant bird displaying vibrant hues",
                "The flamingo, an elegant bird adorned with vibrant hues, thrives in picturesque wetland habitats, showcasing grace and beauty in its flocking behavior. Its striking pink plumage and long, slender legs make it a captivating sight. Often seen standing tall in shallow waters, the flamingo embodies elegance, sociability, and a serene presence within its environment.",
                R.drawable.flamingo
            ),
            Animal(
                "Fox",
                "Cunning creature known for its agility",
                "The fox, known for its cunning nature and remarkable agility, adapts seamlessly to various environments. Its sleek coat and intelligent eyes are emblematic of its resourcefulness and adaptability. Renowned for its cleverness and ability to navigate complex situations, the fox symbolizes intelligence and quick thinking across diverse cultures.",
                R.drawable.fox
            ),
            Animal(
                "Cow",
                "Domesticated farm animal providing milk",
                "The cow, a gentle and domesticated farm animal, is revered for providing nourishing milk and symbolizes sustenance and nurturing in various cultures worldwide. Its calm demeanor and pastoral significance make it a cornerstone of agriculture and communal life, often representing abundance, fertility, and maternal care.",
                R.drawable.deer
            ),
            Animal(
                "Frog",
                "Amphibian known for its croaking sounds",
                "The frog, an amphibian renowned for its croaking sounds, inhabits both land and water, symbolizing transformation and rebirth in folklore. With its ability to transition between different stages of life, it signifies renewal, fertility, and adaptability. The frog's presence in myths and stories often denotes transitions and positive change.",
                R.drawable.frog
            ),
            Animal(
                "Jellyfish",
                "Graceful sea creature with trailing tentacles",
                "The jellyfish, a graceful sea creature with trailing tentacles, navigates ocean currents with ethereal beauty and adaptability. Its translucent body and mesmerizing movements represent grace, tranquility, and resilience in the ever-changing seas. The jellyfish's serene appearance belies its importance in marine ecosystems, symbolizing both fragility and strength in the vastness of the ocean.",
                R.drawable.jellyfish
            ),
            Animal(
                "Lion",
                "Mighty ruler of the savannah",
                "The lion, a mighty ruler of the savannah, embodies strength, leadership, and a commanding presence within its pride. With its majestic mane and powerful roar, it stands as a symbol of courage, authority, and familial bonds. Revered in various cultures as the king of beasts, the lion's regal stature and prowess evoke admiration and respect.",
                R.drawable.jellyfish
            ),
            Animal(
                "Spider",
                "Sleek predator spinning intricate webs",
                "The spider, an eight-legged arachnid known for its intricate webs and hunting prowess, inhabits diverse environments across the globe. With its ability to spin silk threads, it constructs elaborate webs as traps for prey, showcasing remarkable engineering skills. Often associated with patience, creativity, and transformation, the spider symbolizes both mystery and industriousness in various mythologies and cultural beliefs.",
                R.drawable.jellyfish
            )

        )

        val animalAdapter = AnimalAdapter(animalList)

        binding.rvAnimal.adapter = animalAdapter
    }

}