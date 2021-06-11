package Evolvable;

import Enums.EvolutionStones;
import Pokemon.Pokemon;

public interface StoneEvolvable extends Evolvable {
    Pokemon evolve(EvolutionStones stone);
}
