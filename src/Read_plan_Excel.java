import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read_plan_Excel {
	
	public File xltxFile;
	
	public Read_plan_Excel (File xlsFile){
		
		this.xltxFile = xltxFile;
	}
	
	public void read() throws BiffException, IOException{
		
		String temp;
		Workbook w = Workbook.getWorkbook(xltxFile);
		Sheet s = w.getSheet(0);
		
		for (int i = 0; i < s.getRows(); i++){
			
			for (int j = 0; j < s.getColumns(); j++){
				
				Cell cell = s.getCell(j, i);
				temp = cell.getContents();
				System.out.println(temp);
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		
		Read_plan_Excel teste = new Read_plan_Excel(new File("Pasta1.xltx"));
		teste.read();
		

	}

}
