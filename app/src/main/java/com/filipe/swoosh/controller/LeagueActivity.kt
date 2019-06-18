package com.filipe.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.filipe.swoosh.R
import com.filipe.swoosh.model.Player
import com.filipe.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("league", "skill")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensClicked (view : View){
        womensLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        player.league = "men"

    }

    fun onWomensCLicked (view: View){

        mensLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        player.league = "women"
    }

    fun onCoedClicked(view: View){

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "co-ed"

    }

    fun leagueNextClicked(view: View){
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
