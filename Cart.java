package com.hunter.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Game> items = new ArrayList<>();

    public void addGame(Game game) {
        items.add(game);
    }

    public void removeGame(Game game) {
        items.remove(game);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Game::getPrice).sum();
    }

    public List<Game> getItems() {
        return new ArrayList<>(items);
    }

    public void checkout() {
        items.clear();
    }
}
