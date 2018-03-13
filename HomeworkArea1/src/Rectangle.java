public class Rectangle {
    int a,  a_1;
    int b,  b_1;
    Rectangle(int a, int a_1, int b, int b_1){
        this.a=a;
        this.a_1=a_1;
        this.b=b;
        this.b_1=b_1;
    }

    double area(){
        double result=0.0;
        if(a>0 && a_1>0 && b>0 && b_1>0){
            System.out.print("Площадь прямоугольника равна: ");
            result= Math.abs(a-b)* Math.abs(a_1-b_1);}
        else
            System.out.println("Отрицательные координаты!");
        return result;
    }
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(50,3,10,8);
        System.out.println(rectangle.area());
    }
}

