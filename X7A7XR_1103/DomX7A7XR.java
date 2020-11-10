package xmlJava;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class DomX7A7XR {

	public static void main(String[] args) {
		try {
	         File inputFile = new File("szemelyek.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Gyökér elem:" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("szemely");
	         
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("id : " 
	                  + eElement.getAttribute("id"));
	               System.out.println("	nev : " 
	                  + eElement.getElementsByTagName("nev").item(0).getTextContent());
	               if(eElement.getElementsByTagName("kor").item(0)!=null) {
	               System.out.println("	Kor : " 
	                  + eElement.getElementsByTagName("kor").item(0).getTextContent());
	               }
	               System.out.println("	Varos : " 
	 	                  + eElement.getElementsByTagName("varos").item(0).getTextContent());
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	}

}
