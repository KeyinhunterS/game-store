package com.hunter.gamestore;

import java.util.List;

public class Store {
    private final List<Game> inventory;

    public Store(List<Game> games) {
        this.inventory = games;
    }

    public List<Game> browseGames() {
        return inventory;
    }
}
