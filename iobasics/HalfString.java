
import java.util.Scanner;
class HalfString{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String W=input.nextLine();
        int n=W.length();
        //string slicing
        System.out.print(W.substring(0,n/2));
        
    }
}
/*
ip:Amazon
op:Ama 
*/