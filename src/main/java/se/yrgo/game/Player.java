package se.yrgo.game;

import java.util.Random;

public class Player {
    private String name;
    private int health;
    private Room currentRoom;

    /**
     * Create a new player with the given name and a random starting
     * health,  50 <= healt <= 100
     * @param name
     */
    public Player(String name) {
        if (name == null || name.isBlank())
            new IllegalArgumentException("Not a valid name");

        Random r = new Random();
        this.name = name;
        this.health = 50 + r.nextInt(51);
    }

    public String getName() {
        return name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void increaseHealth(int amount) {
        if (amount > 0) {
            health =+ amount;
            health = Math.min(health, 100);
        }
    }

    public void decreaseHealth(int amount) {
        if (amount > 0) {
            health -= amount;
            health = Math.max(health, 0);
        }
    }

    public int getHealth() {
        return health;
    }

    public String tostring() {
        return String.format("%s (%d) in %s", name, health, currentRoom.getDescription());
    }
}
