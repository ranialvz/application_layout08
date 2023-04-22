package com.ralvez.myapplicationlayout08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.material.tabs.TabLayoutMediator
import com.ralvez.myapplicationlayout08.databinding.ActivitySubjectBinding

class SubjectActivity : AppCompatActivity() {
    lateinit var binding: ActivitySubjectBinding
    val myData1 = MyDataTest1.mySubject

    override fun onCreate(savedInstanceState: Bundle?) {


        binding = ActivitySubjectBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val fragmentsList = arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment(),ForthFragment())

        binding.apply{
            viewPager.adapter = ViewPagerAdapter(fragmentsList, this@SubjectActivity.supportFragmentManager, lifecycle)
            TabLayoutMediator(tabView, viewPager){ tab, position ->



                when(position){


                    0 -> { tab.text = "Announcement"
                        //tab.icon = ContextCompat.getDrawable(this@SubjectActivity, R.drawable.ic_home_24)
                    }
                    1 -> {tab.text = "Assignment"

                    }
                    2 -> { tab.text = "Notes"

                    }
                    3 -> { tab.text = "Syllabus"

                    }
                }
            }.attach()



        }
        val mySelected = myData1[MyDataTest1.mySubjectSelected]
        var myGetmySelected  = mySelected?.subject
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = myGetmySelected
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true


    }




}