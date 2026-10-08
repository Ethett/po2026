import java.util.Scanner;

public class Choinka {
    public static void main(String[] args){
        int i;
        Scanner myObj = new Scanner(System.in);
        //int max = myObj.nextInt();
        for(i=1;i<=Integer.parseInt(args[0]);i++){
            int j=i;
            while(j>0){
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
    }
}
