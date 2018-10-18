package com.company;

import ru.ifmo.se.pokemon.Pokemon;

public class Mandibuzz extends Pokemon {
    public Mandibuzz(String name, int level) {
        super(name, level);
        this.setStats(110D, 65D, 105D, 55D, 95D, 80D);
        this.setMove(new FeintAttack(), new DoubleTeam(), new Rest(), new BoneRush());
    }
}
