public class three_num_trnry {
    public static void main(String args[])
{
    int n1 = 5, n2 = 10, n3 = 15, max;
     
    
    max = (n1 > n2) ?(n1 > n3 ? n1 : n3) :(n2 > n3 ? n2 : n3);
     
  
    System.out.println("Largest number among " + n1 + ", " + n2 + " and " + n3 +" is " + max + ". " );
}
}
