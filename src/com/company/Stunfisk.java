package com.company;

import ru.ifmo.se.pokemon.Pokemon;

public class Stunfisk extends Pokemon {
    public Stunfisk(String name, int level) {
        super(name, level);
        this.setStats(109D, 66D, 84D, 81D, 99D, 32D);
        this.setMove(new ShockWave(), new Discharge(), new EarthPower(), new DoubleTeam());
        //this.setMove(new Discharge());
    }
}
