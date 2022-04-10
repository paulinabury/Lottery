package com.bury.models;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lottery {
    private static final Scanner sc = new Scanner(System.in);
    private final Set<Integer> possibilities = new HashSet<>() {{
        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);
        add(10);
        add(11);
        add(12);
        add(13);
        add(14);
        add(15);
        add(16);
        add(17);
        add(18);
        add(19);
        add(20);
        add(21);
        add(22);
        add(23);
        add(24);
        add(25);
        add(26);
        add(27);
        add(28);
        add(29);
        add(30);
        add(31);
        add(32);
        add(33);
        add(34);
        add(35);
        add(36);
        add(37);
        add(38);
        add(39);
        add(40);
        add(41);
        add(42);
        add(43);
        add(44);
        add(45);
        add(46);
        add(47);
        add(48);
        add(49);
    }};
    private Set<Integer> numbers;

    public Lottery() { }

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
