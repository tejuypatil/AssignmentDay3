package com.snakeladder;

import java.util.Scanner;

public class SnakeLadder {
    static int INITIAL_POSITION = 0;
    static final int WINING_POSITION = 100;
    final static int NO_PLAY = 1;
    final static int SNAKE = 2;
    final static int LADDER = 3;

    public static int position = 0;
    static int dieCount;
    public static int checkOption() {
        int random = (int) (Math.random() * 10) % 3 + 1;
        return random;
    }

    public static int rollDie() {
        dieCount++;
        int randomCheck = (int) (Math.random() * 6);
        return randomCheck + 1;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder:\n" +
                "            _ _ _ _ _ _\n" +
                "~~~~====:>  _|_|_|_|_|_\n\n");
        Scanner user=new Scanner(System.in);

        while (position < WINING_POSITION) {
            System.out.println("Roll the die:");
            user.nextLine();
            int dieNum = rollDie();
            int option = checkOption();

            switch (option) {
                case SNAKE:
                    position = position - dieNum ;
                    if(position<INITIAL_POSITION){
                        position=INITIAL_POSITION;
                    }
                    break;
                case LADDER:
                    if(position+dieNum <= WINING_POSITION)
                    {
                        position = position + dieNum ;
                    }
                    break;
                case NO_PLAY:
                    break;
                default:
            }
            System.out.println("pos "+position+" die "+dieNum +" opt "+option);
        }
        System.out.println("Current position= "+position);
        System.out.println("dieCount= " +dieCount);
    }
}
