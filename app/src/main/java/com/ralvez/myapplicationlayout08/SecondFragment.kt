package com.ralvez.myapplicationlayout08

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ralvez.myapplicationlayout08.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var subjectAdapter: SubjectAdapter
    val myData1 = MyDataTest1.mySubject


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        val mySelected = myData1[MyDataTest1.mySubjectSelected]
        var myGetmySelected  = mySelected?.assign
        binding.tvSelected.text =myGetmySelected

        return binding.root

    }


}
