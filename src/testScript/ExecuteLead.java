package testScript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;


public class ExecuteLead {
	static keyWords key;
@Test
public void testzoho() throws Exception
{
	key=new keyWords();
  FileInputStream file = new FileInputStream("D://leadsuitezoho.xlsx");
  XSSFWorkbook wbsk=new XSSFWorkbook(file);
  Sheet s=wbsk.getSheet("zohosheet");

  ArrayList data=new ArrayList();
  
  Iterator itr=s.iterator();
  while(itr.hasNext())
  {
	  Row rowitr=(Row) itr.next();
	  Iterator cellitr=rowitr.iterator();
	  
	  while(cellitr.hasNext()){
		  
		  Cell celldata=(Cell)cellitr.next();
		  
		  switch(celldata.getCellType()){
		  case STRING:
			  data.add(celldata.getStringCellValue());
			      break;  
		  case NUMERIC:
			  data.add(celldata.getNumericCellValue());
			      break;		  
		  case BOOLEAN:
			  data.add(celldata.getBooleanCellValue());
			      break;		  
		  }}}
  
  for(int i=0;i<data.size();i++)
  {
	 if(data.get(i).equals("openbrowser"))
     	 {
		  System.out.println(data.get(i));
		  System.out.println(data.get(i+1));
		  System.out.println(data.get(i+2));
		  System.out.println(data.get(i+3));

		  String keyword=(String)data.get(i);
		  String dat=(String)data.get(i+1);
		  String objectname=(String)data.get(i+2);
		  String runnmode=(String)data.get(i+3);
		  
		  if(runnmode.equals("yes")){
			
			  key.openbrowser(objectname);
			 
		  }}
	 
	 if(data.get(i).equals("loginpage"))
 	 {
	  System.out.println(data.get(i));
	  System.out.println(data.get(i+1));
	  System.out.println(data.get(i+2));
	  System.out.println(data.get(i+3));

	  String keyword=(String)data.get(i);
	  String dat=(String)data.get(i+1);
	  String objectname=(String)data.get(i+2);
	  String runnmode=(String)data.get(i+3);
	  
	  if(runnmode.equals("yes")){
		
		  key.loginpage(objectname);
		 
	  }}
	 if(data.get(i).equals("input"))
 	 {
	  System.out.println(data.get(i));
	  System.out.println(data.get(i+1));
	  System.out.println(data.get(i+2));
	  System.out.println(data.get(i+3));

	  String keyword=(String)data.get(i);
	  String dat=(String)data.get(i+1);
	  String objectname=(String)data.get(i+2);
	  String runnmode=(String)data.get(i+3);
	  
	  if(runnmode.equals("yes")){
		
		  key.input(objectname,dat);
		 
	  }}
	 if(data.get(i).equals("click"))
 	 {
	  System.out.println(data.get(i));
	  System.out.println(data.get(i+1));
	  System.out.println(data.get(i+2));
	  System.out.println(data.get(i+3));

	  String keyword=(String)data.get(i);
	  String dat=(String)data.get(i+1);
	  String objectname=(String)data.get(i+2);
	  String runnmode=(String)data.get(i+3);
	  
	  if(runnmode.equals("yes")){
		
		  key.click(objectname);
		 
	  }}
	 
	 if(data.get(i).equals("check"))
 	 {
	  System.out.println(data.get(i));
	  System.out.println(data.get(i+1));
	  System.out.println(data.get(i+2));
	  System.out.println(data.get(i+3));

	  String keyword=(String)data.get(i);
	  String dat=(String)data.get(i+1);
	  String objectname=(String)data.get(i+2);
	  String runnmode=(String)data.get(i+3);
	  
	  if(runnmode.equals("yes")){
		
		String actuals=  key.check(objectname);
		
		  Assert.assertEquals(dat,actuals);
		 
	  }} 
  }	
}// end of testzoho
}//end of class
