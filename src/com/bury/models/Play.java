package com.bury.models;

public class Play {
    private final Lottery player;
    private final Lottery generated;

    public Play(Lottery player, Lottery generated) {
        this.player = player;
        this.generated = generated;
    }

    public String check() {
        int c = 1;
        while (!player.getNumbers().containsAll(generated.getNumbers())) {
            generated.setGeneratedLottery();
            c++;
        }
        return convertToTimeInfo(c);
    }

    private static String convertToTimeInfo(int c) {
        int years = c / 365;
        int months = (c % 365) / 30;
        int days = (c % 365) % 30;

        return String.format("Potrzeba %d lat, %d miesiecy i %d dni.", years, months, days);
    }
}
