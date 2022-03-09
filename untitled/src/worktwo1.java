//mohasebe mofit va masahat
//Sheida Hatami
import java.util.Scanner;

public class worktwo1 {
    public static int x;
    public static int z;
    public double length;
    public double width;

    public void setlength(double length) {
        this.length = length;}

    public void setwidth(double width) {
        this.width = width;}

    public double perimeter(){
        return ((this.length*2)+(this.width*2));}

    public double area() {
        return ((this.length)*(this.width));}


    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.print("Enter length of square or rectangle ... : ");
        x= I.nextInt();
        System.out.print("Enter width of square or rectangle ... : ");
        z= I.nextInt();
        worktwo1 A =new worktwo1();
        A.setlength(x);
        A.setwidth(z);
        System.out.println("Area==");
        System.out.println(A.area());
        System.out.println("perimeter==");
        System.out.println(A.perimeter());
    }
}
