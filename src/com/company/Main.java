package com.company;

import Personagens.Cliente;
import Repositorios.Hotelzinho;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente("cliente de teste",12,"M", "12345", LocalDate.now(), null);
        Hotelzinho h = new Hotelzinho(10);
        System.out.println(c.toString());

    }
}
