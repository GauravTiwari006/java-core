class Sports
{
    String getName()
    {
        return "** ludo Sports**";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( " ==> n players in  " + getName() );
    }
}
class ludo extends Sports{
    @Override
    String getName()
    {
        return "ludo player...";
    }
    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has (1) " + getName() );
    }
}
public class game
{
	public static void main(String[] args)
	{
		Sports sp = new Sports();
		System.out.println(sp.getName());
		sp.getNumberOfTeamMembers();
		
		Sports sp1 = new ludo();
		System.out.println(sp1.getName());
		sp1.getNumberOfTeamMembers();
	}

}