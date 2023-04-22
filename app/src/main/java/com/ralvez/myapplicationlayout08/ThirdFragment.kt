package com.ralvez.myapplicationlayout08

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ralvez.myapplicationlayout08.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var subjectAdapter: SubjectAdapter
    val myData1 = MyDataTest1.mySubject


    override fun onCreateView(
        inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?):View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)

        val mySelected = myData1[MyDataTest1.mySubjectSelected]
        var myGetmySelected  = mySelected?.note
        binding.tvSelected.text =myGetmySelected

        return binding.root

    }


}
