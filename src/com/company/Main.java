package com.company;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Stunfisk("Serega", 75);
        Pokemon p2 = new Mandibuzz("Levon", 75);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}