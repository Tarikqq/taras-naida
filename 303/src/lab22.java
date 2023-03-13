//2
public class lab22 {
        public static void main(String[] args) {
            int n;
            int a;
            int b;
            int c;
            n=472;
            b=n/100;
            c=(n%100)/10;
            a=n%10;
            if (b>a && b>c) {
                System.out.println("Перше число є найбільше");
            }else if (c>b && c>a) {
                System.out.println("Друге число є найбільше");
            }else {
                System.out.println("Третє число є найбільше");
            }



        }
    }
