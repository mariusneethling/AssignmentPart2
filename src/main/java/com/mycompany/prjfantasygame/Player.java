
package com.mycompany.prjfantasygame;


public class Player 
{
      private String name;
    private int health;
    private int score;

    // Constructor to initialise the player with a name and a starting health/score
    public Player(String name) 
    {
        this.name = name;
        this.health = 100;  // Default starting health
        this.score = 0;     // Default starting score
    }

    // Getter for player name
    public String getName() 
    {
        return name;
    }

    // Getter for player health
    public int getHealth() 
    {
        return health;
    }

    // Getter for player score
    public int getScore() 
    {
        return score;
    }

    // Method to reduce the player's health
    public void takeDamage(int damage) 
    {
        this.health -= damage;
        if (health < 0) 
        {
            health = 0;
        }
    }

    // Method to add points to the player's score
    public void addScore(int points) 
    {
        this.score += points;
    }

    // Method to check if the player is alive
    public boolean isAlive() 
    {
        return health > 0;
    }
}
