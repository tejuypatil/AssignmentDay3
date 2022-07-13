package com.snakeladder;

public class SnakeLadder {
    //public enum option{NO_PLAY,SNAKE,LADDER}
    static int INITIAL_POSITION = 0;
    static final int WINING_POSITION = 100;
    final static int NO_PLAY = 1;
    final static int SNAKE = 2;
    final static int LADDER = 3;

    public static int position = 0;

    public static int checkOption() {
        int random = (int) (Math.random() * 10) % 3 + 1;
        return random;
    }

    public static int rollDie() {
        int randomCheck = (int) (Math.random() * 6);
        return randomCheck + 1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder:\n" +
                "            _ _ _ _ _ _\n" +
                "~~~~====:>  _|_|_|_|_|_\n\n");
        System.out.println("Player : at " + position + " position");
        int dieNum = rollDie();
        System.out.println("Got number after  player rolls the die:" + dieNum);
        position = dieNum + position;
        System.out.println("Check the position :" + position);
        int option = checkOption();

        while (position < WINING_POSITION) {
            switch (option) {
                case SNAKE:
                    position -= dieNum;
                    break;
                case LADDER:
                    position += dieNum;
                    break;
                case NO_PLAY:
                    break;
            }
        }
    }
}
