package com.pluarlsight;

import java.util.Scanner;

public class BlackJack {
    static Scanner scan = new Scanner(System.in);
    static boolean playerMenuOpen = true;
    static boolean endApp = false;

    public static boolean welcome() {
        System.out.println("Welcome to the BlackJack table\nPress 1 to Begin\nPress 0 to Exit");
        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Exiting . . .");
                endApp = true;
                break;
            case 1:
                setUp();
                break;
        }
        return endApp;
    }

    public static void round () throws InterruptedException {
        int round = 1;
        System.out.println("Round " + round);

        //dealCards();
        Player.playerMenu();

        round++;
    }

    public static void setUp () {
        System.out.println("What is your name?");
        scan.nextLine();
        String name = scan.nextLine();
        Player newPlayer = new Player(name);
        System.out.println("How many other players are there?");
        int playerCount = scan.nextInt();
        //generatePlayers();
    }

    public static void players (Player player) {

    }

}
class Player {
    private String name;
    private int score;
    private String [] cardsInHand = new String [2];

    public Player (String name) {
        this.name = name;
    }

    public Player (int score) {
        this.score = score;
    }

    public Player (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }


    /*public static Player add(String name) {
        Player.setName = name;
        this.setScore() = 0;
        Player player = new Player();
        return player;
    }*/

    public static void playerMenu() throws InterruptedException {
        while (BlackJack.playerMenuOpen) {
            System.out.println("""
                    What do you want to do?
                    1) Look at hand
                    2)
                    3)
                    0) End Turn
                    """);
            int input = BlackJack.scan.nextInt();
            switch (input) {
                case 0 :
                    System.out.print("Turn Ended");
                    System.out.println("Waiting on other players");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    //TODO
                    //otherPlayersTurn();
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    break;
                case 1:
                    lookAtHand();
                    break;
                case 2:
                    //TODO
                    //System.out.println("Your opponent has a " + randomGenCard());
                    System.out.println("Whoops! Looks like you got caught!\n" +
                            "You are now banned for 7 days!\n" +
                            "Maybe dont get caught next time!");
                    //write to .csv DateTime now and after welcome screen read from .csv
                    BlackJack.endApp = true;
                    break;


            }
        }
    }
}
class myMain {

public static void main(String[] args) throws InterruptedException {
    BlackJack.welcome();
    while (!BlackJack.endApp) {
        BlackJack.round();
        //deal etc

    }
    BlackJack.scan.close();
}
}
