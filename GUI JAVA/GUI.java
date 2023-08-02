
import java.io.*


implements Comparable<Account>



public int compareTo(Account other)
{
	String thisField = getAccountNumber().charAt(0) + getName();
	
	String otherField = other.getAccountNumber().charAt(0) + other.getName();
	
	return thisField.compareTo(otherField);
	
}


-----------------------------------------------------------------------------------------

// SORT TEST

import java.util.*


public class SortTest
{

	public static void main(String [] args)
	{
		
		Account aList[] = new Account[7];
		
		aList[0] = new SavingsAccount("123","Layton",50,250);
		aList[1] = new ChequeAccount("123","Layton",50,250);
		
		System.out.println("List before sort");
		
		for(int i = 0; i < 7; i++)
		{
			System.out.println(aList[i].toString());
		}
		
		
		Arrays.sort(aList);
		
		System.out.println("List after sort");
		
		for(int i = 0; i < 7; i++)
		{
			System.out.println(aList[i].toString());
		}
		
		
		
	}

}




-------------------------------------------------------------------------------------

//ACCOUNTLIST

import java.util.*
import java.io.*


public class AccountList
{
	
	static ObjectOutputStream output;
	
	
	
	public static void openFile()
	{
		try
		{
			
			output = new ObjectOutputStream(new FileOutputStream("accountlist.ser"));
			
			
		}
		catch(IOException e)
		{
			System.out.println("Cannot open file");
		}
		
		
	}
	
	
	public static void closeFile()
	{
		try
		{
			output.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot close file");
		}
	}
	
	
	public static void main(String [] args)
	{
		
		
		openFile();
		
		try
		{
			
			for(int i = 0; i < 7; i++)
			{
				output.writeObject(aList[i]);
			}
			
			
		}
		catch(IOException e)
		{
			System.out.println("Problem writing file" + e);
		}
		
		closeFile();
		
		
		
		
	}
	
	
}




























