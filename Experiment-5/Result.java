package fee;

import java.util.ArrayList;
public class Result {
	
	public static void main(String[] args) {
		
		// Create readcsvdata object
		CSVDataAccess rc = new CSVDataAccess();
		// call readcsvData() and get arraylist object
		ArrayList<POJOClass> li = rc.readData();
		// create object from dboperation object
		DatabaseOperations db = new DatabaseOperations();
		// call insertRows() by passing arraylist object and get integer and display no of rows inserted done.
		//System.out.println(db.insertData(li) + " rows inserted");
		// call selectquery() to display query results
		db.selectData();
	}

}