package com.example.dialoguebox

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are You Sure?")
            builder1.setMessage("Do you want to close the app?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when yes is clicked ?
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when no is clicked ?
            })
            builder1.show()
        }
        binding.btn2.setOnClickListener {
            val options = arrayOf("The Avengers", "Avengers age of Ultron", "Avengers Infinty War", "Avengers Endgame")
            val builder2 = android.app.AlertDialog.Builder(this)
            builder2.setTitle("Which one is Your Favourite Marvel Movie?")
            builder2.setSingleChoiceItems(options,0, DialogInterface.OnClickListener { dialog, which ->
                // Which action should be performed when user clicks on any options
                Toast.makeText(this, "You Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()

            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when yes is clicked ?
               // finish()
            })
            builder2.setNegativeButton("Declined",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when no is clicked ?
            })
            builder2.show()
        }
        binding.btn3.setOnClickListener {
            val options = arrayOf("The Avengers", "Avengers age of Ultron", "Avengers Infinty War", "Avengers Endgame")
            val builder3 = android.app.AlertDialog.Builder(this)
            builder3.setTitle("Which one is Your Favourite Marvel Movie?")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->

            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when yes is clicked ?
                // finish()
            })
            builder3.setNegativeButton("Declined",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when no is clicked ?
            })
            builder3.show()
        }
        }
        }
