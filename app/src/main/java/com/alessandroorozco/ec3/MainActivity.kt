package com.alessandroorozco.ec3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.alessandroorozco.ec3.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)

    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_theboys) as NavHostFragment
    val navController = navHostFragment.navController
    binding.bnvMenu.setupWithNavController(navController)

    val retroftiTraer = RetroPersonaje.PersonajeApi.getTraer()

        retroftiTraer.enqueue(object : Callback<List<Personaje>>{
            override fun onResponse(call: Call<List<Personaje>>, response: Response<List<Personaje>>) {
                binding.tvMostrar.text = response.body().toString()
            }

            override fun onFailure(call: Call<List<Personaje>>, t: Throwable) {
                Toast.makeText(this@MainActivity,"Error al consultar Api", Toast.LENGTH_SHORT).show()
            }
        })
    }
}

