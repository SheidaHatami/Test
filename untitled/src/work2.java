import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        int n  ;
        System.out.print("n=");
        n= A.nextInt();
        int[] M=new int[n];
        int i=0;
        for (;i < n ;i=i+1){
            System.out.print("M[i]=");
            M[i]=A.nextInt();
        }
        int K;
        i=0;
        for ( K=M[i];i<M.length;i++){
            if (M[i]>K){
                K = M[i];}
        }
        System.out.print("K=");
        System.out.println(K);
    }
}