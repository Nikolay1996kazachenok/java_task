package work2;

public class Rectangle {
    double a, a_1;
    double b, b_1;
    Rectangle(double a, double a_1, double b, double b_1){
        this.a=a;
        this.a_1=a_1;
        this.b=b;
        this.b_1=b_1;
    }

    public double left() {
        if(a>b) return b;
        else return a;
    }

    public double right() {
        if(a>b) return a;
        else return b;
    }

    public double upper() {
        if(a_1>b_1) return a_1;
        else return b_1;
    }

    public double lower() {
        if(a_1>b_1) return b_1;
        else return a_1;
    }

}
