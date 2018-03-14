package work2;

public class Area2Rectangle {

    private double width(Rectangle rect_1, Rectangle rect_2) {
        double length_max = Math.max(rect_1.left(), rect_2.left());
        double length_min = Math.min(rect_1.right(), rect_2.right());
        double width = Math.max(length_min - length_max, 0);
        return width;
    }

    private double height(Rectangle rect_1, Rectangle rect_2) {
        double height_max = Math.max(rect_1.lower(), rect_2.lower());
        double height_min = Math.min(rect_1.upper(), rect_2.upper());
        return Math.max(height_min - height_max, 0);
    }

    public void area(Rectangle rect_1, Rectangle rect_2){
        double result =  width(rect_1, rect_2)* height(rect_1, rect_2);
        System.out.print("Площадь пересечения прямоугольников равна: " + result);
    }

    public static void main(String[] args) {
        Rectangle rect_1 = new Rectangle(2.0,5.0,7.0,2.0);
        Rectangle rect_2 = new Rectangle(5.0, 7.0, 8.0,2.0 );
        Area2Rectangle area2rectangles = new Area2Rectangle();
        area2rectangles.area(rect_1,rect_2);

    }
}



