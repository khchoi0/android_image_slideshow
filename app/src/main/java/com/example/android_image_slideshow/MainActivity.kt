package com.example.android_image_slideshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    var viewPager: ViewPager? = null
    var images = intArrayOf(R.drawable.landing_a_share, R.drawable.landing_b_zam, R.drawable.landing_c_bam, R.drawable.landing_d_dfile, )
    var myAdapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById<ViewPager>(R.id.viewPager) as ViewPager
        myAdapter = MyAdapter( this, images)
        viewPager!!.adapter=myAdapter


    }
}