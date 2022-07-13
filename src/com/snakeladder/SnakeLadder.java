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


        while (position < WINING_POSITION) {
            int dieNum = rollDie();
            int option = checkOption();

            System.out.println(position+" d "+dieNum +" o "+option);
            switch (option) {
                case SNAKE:
                    //position -= dieNum;
                    position = position - dieNum ;
                    if(position<INITIAL_POSITION){
                        position=INITIAL_POSITION;
                    }
                    break;
                case LADDER:
                    if(position+dieNum < WINING_POSITION)
                    {
                        //position+=dieNum;
                        position = position + dieNum ;
                    }
                    break;
                case NO_PLAY:
                    break;
                default:
            }
        }
    }
}
