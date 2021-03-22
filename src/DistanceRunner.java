public class DistanceRunner {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(1,2);
        Distance d3 = d1.Add(d2);
        d3.display();
    }
}
