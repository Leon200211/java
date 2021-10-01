package task10;



public class Main {


    public void punck_2(int x, int n){
        System.out.println(x);
        if(x!=n) {
            punck_2(x + 1, n);
        }
    }

    public void punck_3(int x, int n){
        if (x<n){
            punck_3(x, n-1);
            System.out.println(n);
        }
        else if(x>n){
            System.out.println(x);
            punck_3(x-1, n);
        }
        else{
            System.out.println(x);
        }
    }

    public int punck_5(int y, int sum) {
        if(y/10>=1) {
            int tempvar =y%10;
            int remain=y/10;
            sum+=tempvar;
            if(remain!=0) {
                punck_5(remain, sum);
            }
            return sum;
        }
        else {
            return y;
        }

    }






    public int punck_6(int x, int i)
    {
        if(i<=1)
            return 1;
        else{
            if(x>=i){
                return 1;
            }
            else if(i%x==0){
                return 0;
            }
            else {
                return punck_6(x+1, i);
            }

        }
    }


    public void punck_7(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    punck_7(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[]args) {
        Main ex = new Main();

        //ex.punck_2(1, 10);
        //ex.punck_3(10, 1);
        //System.out.println(ex.punck_5(103, 0));
        //System.out.println(ex.punck_6(2, 31));
        //ex.punck_7(42);


    }
}



