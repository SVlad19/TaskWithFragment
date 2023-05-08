package com.example.lab6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lab6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFirst.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("1")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnSecond.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("2")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnThird.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("3")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnFourth.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("4")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnFifth.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("5")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnSixth.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("6")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnSeventh.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("7")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnEighth.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("8")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnNinth.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("9")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }

        binding.btnTenth.setOnClickListener(){
            val fragment = MultiplicationTable.newInstance("10")

            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.flCont, fragment)

            transaction.commit()
        }



    }
}