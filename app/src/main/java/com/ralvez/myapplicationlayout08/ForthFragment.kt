package com.ralvez.myapplicationlayout08

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ralvez.myapplicationlayout08.databinding.FragmentForthBinding


class ForthFragment : Fragment() {

    private lateinit var binding: FragmentForthBinding
    private lateinit var subjectAdapter: SubjectAdapter
    val myData1 = MyDataTest1.mySubject


    override fun onCreateView(
        inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?):View? {
        binding = FragmentForthBinding.inflate(inflater, container, false)

        val mySelected = myData1.find{it.subject == MyDataTest1.mySubjectSelected }
        var myGetmySelected  = mySelected?.syllabus
        binding.tvSelected.text =myGetmySelected

        return binding.root

    }


}
