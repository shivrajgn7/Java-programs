package com.puppy.gameapp.implclass;

import com.puppy.gameapp.game.Game;

public class TicToyToyGame implements Game {
    @Override
    public void start() {
        System.out.println("game started");
    }

    @Override
    public void playTurn(String player) {
        System.out.println("game playing");
    }

    @Override
    public void end() {
        System.out.println("game is over");
    }
}
