package ge.edu.btu.www.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var isFirstPlayerActive = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {

        resetGame.setOnClickListener {
            ResetGame()
        }

        button00.setOnClickListener {
            setMark(button00)
        }
        button01.setOnClickListener {
            setMark(button01)
        }
        button02.setOnClickListener {
            setMark(button02)
        }
        button10.setOnClickListener {
            setMark(button10)
        }
        button11.setOnClickListener {
            setMark(button11)
        }
        button12.setOnClickListener {
            setMark(button12)
        }
        button20.setOnClickListener {
            setMark(button20)
        }
        button21.setOnClickListener {
            setMark(button21)
        }
        button22.setOnClickListener {
            setMark(button22)
        }

    }


    private fun setMark(button: Button) {

        if (button.text.isEmpty()) {
            if (isFirstPlayerActive == true) {
                button.text = "X"
                checkWinner()
                isFirstPlayerActive = false
            } else {
                button.text = "0"
                checkWinner()
                isFirstPlayerActive = true
            }
        } else {
            Toast.makeText(this, "ეს უჯრა უკვე დაკავებულია", Toast.LENGTH_SHORT).show()
        }
    }


    private fun checkWinner() {

        if (button00.text.isNotEmpty() && button00.text == button01.text && button01.text == button02.text) {
            Toast.makeText(this, "მოიგო ${button00.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button10.text.isNotEmpty() && button10.text == button11.text && button11.text == button12.text) {
            Toast.makeText(this, "მოიგო ${button10.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button20.text.isNotEmpty() && button20.text == button21.text && button21.text == button22.text) {
            Toast.makeText(this, "მოიგო ${button20.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button00.text.isNotEmpty() && button00.text == button10.text && button00.text == button20.text) {
            Toast.makeText(this, "მოიგო ${button00.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button01.text.isNotEmpty() && button01.text == button11.text && button11.text == button21.text) {
            Toast.makeText(this, "მოიგო ${button01.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button02.text.isNotEmpty() && button02.text == button12.text && button12.text == button22.text) {
            Toast.makeText(this, "მოიგო ${button02.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button00.text.isNotEmpty() && button00.text == button11.text && button11.text == button22.text) {
            Toast.makeText(this, "მოიგო ${button00.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button02.text.isNotEmpty() && button11.text == button02.text && button11.text == button20.text) {
            Toast.makeText(this, "მოიგო ${button02.text} მოთამაშემ", Toast.LENGTH_SHORT).show()
        }

        if (button00.text.isNotEmpty() && button01.text.isNotEmpty() && button02.text.isNotEmpty() && button10.text.isNotEmpty() && button11.text.isNotEmpty() && button12.text.isNotEmpty() && button20.text.isNotEmpty() && button21.text.isNotEmpty() && button22.text.isNotEmpty()) {
            Toast.makeText(this, "ფრედ დამთავრდა, მაგრამ არაუშავს", Toast.LENGTH_LONG).show()
        }

    }

    private fun ResetGame() {
        button00.text = ""
        button01.text = ""
        button02.text = ""
        button10.text = ""
        button11.text = ""
        button12.text = ""
        button20.text = ""
        button21.text = ""
        button22.text = ""
    }
}
