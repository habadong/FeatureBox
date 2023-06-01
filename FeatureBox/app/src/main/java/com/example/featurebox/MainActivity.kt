package com.example.featurebox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.featurebox.databinding.ActivityMainBinding
import com.example.featurebox.fragment.HomeFragment
import com.example.featurebox.fragment.MapFragment
import com.example.featurebox.fragment.MoreFragment
import com.example.featurebox.fragment.TaggingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigationBar()

        changeFragment(HomeFragment())
    }

    private fun initBottomNavigationBar(){
        binding.bottomNavigationBar.run {
            setOnItemSelectedListener { item ->
                when(item.itemId){
                    R.id.menu_home -> {
                        changeFragment(HomeFragment())
                        true
                    }
                    R.id.menu_map ->{
                        changeFragment(MapFragment())
                        true
                    }
                    R.id.menu_tag ->{
                        changeFragment(TaggingFragment())
                        true
                    }
                    R.id.menu_more ->{
                        changeFragment(MoreFragment())
                        true
                    }
                    else -> true
                }
            }
        }
    }

    //프래그먼트 전환 위한 함수. 버튼을 눌렀을 때 해당 프래그먼트로 전달.
    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.mainFrameLayout, fragment).commit()
    }
}