public class Dog
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)

    {
    	 Dog d = (Dog) other;
         return (this.name==d.name);
    }
    public static void main(String[] args)
    {
        Dog d1 = new Dog(" cobra");
        Dog d2 = new Dog("desi kutta");
        Dog d3 = new Dog(" videsi cobra");
        Dog d4 = new Dog(" cobra");

        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d4.equals(d3));
        System.out.println(d1.equals(d4));
    }
}