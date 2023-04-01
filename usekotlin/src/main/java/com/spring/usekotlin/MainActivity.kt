package com.spring.usekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.youth.banner.Banner
import com.youth.banner.adapter.BannerAdapter

class MainActivity : AppCompatActivity() {

    var imageUrls = listOf(
        "https://img.zcool.cn/community/01b72057a7e0790000018c1bf4fce0.png",
        "https://img.zcool.cn/community/016a2256fb63006ac7257948f83349.jpg",
        "https://img.zcool.cn/community/01233056fb62fe32f875a9447400e1.jpg",
        "https://img.zcool.cn/community/01700557a7f42f0000018c1bd6eb23.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mVideoBanner =
            findViewById<Banner<String, BannerAdapter<String, RecyclerView.ViewHolder>>>(
                R.id.bannerLayout1
            )
    }


}
