package com.example.fahtulrahman.hellokotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.*
import org.jetbrains.anko.*

class SecondActivity:AppCompatActivity(){
    private var name : String = ""
    private var desc : String = ""
    lateinit var nameTextView : TextView
    private var imagess : Int = 0
 // lateinit var  imageView: ImageView
    private var deskripsi :String = ""
    lateinit var deskripsiTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding = dip(16)
            gravity = Gravity.CENTER_HORIZONTAL
            imageView  {

                val intent = intent
                imagess  = intent.getIntExtra("image",0)

               setImageResource(imagess)
            }.lparams(dip(100),dip(100))

            textView  {
                gravity = Gravity.CENTER_HORIZONTAL
                textSize = sp(15).toFloat()
                val intent = intent
                name  = intent.getStringExtra("name")
                text = name
            }

            textView  {
                val intent = intent
                desc  = intent.getStringExtra("desc")
                text = desc
                padding = dip(10)
                gravity = Gravity.CENTER_HORIZONTAL
            }


//            imageView = imageView()
//            nameTextView = textView()

        }


//        val intent = intent
//        name  = intent.getStringExtra("name")
//        nameTextView.text=name
    }

}