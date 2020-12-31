package com.example.checkfrag

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.checkfrag.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.*


class secondFragment : Fragment() {

    private lateinit var binding:FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val binding:FragmentSecondBinding =DataBindingUtil.inflate(inflater,R.layout.fragment_second,container,false) // we are using data biding
         // we used set onclicklistener to response to the button click

        binding.findButton.setOnClickListener{
            var w :Float =binding.AgeInput.text.toString().toFloat() // converting it to faot
            var h:Float =binding.HeightInput.text.toString().toFloat()
            h=(h/100)
            val res:Float=w/(h*h)
            val a:String="YOUR BMI IS :"
            val b:String=" %.2f".format(res)
            result.text=a.plus("").plus(b) // by this way we can concatinate string
            result.visibility=View.VISIBLE
            sharebutton.visibility=View.VISIBLE
            AgeInput.visibility=View.INVISIBLE
            HeightInput.visibility=View.INVISIBLE
            findButton.visibility=View.INVISIBLE

        }
        binding.sharebutton.setOnClickListener {
            var w :Float =binding.AgeInput.text.toString().toFloat() // converting it to faot
            var h:Float =binding.HeightInput.text.toString().toFloat()
            h=(h/100)
            val res:Float=w/(h*h)
            val a:String="YOUR BMI IS :"
            val b:String=" %.2f".format(res)
            var intent=Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"hey I just calculated my bmi and its $b")
            intent.type="text/plain"
            startActivity(intent)
        }
         return binding.root
    }


}