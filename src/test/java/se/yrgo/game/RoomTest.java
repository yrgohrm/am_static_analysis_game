package se.yrgo.game;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testAddRoom() {
        Room room1 = new Room("room1");
        Room room2 = new Room("room2");

        room1.addConnectedRoom(room2);
        
        assertTrue(room1.getConnectedRooms().contains(room2));
        assertTrue(room2.getConnectedRooms().contains(room1));
    }    
}
