import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ak=new Scanner(System.in);

        int a,i=1,t=0,o=0;

        System.out.print("Bir sayı giriniz = ");
        a= ak.nextInt();

        while( i<=a){
            if( i%12==0 ){t+=i;
                o++;
            }
            i++;
        }
        System.out.print(t/o);
    }
}