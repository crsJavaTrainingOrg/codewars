package hu.adam.eightKyu;

import java.lang.Math;

public class Circle extends Shape{
    private double r;
    
    public Circle(double radius){
        super(0);
        r = radius;
        
    }
    
    public double areaOfShape(){
        return Math.PI*(r*r);
    }
    
    public Circle shapeFactory(int angles){
        return new Circle(r);
    }
}
        
    
        
