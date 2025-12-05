package com.puppy.gameapp.game;

public interface Game {
    void start();

    void playTurn(String player);

    void end();
}
