package kr.ac.kumoh.s20180877.sw07exintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.s20180877.sw07exintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener {
            //Toast.makeText(this, "눌렸습니다", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, imgactivity::class.java)
        }



        binding.btnExplicitIntent.setOnClickListener {
            //Toast.makeText(this, "눌렸습니다", Toast.LENGTH_SHORT).show()

            val uri = Uri.parse("https://www.youtube.com/"+ binding.editText.text)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }


    }
}