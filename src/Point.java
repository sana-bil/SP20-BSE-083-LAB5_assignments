public class Point {
    private int x;
    private int y;

    public Point(){
        x=2;
        y=9;
    }

    public Point(int a, int b){
        x=a;
        y=b;
    }

    public void setX(int a){
        x=a;
    }

    public void setY(int b){
        y=b;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Point Add(Point a , Point b){
        Point new_p = new Point(a.x+ b.x+x,a.y+b.y+y);
        return new_p;
    }

    public void display(){
        System.out.println("x= "+ x);
        System.out.println("y= "+ y);
    }
}
