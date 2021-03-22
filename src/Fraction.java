public class Fraction {
    private int num1;
    private int num2;

    public Fraction() {
    }

    public Fraction(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void setNum1(int a) {
        num1 = a;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int a) {
        num2 = a;
    }

    public int getNum2() {
        return num2;
    }

    public int gcd(int a, int b){
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }



    public Fraction ratio (Fraction f){

        Fraction new_f = new Fraction(f.num1 / f.gcd(f.getNum1(), f.getNum2()), f.num2 / f.gcd(f.getNum1(), f.getNum2()));
            return new_f;

    }

    public void display () {
            System.out.println(num1 + " : " + num2);
    }

    public boolean equals(Fraction a, Fraction aa){
        if (ratio(a)!=ratio(aa)){
            return false;
        }
        else return true;
    }

}


