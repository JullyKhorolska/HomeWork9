package color;
import color.Color;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class CheckColor {
    public static void main(String[] args) {
        for(Color colors : Color.values()){
            System.out.println(colors.name());
            colors.hexAndRgb(colors);
            System.out.println(colors);
            System.out.println("-------------------\n");

        }
        Shape myTriangle = new Triangle(1, -1, 7, 2, 5, 6);
        Shape myCircle = new Circle(4,-1,0,2);
        Shape myCircle1 = new Circle(4,-1,0,2);
        Shape myRectangle = new Rectangle(1, -7, -3, 3, 5, 4, 5, 1, "Rectangle");

        Shape[] arrayOfShapes = { myCircle, myRectangle, myTriangle, myCircle1};
        for (Shape arrayOfShape : arrayOfShapes) {
            if(arrayOfShape == myTriangle) {
                arrayOfShape.paint(Color.RED, myTriangle);
            }else if(arrayOfShape == myCircle) {
                arrayOfShape.paint(Color.YELLOW, myCircle);
            } else if(arrayOfShape == myRectangle) {
                arrayOfShape.paint(Color.GREEN, myRectangle);
            } else  arrayOfShape.paint(Color.BROWN, myCircle1);
            System.out.println("----------------------\n");
        }
    }
}
