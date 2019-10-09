//02_2

public class MyPoint {
    private  double x;
    private double y;
    private  double z;

    public double getX() {

        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public MyPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double  doudistancefromPoint(MyPoint anotherPoint){

    return  Math.sqrt((anotherPoint.x-this.x)*(anotherPoint.x-this.x)+(anotherPoint.y-this.y)*(anotherPoint.y-this.y)+(anotherPoint.z-this.z)*(anotherPoint.z-this.z));
     }

    public double distance(double anotherX, double anotherY, double anotherZ){
       return Math.sqrt((anotherX-this.x)*(anotherX-this.x)+(anotherY-this.y)*(anotherY-this.y)+(anotherZ-this.z)*(anotherZ-this.z));
    }

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0, 0, 0);
        MyPoint myPoint1 = new MyPoint(10, 30.5, 20.0);
        double v = myPoint.doudistancefromPoint(myPoint1);
        System.out.println(v);

    }
}
