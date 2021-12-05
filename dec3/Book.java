abstract class Book
{
    String title;

    abstract void setTitle(String s);
    // constructor 
    String getTitle()
    {
        return title;
    }
}
class updateBook extends Book
{
	@Override
	void setTitle(String s)
	{
		this.title=s;
	}
	
public class Book
{
	public static void main(String[] args)
	{
		updateBook new_book=new updateBook(); 
		new_book.setTitle("over the shoulder ");
		System.out.println("The name of the books is  : "+new_book.getTitle());
	}

}
}
