package com.filipe.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.filipe.swoosh.R
import com.filipe.swoosh.utilities.EXTRA_LEAGUE
import com.filipe.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking for $league $skill near you... "
    }
}
