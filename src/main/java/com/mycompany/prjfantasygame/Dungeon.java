
package com.mycompany.prjfantasygame;


public class Dungeon 
{
      private String description;
    
    // Constructor to initialise the dungeon with a description
    public Dungeon(String description) 
    {
        this.description = description;
    }

    // Method to get the dungeon's description
    public String getDescription() 
    {
        return description;
    }

    // Method to describe the dungeon (available to be overridden by subclasses)
    public void describe() 
    {
        System.out.println(description);
    }
}



