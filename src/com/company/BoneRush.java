package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BoneRush extends PhysicalMove {
    public BoneRush() {
        super(Type.GROUND, 25, 0.9D, 0, (int) Math.round(Math.random() * 3) + 2);
    }
}
