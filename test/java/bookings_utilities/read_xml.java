package bookings_utilities;
/*
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class read_xml {
	public Node read_xml_file() throws Throwable
	{
		try   
		{  
			
			File file = new File(".\\test-output\\testng.xml");  
			
			//Create a new object of DocumentBuilderFactory  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
			//Create an object DocumentBuilder to parse the XML file data
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			Document doc = db.parse(file);  
			
			doc.getDocumentElement().normalize();
			
		////	System.out.println("Root element name is: " + doc.getDocumentElement().getNodeName()); 
			
			//Creating a list of nodes present in the XML file
			NodeList nodeList = doc.getElementsByTagName("parameter");		
			
		    // using for loop.
	        for (int i = 0; i < nodeList.getLength(); ++i) {
	            Node node = nodeList.item(i);
	            System.out.println("\nNode Name :"
	                               + node.getNodeName());
	            if (node.getNodeType()== Node.ELEMENT_NODE) {
	                Element tElement = (Element)node;
	                System.out.println(
	                    "Booking Name " + tElement.getElementsByTagName("id").item(0).getTextContent());
	                System.out.println("User Name: "  + tElement    .getElementsByTagName(   "username") .item(0)  .getTextContent());
	                System.out.println( "Enrolled Course: "  + tElement .getElementsByTagName(  "EnrolledCourse")   .item(0).getTextContent());
	                System.out.println("Mode: "  + tElement  .getElementsByTagName("mode")    .item(0)    .getTextContent());
	                System.out.println(  "Duration: "      + tElement   .getElementsByTagName(       "duration")         .item(0)         .getTextContent());
	            }
	            return node ;
	        }
	        
	    }
	   catch (Exception e) {
           System.out.println(e);
       }
		
   }
}
	    /*
	     * Output

Root element: class

Node Name :geek
User id: 1
User Name: geek1
Enrolled Course: D.S.A
Mode: online self paced
Duration: Lifetime

Node Name :geek
User id: 2
User Name: geek2
Enrolled Course: System Design
Mode: online live course
Duration: 10 Lectures
	     */
	    // This exception block catches all the exception
