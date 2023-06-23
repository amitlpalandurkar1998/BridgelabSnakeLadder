package com.bridgelab.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    static boolean WINNING_POSITION = true;
    static int NUM_OF_TIMES_DIE_ROOLS =0;
    static int rollsTheDie(){
        NUM_OF_TIMES_DIE_ROOLS+=1;
        // player rolls the die and get the points.
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int playerOnePosition = 0;

        System.out.println("Welcome To the Snake and Ladder Game.");
        System.out.println("I am Player 1 My position is : "+ playerOnePosition);

        while (WINNING_POSITION){
            //player rolls the die .
            int playerOneDiePoint = rollsTheDie();
            if ((playerOnePosition+playerOneDiePoint)>=101){
                // ensure and check the player not get position more  100.
            }else {
                //After getting the points it will be added to the last position.
                playerOnePosition += playerOneDiePoint;
            }
            switch (playerOnePosition) {
                //ladder
                case 4:
                    playerOnePosition = 56;
                    break;
                case 14:
                    playerOnePosition = 55;
                    break;
                case 12:
                    playerOnePosition = 50;
                    break;
                case 22:
                    playerOnePosition = 58;
                    break;
                case 41:
                    playerOnePosition = 79;
                    break;
                case 54:
                    playerOnePosition = 88;
                    break;

                //Snake
                case 31:
                    playerOnePosition = 3;
                    break;
                case 28:
                    playerOnePosition = 10;
                    break;
                case 47:
                    playerOnePosition = 16;
                    break;
                case 75:
                    playerOnePosition = 32;
                    break;
                case 94:
                    playerOnePosition = 71;
                    break;
                case 96:
                    playerOnePosition = 42;
                    break;
            }

            System.out.println("Current Position of Player One is : " + playerOnePosition);

            if (playerOnePosition==100){
                System.out.println(NUM_OF_TIMES_DIE_ROOLS+" Numbers of times the dice was played to win the game.");
                //if player rich the position 100 he will be winning.
                System.out.println("The Player One Winning The Game.");
                WINNING_POSITION = false;
            }
        }
    }
}
