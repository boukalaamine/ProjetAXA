package controler;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
*
* @author Amine BOUKALA
*/
public class ExcelMacroTest {
	
	private static void callExcelMacro() throws IOException {
	
		Desktop.getDesktop().open(new File("/home/boukala/Bureau/Projets.xlsm"));
	}
	
	public static void main (String [] args) throws IOException
	{
		callExcelMacro();
	}
	


}