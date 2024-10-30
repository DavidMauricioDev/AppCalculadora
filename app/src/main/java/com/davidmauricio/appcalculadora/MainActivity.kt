package com.davidmauricio.appcalculadora

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.davidmauricio.appcalculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val calculo = binding.calculo


        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }
        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }
        binding.parenteseAbrindo.setOnClickListener {
            calculo.text = "${calculo.text}("
        }
        binding.parenteseFechando.setOnClickListener {
            calculo.text = "${calculo.text})"
        }
        binding.ce.setOnClickListener {
            calculo.text = "${calculo.text}CE"
        }
        binding.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }
        binding.multiplicacao.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }
        binding.subtrair.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }
        binding.adicao.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }
        binding.resultado.setOnClickListener {
            calculo.text = "${calculo.text}="
        }
        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }
        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }
        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }







    }

}