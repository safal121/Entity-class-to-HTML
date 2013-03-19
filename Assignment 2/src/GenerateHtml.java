import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
/**
 * 
 * @author oscar-11
 * @Version 1.0
 * @Date 2069/12/2
 */

public class GenerateHtml {
	/**
	 * Writes to HTML File
	 * @param String
	 * @return void
	 */
	public void writeHtml(String[] htmlString){
		StringBuilder str=new StringBuilder();
		str.append("<html><head><title>Java To HTML</title></head><body><table><tr>");
		String temp;
		try {   
            File file = new File("myform.html");
              FileWriter writer = new FileWriter(file);
              BufferedWriter bufferwriter = new BufferedWriter(writer);
              int i =0;
              
              while(i<htmlString.length){
                  temp= htmlString[i];
                  str.append("<td>");
                  str.append(temp);
                  str.append("</td><td><input type=text name="+temp+"name");
                  str.append("</td></tr>");
                  i++;
             }
              str.append("</table></body>");
              str.append("<input type=submit value=submit>");
//              System.out.println("output is:"+htmlform);
             
             bufferwriter.write(str.toString());
             bufferwriter.close();
             
     }
        catch (Exception ex) {
             System.out.println(ex);
         }
     }
    
	
	
	}

