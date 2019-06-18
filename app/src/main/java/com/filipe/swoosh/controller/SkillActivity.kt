package com.filipe.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.filipe.swoosh.utilities.EXTRA_LEAGUE
import com.filipe.swoosh.R
import com.filipe.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill  = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBallerClick(view: View){
        begginerBtn.isChecked = false
        skill = "baller"

    }

    fun onBegginerClick(view: View){
        ballerBtn.isChecked = false
        skill = "begginer"
    }

    fun onFinishClicked(view: View){
        if (skill !="") {
            val finishLeague = Intent(this, FinishActivity::class.java)
            finishLeague.putExtra(EXTRA_LEAGUE, league)
            finishLeague.putExtra(EXTRA_SKILL, skill)
            startActivity(finishLeague)
        } else {
            Toast.makeText(this, "Please select the skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
