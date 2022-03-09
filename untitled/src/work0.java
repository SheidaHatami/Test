import java.util.Scanner;
//tamrin classi i
public class work0 {
    public static int n;
    public static int i=0;
    public static int K;
    public static int num=0;
    public static boolean result;
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("n=");
        n = A.nextInt();
        System.out.print("numbers of arraye=");
        K= A.nextInt();
        int D[] = new int[K];
        for (; i<K; i=i+1) {
            System.out.print("D[" + i + "]=");
            D[i] = A.nextInt();
        }
        System.out.println(R(D,n,K));
        System.out.print("numbers of times =");
        System.out.print(num);}
    public static boolean R(int[] D, int n, int K) {
        for (i=0;i<K;i=i+1) {
            if (D[i]==n)
                num=num+1;
        }
        if(num==0){
            return false;}
        return true;}
}
