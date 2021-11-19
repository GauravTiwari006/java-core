import java.util.Scanner;
public class alltypye {

    public int multiply(int n1, int n2){
        return n1*n2;

    }

    public float multiply(float n1, float n2){
        return n1*n2;

    }

    public long multiply(long n1, long n2){
        return n1*n2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        alltypye obj= new alltypye();

        System.out.println(obj.multiply(15,15));
        System.out.println(obj.multiply(9.4f,9.9f));
        System.out.println(obj.multiply(500,100));
        System.out.println();
    }
    
}
