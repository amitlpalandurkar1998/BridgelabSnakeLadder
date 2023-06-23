package com.bridgelab.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    static int rollsTheDie(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerOnePosition = 0;

        System.out.println("Welcome To the Snake and Ladder Game.");
        System.out.println("I am Player 1 My position is : "+ playerOnePosition);

        int playerOneDiePoint = rollsTheDie();
        playerOnePosition+=playerOneDiePoint;
        System.out.println("before "+playerOnePosition);
        switch (playerOnePosition){
            //ladder
            case 4:
                playerOnePosition=56;
                break;
            case 14:
                playerOnePosition=55;
                break;
            case 12:
                playerOnePosition=50;
                break;
            case 22:
                playerOnePosition=58;
                break;
            case 41:
                playerOnePosition=79;
                break;
            case 54:
                playerOnePosition=88;
                break;

            //Snake
            case 31:
                playerOnePosition=3;
                break;
            case 28:
                playerOnePosition=10;
                break;
            case 47:
                playerOnePosition=16;
                break;
            case 75:
                playerOnePosition=32;
                break;
            case 94:
                playerOnePosition=71;
                break;
            case 96:
                playerOnePosition=42;
                break;
        }


        System.out.println("Current Position of Player One is : "+ playerOnePosition);
    }
}
