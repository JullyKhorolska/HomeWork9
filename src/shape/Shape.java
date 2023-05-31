package shape;
import color.Color;

public class Shape {
    public Shape(){

    }
    public String color;
    public String name;

    public void calculateArea(){
        System.out.println("This method is used for shape's area calculation");
    }
    public void calculatePerimeter(){
        System.out.println("This method is used for shape's perimeter calculation");
    }
    public void paint(Color color, Object exp){
       this.color = color.name();
       this.name = String.valueOf(exp);
    System.out.println(this.name + " and it's " + this.color);
    }

}
