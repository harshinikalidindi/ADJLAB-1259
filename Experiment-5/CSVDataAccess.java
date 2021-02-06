package fee;
import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;

public class CSVDataAccess {
	public ArrayList<POJOClass> readData() 
	{
		CSVReader reader;
		// Declare ArrayList with POJO generic class.
		ArrayList<POJOClass> arr=new ArrayList<POJOClass>();
		try{
			reader = new CSVReader(new FileReader("D:\\"));
			String[] r;
			while((r=reader.readNext())!=null)
			{
				// Declare object from POJO class
				POJOClass v = new POJOClass();	
				// call setter methods for each corresponding column index of CSV file. example in the next comment
				
				// user.setName(newRow[0]);
				v.setReg(r[0]);
				v.setFee(r[1]);
				v.setCategory(r[2]);
				
				// add POJO object into arraylist by calling add() method
				arr.add(v);
			}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		return arr;
	
	}
}