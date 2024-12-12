import java.util.Scanner;
class SumOfDigits{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            sum+=lastdigit;
        }
        System.out.print(sum);
    }
}
/*
ip:326
op:11
*/
