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
	         System.out.println("Gyökér elem:" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Zeneiskolak");
	         
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               if(nNode.getNodeName()=="város") {
	            	   System.out.println(" városnév : " + eElement.getAttribute("Városnév"));
	     	           System.out.println("	lakosság : " + eElement.getElementsByTagName("lakosság").item(0).getTextContent());
	     	           System.out.println("	terület : " + eElement.getElementsByTagName("terület").item(0).getTextContent());
                       System.out.println("	hívószám : " + eElement.getElementsByTagName("hívószám").item(0).getTextContent());
	               }
	               
	               if(nNode.getNodeName()=="zeneiskola") {
	            	   System.out.println(" ZIkód : " + eElement.getAttribute("ZIkód"));
	            	   System.out.println(" Városref : " + eElement.getAttribute("Városref"));
	     	           System.out.println("	Név : " + eElement.getElementsByTagName("ZINév").item(0).getTextContent());
	     	           System.out.println("	telefonszám : " + eElement.getElementsByTagName("telefonszám").item(0).getTextContent());
                       
	               }
	               if(nNode.getNodeName()=="zenetanár") {
	            	   System.out.println(" ZTkód : " + eElement.getAttribute("ZTKód"));
	            	   System.out.println(" ZIref : " + eElement.getAttribute("ZIref"));
	     	           System.out.println("	Név : " + eElement.getElementsByTagName("ZTNév").item(0).getTextContent());
	     	           System.out.println("	hangszer : " + eElement.getElementsByTagName("Hangszer").item(0).getTextContent());
	     	           System.out.println("	telefonszám : " + eElement.getElementsByTagName("telefonszám").item(0).getTextContent());
                       
	               }
	               if(nNode.getNodeName()=="igazgató") {
	            	   System.out.println(" Ikód : " + eElement.getAttribute("IKód"));
	            	   System.out.println(" ZIref : " + eElement.getAttribute("ZIref"));
	     	           System.out.println("	Név : " + eElement.getElementsByTagName("Inév").item(0).getTextContent());
	     	           System.out.println("	születési dátum : " + eElement.getElementsByTagName("szDátum").item(0).getTextContent());
                       
	               }
	               
	            	   
	               
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	}

}
