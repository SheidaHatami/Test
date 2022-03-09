import java.util.Scanner;
//hal moadelat va dastgah

public class worktwo3 {

    public static int x;
    public static int y;

    public void setA(int a) {
        worktwo3.a = a;
    }
    public static int a;
    public void setB(int b) {
        worktwo3.b = b;
    }
    public static int b;
    public void setC(int c) {
        worktwo3.c = c;
    }
    public static int c;
    public void setD(int d) {
        worktwo3.d = d;
    }
    public static int d;

    public int f;//adad sabet
    public int e;//adad sabet

    public int f(){
        return f = (c*x)+(d*y);
    }
    public int e(){
        return e = (a*x+b*y);
    }

    public void answerX(){
        x = ((e*d)-(b*f))/((a*d)-(b*c));
    }
    public void answerY(){
        y = ((f*a)-(c*e))/((a*d)-(b*c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To find X and Y : ");

        System.out.print("Enter a=");
        a = scanner.nextInt();
        System.out.print("Enter b=");
        b = scanner.nextInt();
        System.out.print("Enter c=");
        c = scanner.nextInt();
        System.out.print("Enter d=");
        d = scanner.nextInt();

        worktwo3 P=new worktwo3();
        P.setA(a);P.setB(b);P.setC(c);P.setD(d);

        System.out.println ("x is =");
        System.out.println();P.answerX();
        System.out.println ("y is =");
        System.out.println();P.answerY();
    }
}


