
public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width  =  width;
    }

    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 0.5 * (length + width);
    }


 public static void main(String[] args){
        Rectangle rect = new Rectangle(3,5);
        double area = rect.area();
        double perimeter = rect.perimeter();

        System.out.println("The area is" + rect.area());
        System.out.println("The perimeter is" + rect.perimeter());
        
    }

}

