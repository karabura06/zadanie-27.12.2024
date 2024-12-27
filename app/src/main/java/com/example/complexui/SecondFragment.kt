package com.example.complexui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.complexui.R

class SecondFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val textView = view.findViewById<TextView>(R.id.textViewOutput)

        // Получаем данные из Bundle
        val receivedText = arguments?.getString("KEY_TEXT")
        textView.text = receivedText

        return view
    }
}
