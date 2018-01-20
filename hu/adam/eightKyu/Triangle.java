package hu.adam.eightKyu;

import java.lang.Math;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double p;//perimeter
    
    public Triangle(double a, double b, double c){
        super(3);
        sideA = a;
        sideB = b;
        sideC = c;
        p = (a+b+c)/2;
    }
    
    public double areaOfShape(){
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
    
    public Triangle shapeFactory(int angles){
        if(angles ==3){
            return new Triangle(sideA,sideB,sideC);
        }
        return null;
    }
}
    
    
