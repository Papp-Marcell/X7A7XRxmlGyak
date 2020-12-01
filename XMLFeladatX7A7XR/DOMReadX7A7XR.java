package hu.domparse.x7a7xr;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class DOMReadX7A7XR {

	public static void main(String[] args) {
		try {
	         File inputFile = new File("XMLX7A7XR.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Gy�k�r elem:" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Zeneiskolak");
	         
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               if(nNode.getNodeName()=="v�ros") {
	            	   System.out.println(" v�rosn�v : " + eElement.getAttribute("V�rosn�v"));
	     	           System.out.println("	lakoss�g : " + eElement.getElementsByTagName("lakoss�g").item(0).getTextContent());
	     	           System.out.println("	ter�let : " + eElement.getElementsByTagName("ter�let").item(0).getTextContent());
                       System.out.println("	h�v�sz�m : " + eElement.getElementsByTagName("h�v�sz�m").item(0).getTextContent());
	               }
	               
	               if(nNode.getNodeName()=="zeneiskola") {
	            	   System.out.println(" ZIk�d : " + eElement.getAttribute("ZIk�d"));
	            	   System.out.println(" V�rosref : " + eElement.getAttribute("V�rosref"));
	     	           System.out.println("	N�v : " + eElement.getElementsByTagName("ZIN�v").item(0).getTextContent());
	     	           System.out.println("	telefonsz�m : " + eElement.getElementsByTagName("telefonsz�m").item(0).getTextContent());
                       
	               }
	               if(nNode.getNodeName()=="zenetan�r") {
	            	   System.out.println(" ZTk�d : " + eElement.getAttribute("ZTK�d"));
	            	   System.out.println(" ZIref : " + eElement.getAttribute("ZIref"));
	     	           System.out.println("	N�v : " + eElement.getElementsByTagName("ZTN�v").item(0).getTextContent());
	     	           System.out.println("	hangszer : " + eElement.getElementsByTagName("Hangszer").item(0).getTextContent());
	     	           System.out.println("	telefonsz�m : " + eElement.getElementsByTagName("telefonsz�m").item(0).getTextContent());
                       
	               }
	               if(nNode.getNodeName()=="igazgat�") {
	            	   System.out.println(" Ik�d : " + eElement.getAttribute("IK�d"));
	            	   System.out.println(" ZIref : " + eElement.getAttribute("ZIref"));
	     	           System.out.println("	N�v : " + eElement.getElementsByTagName("In�v").item(0).getTextContent());
	     	           System.out.println("	sz�let�si d�tum : " + eElement.getElementsByTagName("szD�tum").item(0).getTextContent());
                       
	               }
	               
	            	   
	               
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	}

}
