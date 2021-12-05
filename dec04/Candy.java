public class Candy 
{
public String taste()
{
    return "tastes sweety";
}

public static void main(String[] args)
{
    Candy c1 = new Candy();
    System.out.println(c1.taste());
    Candy c2 = new lollipop();
    System.out.println(c2.taste());
}
}

class lollipop extends Candy
{
	@Override
	public String taste()
	{
		return "tastes swety & salty";
	}
}