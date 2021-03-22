public class Distance {
    private int feet;
    private int inch;

    public Distance(){
        feet=1;
        inch=22;
    }

    public Distance(int f, int i){
        feet=f;
        inch=i;
    }

    public void setFeet(int f){
        feet=f;
    }

    public int getFeet(){
        return feet;
    }

    public void setInch(int i){
        inch=i;
    }

    public int getInch(){
        return inch;
    }

    public Distance Add(Distance d){
        Distance d_new = new Distance(d.feet+feet,inch+d.inch);
        return d_new;
    }

    public void display(){
        System.out.println("Feet = "+ feet);
        System.out.println("Inch = "+ inch);
    }

}
