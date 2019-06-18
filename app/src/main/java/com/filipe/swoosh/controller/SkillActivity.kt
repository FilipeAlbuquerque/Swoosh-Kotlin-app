package com.filipe.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.filipe.swoosh.R
import com.filipe.swoosh.model.Player
import com.filipe.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    //var player = Player("league", "skill")
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBallerClick(view: View){
        begginerBtn.isChecked = false
        player.skill = "baller"

    }

    fun onBegginerClick(view: View){
        ballerBtn.isChecked = false
        player.skill = "begginer"
    }

    fun onFinishClicked(view: View){
        if (player.skill !="") {
            val finishLeague = Intent(this, FinishActivity::class.java)
            finishLeague.putExtra(EXTRA_PLAYER, player)
            startActivity(finishLeague)
        } else {
            Toast.makeText(this, "Please select the skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
