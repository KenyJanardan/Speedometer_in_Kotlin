package com.example.speedometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.ImageView
import com.example.speedometer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var rot:Float=0.toFloat();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            if(rot<250){
                var animation = RotateAnimation(rot, rot+20f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f)
                animation.duration = 1000
                animation.fillAfter=true
                binding.imageView4.startAnimation(animation)
                rot=rot+20f;
            }
        }
        binding.button.setOnClickListener {
            if(rot>0){
                var animation = RotateAnimation(rot, rot-20f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f)
                animation.duration = 1000
                animation.fillAfter=true
                binding.imageView4.startAnimation(animation)
                rot=rot-20f;
            }

        }
    }


}

