package com.example.complexui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.complexui.R

class FirstFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflating the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Find the EditText and Button by their IDs
        val editText = view.findViewById<EditText>(R.id.editTextInput)
        val button = view.findViewById<Button>(R.id.buttonSend)

        // Set an OnClickListener to the button
        button.setOnClickListener {
            val inputText = editText.text.toString()

            // Create a Bundle to pass data
            val bundle = Bundle()
            bundle.putString("KEY_TEXT", inputText)

            // Create an instance of the second fragment and pass the data to it
            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle

            // Replace the current fragment with the second one
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, secondFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
