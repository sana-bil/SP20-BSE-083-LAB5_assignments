public class ComplexRunner {
    public static void main(String[] args) {
        Complex C1 = new Complex(1,2);
        Complex C2 = new Complex(2,3);
        Complex C3 = new Complex();
        C3=C1.Add(C2);
        C3.Show();


    }
}
