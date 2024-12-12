import java.util.Scanner;
class StringRepetition3{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int n=input.nextInt();
        int l=str.length();
        String lastthree=str.substring(l-3,l);
        System.out.print(lastthree.repeat(n));
       
    }
}
/*
ip:
Transport
2
op:
ortort 
*/
