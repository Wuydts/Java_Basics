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

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour; 
    
    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        
        if(validModel.equals("carrera") || validModel.equals("comodore"))
            this.model = model;
        else
            this.model = "Error";
    }
    public String getModel() 
    {
        return this.model;
    }
    
}
