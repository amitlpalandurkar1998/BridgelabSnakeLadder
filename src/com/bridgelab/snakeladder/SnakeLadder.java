package com.bridgelab.snakeladder;

import java.util.Random;

public class SnakeLadder {
    static int rollsTheDie(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {
        int playerOne = rollsTheDie();

        System.out.print("player One Points : "+ playerOne);

    }
}
