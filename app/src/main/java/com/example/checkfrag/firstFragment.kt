package com.example.checkfrag

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.checkfrag.databinding.FragmentFirstBinding


class firstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding :FragmentFirstBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
        setHasOptionsMenu(true)
        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment) // this is used to move from one fragment tp another
             // this is for opening menu
        }
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.aboutmenu,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,view!!.findNavController())||super.onOptionsItemSelected(item)
    }

}