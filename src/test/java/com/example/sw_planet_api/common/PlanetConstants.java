package com.example.sw_planet_api.common;

import java.util.ArrayList;

import com.example.sw_planet_api.domain.Planet;

public class PlanetConstants {
    public static final Planet PLANET = new Planet("name", "climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet("", "", "");

    public static final Planet TATOOINE = new Planet(1L, "Tatooine", "arid", "desert");
    public static final Planet ALDERAAN = new Planet(2L, "Alderan", "temperate", "grasal");
    public static final Planet YAVINIV = new Planet(3L, "Yavin IV", "temperate", "grasal");
    public static final List<Planet> PLANETS = new ArrayList<>() {
    {
        add(TATOOINE);
        add(ALDERAAN);
        add(YAVINIV);

    }
};
}
