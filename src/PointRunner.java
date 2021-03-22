public class PointRunner {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);
        Point p2 = new Point(1,3);
        Point p3 = new Point();
        Point p4 = p3.Add(p1,p2);
        p4.display();
    }
}
