package com.figbytes.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelsUtility {

public static String sep = System.getProperty("file.separator");
	

	public static String[][] ReadExcel(String File,String SheetName)
	{
		
	
		String data[][] = null;
		FileInputStream fis = null;
		
		try{
			Const.logger.info("Loading "+File);
			String filePATH = Const.BASE_PATH +sep+"Excels"+sep+File;

			fis = new FileInputStream(filePATH);			
						  XSSFWorkbook workbook = new XSSFWorkbook(fis);
						
						  XSSFSheet sheet = workbook.getSheet(SheetName);
						  
						 int rowCount = sheet.getLastRowNum();

						 int colCount = sheet.getRow(0).getLastCellNum();
						 data = new String[rowCount][colCount];
						 
						  Iterator<Row> rowIterator = sheet.iterator();
						  
						  int i=0;
						  while(rowIterator.hasNext()) {
						      Row row = rowIterator.next();

						      if (row.getRowNum()==0) {
					        	  
				                    continue;
				                }

						      Iterator<Cell> cellIterator = row.cellIterator();
						      int j = 0;
						      while(cellIterator.hasNext()) {					    	  
						   	  
						          Object result = null;
						          Cell cell = cellIterator.next();
						          
						          //if it will get username string in first row then it will skip this and continue with second row data
//						          if(cell.getStringCellValue().contains("Username")) {
//						        	  break;
//						          }
						          					          
						          switch(cell.getCellType()) {
						              case BOOLEAN:
						                  //System.out.print(cell.getBooleanCellValue() + "\t\t");
						                  result = cell.getBooleanCellValue();
						                  break;
						              case NUMERIC:
						                 // System.out.print("getting numeric " + cell.getNumericCellValue() + "\t\t");
						            	  double numeric = cell.getNumericCellValue();						            	  
						                  //if want digits in number not in decimal then apply num on result
//						                  int num = (int)numeric;
//							              result = String.valueOf(num);
						                  //System.out.println("getting num " +num + "\t\t");					                 
						            	  result = String.valueOf(numeric);
						                  break;
						              case STRING:
						                  //System.out.print(cell.getStringCellValue() + "\t\t");
						                  result = cell.getStringCellValue();
						                  break;
						              case BLANK:
						            	  result = "";
						            	  break;
						          }
						         
						          data[i][j] =  (String) result;
						          
						          //System.out.print(i+"                  "+j);
						          j++;
						          
						          
						      }
						     //System.out.println("");
						      i++;
						  }
						  fis.close();
						  
						  FileOutputStream out =null;
						  String filePATHout = Const.BASE_PATH +sep+"Excels"+sep+File;;
						  out =new FileOutputStream(filePATHout);							
						  workbook.write(out);
						  out.close();						  
						} catch (FileNotFoundException e) {
						  e.printStackTrace();
						} catch (IOException e) {
						  e.printStackTrace();
						}
						return data;
					}


	@Test
	public void test(){
		//System.out.println("Reading data from excel");
		String[][] excelData = ReadExcel("EnergyDataEntry.xlsx","sheet1" );
		//If you don't want to skip 1st row then make "i=0", excel will read from 1st row
		//"OR"
		//If want to skip 1st row then make "i=1", excel will read from 2nd row
		
		for(int i =1; i < excelData.length ; i++){
			for(int j = 0 ;j < excelData[i].length ; j++){
				Const.logger.info(excelData[i][j]+"\t");
				System.out.print("TestData is :- " +excelData[i][j]+"\t");
				
//		        Double stringToDouble = new Double(excelData[i][j]);
//		        System.out.println("Double is :-" +excelData[i][j]);
//		        double DoubleYear = stringToDouble.doubleValue();
//		        System.out.println("doubleYear is:- "+ DoubleYear);
//				int yearInInteger = (int)DoubleYear;
//				System.out.println(yearInInteger);
//				String StringYear = String.valueOf(yearInInteger);
//				System.out.println("StringYear is:-" +StringYear);
			}
			System.out.println();
		}
	}
}
