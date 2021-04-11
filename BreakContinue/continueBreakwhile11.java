public class Main 
{
	public static void main (String[] args)
	{
		int i=0;
		while(i<10)
		{
			if (i==4) 
			{   
				i=i+4;
				System.out.println(i);
				continue;
			}
		}
	}
}