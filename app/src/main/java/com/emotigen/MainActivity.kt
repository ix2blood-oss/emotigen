package com.emotigen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity:AppCompatActivity(){

override fun onCreate(savedInstanceState:Bundle?){
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)

val btn=findViewById<Button>(R.id.generate)
val result=findViewById<TextView>(R.id.result)

btn.setOnClickListener{

val emojis=EmojiEngine.generate()

val builder=StringBuilder()

emojis.forEachIndexed{index,e->
builder.append("${index+1}. ${e.action} - ${e.line}\n")
}

result.text=builder.toString()

}

}

}
