import java.util.Scanner;
public class dfrnt_argument {
 

 public int findMax(int a, int b){
    if (a>b){
        return a;
    }else {
        return b;
    }
}

public int findMax(int a, int b, int c){
    if (a>b && a>b){
        return a;
    }
    else if (b>a && b>c){
        return b;
    }
    else {
        return c;
    }
}

public int findMax(int a, int b, int c, int d){
    if (a>b && a>c && a>d){
        return a;
    }
    else if (b>a && b>c && b>d){
        return b;
    }
    else if (c>a && c>b && c>d){
        return c;
    }
    else {
        return d;
    }

}
   
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dfrnt_argument obj= new dfrnt_argument();

        System.out.println(obj.findMax(10,9));
        System.out.println(obj.findMax(10,11,25));
        System.out.println(obj.findMax(45,55,65,75));
        System.out.println();

      }



}
