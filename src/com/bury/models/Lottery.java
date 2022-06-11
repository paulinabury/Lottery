package com.bury.models;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lottery {
    private static final Scanner sc = new Scanner(System.in);
    private final Set<Integer> possibilities = new HashSet<>(); 
    private Set<Integer> numbers;

    public Lottery() { 
        for(int i = 0; i<=49;i++){
            possibilities.add(i);
        }
    }

    public Lottery(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public Set<Integer> getNumbers() { return this.numbers; }

    public void setPlayerLottery() {
        Set<Integer> player = new HashSet<>();
        int number;
        while (player.size() != 6) {
            System.out.println("Wpisuj liczby");
            number = sc.nextInt();
            if(possibilities.contains(number))
                player.add(number);
        }
        this.numbers = player;
    }

    public void setGeneratedLottery() {
        Random r = new Random();
        Set<Integer> temp = new HashSet<>();
        while (temp.size() != 6) {
            int number = r.nextInt(49);
            temp.add(number);
        }
        this.numbers = temp;
    }


}
