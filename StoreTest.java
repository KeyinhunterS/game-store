package com.hunter.gamestore;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    void testAddGameToCart() {
        Cart cart = new Cart();
        Game game = new Game("Halo", 59.99);
        cart.addGame(game);
        assertEquals(1, cart.getItems().size());
    }

    @Test
    void testRemoveGameFromCart() {
        Cart cart = new Cart();
        Game game = new Game("Zelda", 69.99);
        cart.addGame(game);
        cart.removeGame(game);
        assertTrue(cart.getItems().isEmpty());
    }

    @Test
    void testCartTotalCalculation() {
        Cart cart = new Cart();
        cart.addGame(new Game("Game1", 19.99));
        cart.addGame(new Game("Game2", 39.99));
        assertEquals(59.98, cart.getTotalPrice(), 0.01);
    }
}
