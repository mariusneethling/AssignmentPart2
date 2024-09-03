

package com.mycompany.prjfantasygame;
import java.util.Scanner;
import java.util.Random;

public class PrjFantasyGame 
{
    //Declaring an array to store the different dungeons in the game
    private static Dungeon[] dungeons;  
    private static Player player;       
    private static Scanner scanner = new Scanner(System.in);
    //declaring a random object to create random numbers
     private static Random random = new Random();

    public static void main(String[] args) 
    {
        initialiseGame();
        startGame();
    }

    // Initialise the game with the dungeons and the player
    private static void initialiseGame() 
    {
        player = new Player("Hero");

        // Creating an array of different dungeons
        dungeons = new Dungeon[3];
        dungeons[0] = new Dungeon("You see a dark, empty dungeon with broken tools and cobwebs.");
        dungeons[1] = new TreasureChamber("You see a chamber with a a glowing chest.", "Mythical Sword");
        dungeons[2] = new Dungeon("You see a dungeon with a massive, sleeping dragon.");

        System.out.println("Welcome, " + player.getName() + ", to the Greatest Fantasy Game!");
    }

    // Main game loop
    private static void startGame() 
    {
        //for loop to run through all the dungeons in the game
        for (int i = 0; i < dungeons.length; i++) 
        {
            System.out.println("\nEntering dungeonroom " + (i + 1) + ".....");
            dungeons[i].describe();

            //if statement to check wether the dungeon contains a hidden treasure chamber
            if (dungeons[i] instanceof TreasureChamber) 
            {
                TreasureChamber treasureChamber = (TreasureChamber) dungeons[i];
                System.out.println("In your hand you now hold a " + treasureChamber.getTreasure() + "!");
                
                // Adding points for finding treasure to the players score
                player.addScore(100);  
            }
            //if statement to check wether the dungeon contains a dragon
            else if (dungeons[i].getDescription().contains("dragon")) 
            {
                System.out.println("You have encountered a dragon!");
                System.out.println("Do you want to (1) fight or (2) flee?");
                int choice = scanner.nextInt();
                
                   if (choice == 1) 
                   {
                    // Generating a random damage number between 50 and 150
                    //GeeksforGeeks. Generating random numbers in Java.
                    int dragonDamage = random.nextInt(101) + 50;
                    System.out.println("You strike first, but the dragon retorts with " + dragonDamage + " fire damage.");
                    player.takeDamage(dragonDamage);
                    
                    //checking to see if the player survived the attack
                    if (!player.isAlive()) 
                    {
                        System.out.println("You have been burnt to a crisp by the dragon.");
                        break;
                    }
                } 
                else 
                {
                    System.out.println("You survive by the skin of your teeth and retreat back to safety.");
                }
            }
        }

        endGame();
    }

    // Ending the game and displaying the final score of the player as well as if they survived the ordeal
    private static void endGame() 
    {
        if (player.isAlive()) 
        {
            player.addScore(50);
            System.out.println("Congratulations, " + player.getName() + "! You completed your adventure like a true warrior!");
        } 
        else 
        {
            System.out.println("Game Over! Better luck next time brave warrior.");
        }

        System.out.println("Your final score is: " + player.getScore());
    }
    
}
/*
Reference List:
   1. GeeksforGeeks. 2023. Random number generating. (Version 1.0- SNAPSHOT)
      https://www.geeksforgeeks.org/generating-random-numbers-in-java/ . (Accessed 30 August 2024)
   
   2. Farrel, J. 2023. Java Programming 9th Edition Cengage. 

*/