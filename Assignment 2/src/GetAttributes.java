import java.lang.reflect.Field;


/**
 * 
 * @author oscar-11
 * @Date 2069/12/2
 * @version 1.0
 */

public class GetAttributes {

	/**
	 *Extracts the attributes of Class to display in HTML
	 * @param args
	 * @return void
	 */
	
	public static void main(String[] args) {
		GenerateHtml generate=new GenerateHtml();
		Field[] fields=EntityClass.class.getFields();
		String []showString=new String[fields.length];
		for(int i=0;i<fields.length;i++)
			showString[i]=fields[i].getName();
			generate.writeHtml(showString);
			
	
	}

}
