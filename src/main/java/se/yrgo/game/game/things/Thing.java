package se.yrgo.game.game.things;

import se.yrgo.game.game.Player;

public interface Thing {
    String getDescription();
    void use(Player player);
}
