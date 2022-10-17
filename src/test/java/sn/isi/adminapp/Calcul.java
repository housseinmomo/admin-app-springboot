package sn.isi.adminapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class Calcul {

    @Test
    public void somme(){
        int a = 2;
        int b = 2;
        int somme = a + b;
        Assertions.assertEquals(4, somme);
    }

    @Test
    public void say_hello(){
        System.out.println("Hello world");
    }
}
