package pl.aplikacje

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.logo_hip)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text -> view.setBackgroundColor(Color.CYAN)

            R.id.textView17 -> view.setBackgroundColor(Color.BLACK)
            R.id.textView15 -> view.setBackgroundColor(Color.CYAN)
            R.id.textView18 -> view.setBackgroundColor(Color.BLUE)
            R.id.textView16 -> view.setBackgroundColor(Color.YELLOW)



            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val boxSixText = findViewById<TextView>(R.id.textView17)
        val boxSevenText = findViewById<TextView>(R.id.textView15)
        val boxEightText = findViewById<TextView>(R.id.textView18)
        val boxNineText = findViewById<TextView>(R.id.textView16)



        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                boxSixText, boxSevenText, boxEightText,boxNineText
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}