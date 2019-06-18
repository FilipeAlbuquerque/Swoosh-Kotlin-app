package com.filipe.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.filipe.swoosh.R
import com.filipe.swoosh.model.Player
import com.filipe.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueTxt.text = "Looking for ${player.league} ${player.skill} near you... "
    }
}
