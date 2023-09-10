package me.devgrill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KreisTest {

    @Test
    void getDurchmesser() {
        Kreis k = new Kreis(2.1);
        Assertions.assertEquals(2.1, k.getDurchmesser());
    }

    @Test
    void getFlaeche() {
        Kreis k = new Kreis(2.1);
        Assertions.assertEquals(3.463605900582747,  k.getFlaeche());
    }

    @Test
    void getRadius() {
        Kreis k = new Kreis(2.1);
        Assertions.assertEquals(1.05, k.getRadius());
    }

    @Test
    void setDurchmesser() {
        Kreis k = new Kreis(4.1);
        k.setDurchmesser(2.1);
        Assertions.assertEquals(2.1, k.getDurchmesser());
    }

    @Test
    void setRadius() {
        Kreis k = new Kreis(4.1);
        k.setRadius(1.05);
        Assertions.assertEquals(2.1, k.getDurchmesser());
    }
}