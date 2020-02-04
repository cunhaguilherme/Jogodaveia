package br.com.guilhermecunha.jogodaveia.views

import androidx.test.rule.ActivityTestRule
import br.com.guilhermecunha.jogodaveia.R
import br.com.guilhermecunha.jogodaveia.models.Player
import br.com.guilhermecunha.jogodaveia.views.game.GameActivity
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Rule
import org.junit.Test

class GameEndDialogTest {
    @Rule
    @JvmField
    var activityRule: ActivityTestRule<GameActivity> =
        ActivityTestRule(GameActivity::class.java)
    private fun givenGameEnded() {
        activityRule.activity.onGameWinnerChanged(Player("Heider", "x"))
    }
    @Test
    @Throws(Exception::class)
    fun display_winner_when_game_ends() {
        givenGameEnded()
        assertDisplayed(R.id.tvWinner)
    }
}