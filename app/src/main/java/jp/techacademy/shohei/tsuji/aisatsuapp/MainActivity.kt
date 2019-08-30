package jp.techacademy.shohei.tsuji.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View){
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
            if(hour in 2..9){
                textView.text = "おはよう"
            }else if(hour in 10..17){
                textView.text = "こんにちは"
            }else{
                textView.text = "こんばんは"
            }},
            1, 0, true)
        timePickerDialog.show()
    }
}
