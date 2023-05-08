package com.example.lab6_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.lab6_1.databinding.FragmentMultiplicationTableBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [MultiplicationTable.newInstance] factory method to
 * create an instance of this fragment.
 */
class MultiplicationTable : Fragment() {
    private lateinit var binding: FragmentMultiplicationTableBinding
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMultiplicationTableBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fillText()

    }

    fun fillText(){
        binding.tvEl1.text = param1
        binding.tvEl2.text = param1
        binding.tvEl3.text = param1
        binding.tvEl4.text = param1
        binding.tvEl5.text = param1
        binding.tvEl6.text = param1
        binding.tvEl7.text = param1
        binding.tvEl8.text = param1
        binding.tvEl9.text = param1
        binding.tvEl10.text = param1

        binding.tvRes1.text= (1 * (binding.tvEl1.text.toString().toInt())).toString()
        binding.tvRes2.text= (2 * (binding.tvEl2.text.toString().toInt())).toString()
        binding.tvRes3.text= (3 * (binding.tvEl3.text.toString().toInt())).toString()
        binding.tvRes4.text= (4 * (binding.tvEl4.text.toString().toInt())).toString()
        binding.tvRes5.text= (5 * (binding.tvEl5.text.toString().toInt())).toString()
        binding.tvRes6.text= (6 * (binding.tvEl6.text.toString().toInt())).toString()
        binding.tvRes7.text= (7 * (binding.tvEl7.text.toString().toInt())).toString()
        binding.tvRes8.text= (8 * (binding.tvEl8.text.toString().toInt())).toString()
        binding.tvRes9.text= (9 * (binding.tvEl9.text.toString().toInt())).toString()
        binding.tvRes10.text= (10 * (binding.tvEl10.text.toString().toInt())).toString()
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            MultiplicationTable().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}