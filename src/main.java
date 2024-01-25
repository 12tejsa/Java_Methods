import java.util.Scanner;
class alzebra {
    int add (int a,int b){
        int ans = a+b;
        return ans;
    }
}

public class main {
    public static void main(String[] args) {
        alzebra object = new alzebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y  = sc.nextInt();

        System.out.println("sum is ");
        int ans = object.add(x,y);
        System.out.println(ans);
    }
}

