package com.bury;

import com.bury.models.Lottery;
import com.bury.models.Play;

public class Main {
    public static void main(String[] args) {
        Lottery generated = new Lottery();
        generated.setGeneratedLottery();

        Lottery player = new Lottery();
        player.setPlayerLottery();

        Play play = new Play(player, generated);
        String result = play.check();
        System.out.println(result);
    }
}
