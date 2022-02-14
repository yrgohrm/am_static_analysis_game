package se.yrgo.game.things;

import se.yrgo.game.Player;

public interface Thing {
    String getDescription();
    void use(Player player);
}
