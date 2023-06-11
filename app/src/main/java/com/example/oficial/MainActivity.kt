package com.example.oficial

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.TextView


class MainActivity : ComponentActivity() {
    var scoreTeamA = 0
    var scoreTeamB = 0
    var victories = 0
    var victories1 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
        fun teamAScored(view: View) {
            scoreTeamA++
            updateScore()
        }

        fun teamBScored(view: View) {
            scoreTeamB++
            updateScore()
        }

        fun resetScore(view: View) {
            scoreTeamA = 0
            scoreTeamB = 0
            updateScore()
        }
    fun updateScore() {
        val textTeamAScore = findViewById<TextView>(R.id.text_team_a_score)
        val textTeamBScore = findViewById<TextView>(R.id.text_team_b_score)
        val textVictories = findViewById<TextView>(R.id.text_victories)
        val textVictories1 = findViewById<TextView>(R.id.text_victories1)
        val textResultado = findViewById<TextView>(R.id.text_resultado)
        val textResultado1 = findViewById<TextView>(R.id.text_resultado1)
        textTeamAScore.text = scoreTeamA.toString()
        textTeamBScore.text = scoreTeamB.toString()
        if (scoreTeamA == 25) {
            scoreTeamA = 0
            scoreTeamB = 0
            victories++
            textVictories.text = "Time A SETS: $victories"
        } else if (scoreTeamB >= 25) {
            scoreTeamA = 0
            scoreTeamB = 0
            victories1++
            textVictories1.text = "Time B SETS: $victories1"
        }
        if (victories == 3){
            textResultado.text = "O Time A ganhou a partida"
        } else if (victories1 == 3){
            textResultado1.text = "O Time B ganhou a partida"
        }
    }
}

