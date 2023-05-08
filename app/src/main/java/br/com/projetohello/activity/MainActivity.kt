package br.com.projetohello.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import br.com.projetohello.activity.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            var isValido = true

            if (binding.tieLogin.text.toString().trim().length == 0){
                isValido = false
                binding.tilLogin.error = getString(R.string.msg_erro_login)
            }else{
                binding.tilLogin.error = null
            }

            if (binding.tieSenha.text.toString().trim().length == 0){
                isValido = false
                binding.tilSenha.error = getString(R.string.msg_erro_senha)
            }else{

            }
        }
    }
}