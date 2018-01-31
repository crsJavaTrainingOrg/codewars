package hu.adam.eightKyu;

public abstract class Shape{
    protected int angles;
    public Shape(int angles){
        this.angles = angles;
    }
        
    public abstract double areaOfShape();
    public abstract Shape shapeFactory(int angles);
}