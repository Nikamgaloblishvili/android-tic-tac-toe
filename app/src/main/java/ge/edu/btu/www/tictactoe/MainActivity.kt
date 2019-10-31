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
        if (button00.text == "X" && button01.text == "X" && button02.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button00.text == "0" && button01.text == "0" && button02.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button10.text == "X" && button11.text == "X" && button12.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button10.text == "0" && button11.text == "0" && button12.text == "X0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button20.text == "X" && button21.text == "X" && button22.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button20.text == "0" && button21.text == "0" && button22.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button00.text == "X" && button11.text == "X" && button22.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
        } else if (button00.text == "0" && button11.text == "0" && button22.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button02.text == "X" && button11.text == "X" && button20.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button02.text == "0" && button11.text == "0" && button20.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button00.text == "X" && button10.text == "X" && button20.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button00.text == "0" && button10.text == "0" && button20.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button01.text == "X" && button11.text == "X" && button21.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button01.text == "0" && button11.text == "0" && button22.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button02.text == "X" && button12.text == "X" && button22.text == "X") {
            Toast.makeText(this, "მოიგო x მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        } else if (button02.text == "0" && button12.text == "0" && button22.text == "0") {
            Toast.makeText(this, "მოიგო 0 მოთამაშემ", Toast.LENGTH_SHORT).show()
            ResetGame()
        }


        if (button00.text.isNotEmpty() && button01.text.isNotEmpty() && button02.text.isNotEmpty() && button10.text.isNotEmpty() && button11.text.isNotEmpty() && button12.text.isNotEmpty() && button20.text.isNotEmpty() && button21.text.isNotEmpty() && button22.text.isNotEmpty()) {
            Toast.makeText(this, "ფრედ დამთავრდა, მაგრამ არაუშავს", Toast.LENGTH_LONG).show()
            ResetGame()
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
