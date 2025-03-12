
package bai7;

public class Constructor  {
    private double a;
    private double b;
    private double c;

    public Constructor (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b*b - 4*a*c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        if (b*b - 4*a*c >= 0){
            return (-b + Math.sqrt(b*b - 4*a*c)) / (2 * a);
        }else {
            return Double.NaN;
        }
    }

    public double getRoot2() {
        if (b*b - 4*a*c >= 0){
            return (-b - Math.sqrt(b*b - 4*a*c)) / (2 * a);
        }else {
            return Double.NaN;
        }
    }

    public void displayData() {
        if (hasRealRoots()) {
            if (getRoot1() == getRoot2()) {
                System.out.println("Phương trình có một nghiệm kép: x = " + getRoot1());
            } else {
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + getRoot1());
                System.out.println("x2 = " + getRoot2());
            }
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
