package com.firdavsho.changan6370

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.firdavsho.changan6370.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textTitle.text = "Чанган 6370 - Диагностика"
        binding.textInfo.text = "Барнома омода аст. Ҳоло дизайн ва диагностикаро илова мекунем."
    }
}
