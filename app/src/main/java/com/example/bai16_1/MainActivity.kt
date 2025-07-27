package com.example.bai16_1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bai16_1.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ds = mutableListOf<Outdata>()
        ds.add(Outdata("Cám",".........................",R.drawable.cam))
        ds.add(Outdata("Đào Phở và Piano",".........................",R.drawable.daophovapiano))
        ds.add(Outdata("Đất rừng phương nam",".........................",R.drawable.datrungphuongnam))
        ds.add(Outdata("Hai Phượng",".........................",R.drawable.haiphuong))
        ds.add(Outdata("Làm giàu với ma",".........................",R.drawable.lamgiauvoima))
        ds.add(Outdata("Lật Mặt 6",".........................",R.drawable.latmat6))
        ds.add(Outdata("Lật Mặt 7",".........................",R.drawable.latmat7))
        ds.add(Outdata("Mai",".........................",R.drawable.mai))
        ds.add(Outdata("Người Vợ Cuối Cùng",".........................",R.drawable.nguoivocuoicung))

        val adapter = recycleViewAdapter(ds)
        binding.RcView.adapter = adapter
        binding.RcView.layoutManager = LinearLayoutManager(this, GridLayoutManager.VERTICAL,false)
    }
}