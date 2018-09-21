/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author Christopher
 */

public class Main {
    public static void main(String[] args)
    {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.setModel("cruz");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model: " + holden.getModel());
    }

}
