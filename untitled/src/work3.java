import  java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        int x,y;
        System.out.print("enter +*/-=");
        String S;
        S=A.next();
        System.out.print("enter x=");
        x=A.nextInt();
        System.out.print("enter y=");
        y=A.nextInt();
        switch (S){
            case "+":
                System.out.println(x+y);
                break;//hasel jam
            case "-":
                System.out.println(x-y);
                break;//hasel tafrigh
            case"*":
                System.out.println(x*y);
                break;//hasel zarb
            case"/":
                System.out.println(x/y);
                break;//hasel taghsim
        }
    }
}
