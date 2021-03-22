public class ObjectPassRunner {
    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value=10;
        System.out.println("value before calling the function "+ p.value);
        p.increment(p);
        System.out.println("Value after calling the function "+ p.value);


    }

}
