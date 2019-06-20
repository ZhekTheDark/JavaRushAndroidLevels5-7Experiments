package com.example.javarushandroidlevels5_7experiments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreA: Int = 0
    var scoreB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display('A')
        display('B')
    }

    /*fun increment1(team: Char) {
        if (team == 'A') {
            scoreA ++
            display('A')
        }
        else display('B')
    }

    fun increment2(team: Char) {
        if (team == 'A') {
            scoreA += 2
            display('A')
        }
        else display('B')
    }

    fun increment3(team: Char) {
        if (team == 'A') {
            scoreA += 3
            display('A')
        }
        else display('B')
    }*/

    fun increment3A (view: View) {
        scoreA += 3
        display('A')
    }
    fun increment2A (view: View) {
        scoreA += 2
        display('A')
    }
    fun increment1A (view: View) {
        scoreA += 1
        display('A')
    }

    fun increment3B (view: View) {
        scoreB += 3
        display('B')
    }
    fun increment2B (view: View) {
        scoreB += 2
        display('B')
    }
    fun increment1B (view: View) {
        scoreB += 1
        display('B')
    }

    fun display(team: Char) {
        if (team == 'A') text_view_score_a.text = scoreA.toString()
        else text_view_score_b.text = scoreB.toString()
    }

    fun reset(view: View) {
        text_view_score_a.text = "0"
        text_view_score_b.text = "0"
    }

}