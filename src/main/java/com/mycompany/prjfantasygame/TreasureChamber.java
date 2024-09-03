
package com.mycompany.prjfantasygame;

// Subclass of the dungeon that represents a treasure chamber
public class TreasureChamber extends Dungeon 
{
    private String treasure;

    // Constructor to initialise a treasure chamber with a fitting description and a treasure
    public TreasureChamber(String description, String treasure) 
    {
        super(description);
        this.treasure = treasure;
    }

    // Method to get the treasure in the chamber
    public String getTreasure() 
    {
        return treasure;
    }

    // Overriding the describe method to include the treasure information
    @Override
    public void describe() 
    {
        super.describe();
        System.out.println("You have found a treasure: " + treasure);
    }
    
}
