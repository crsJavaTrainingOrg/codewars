public class Rectangle extends Shape{
    private double sideA;
    private double sideB;
    
    public Rectangle(double a, double b){
        super(4);
        sideA = a;
        sideB = b;
    }
    
    public double areaOfShape(){
        return sideA*sideB;
    }
    
    public Rectangle shapeFactory(int angles){
        if(angles ==4){
            return new Rectangle(sideA,sideB);
        }
        return null;
    }
}
