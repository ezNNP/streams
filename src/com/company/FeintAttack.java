package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK, 60D, 1.0D);
    }
}
