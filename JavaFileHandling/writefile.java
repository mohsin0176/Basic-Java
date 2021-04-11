import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile
{
	public static void main (String[] args)
	{
		try
		{
			FileWriter myWriter=new FileWriter("filename.txt");
			myWriter.write("Files Are Wriiten in Java");
			myWriter.close();
			System.out.println("Successfully Wrote to file");
		}
		catch(IOException e)
		{
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}
}