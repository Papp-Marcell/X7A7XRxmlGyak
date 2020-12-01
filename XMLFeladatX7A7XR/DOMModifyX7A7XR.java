package hu.domparse.x7a7xr;
import org.w3c.dom.*;
import javax.xml.parsers.*;

import java.io.*;


public class DOMModifyX7A7XR {

	public static void main(String[] args) {
		try {
	         File inputFile = new File("XMLX7A7XR.xml");
	         DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	         Document doc = docBuilder.parse(inputFile);
	         Node zeneiskolak = doc.getFirstChild();
	         Node varos = doc.getElementsByTagName("város").item(0);
	         
	         
	         NamedNodeMap attr = varos.getAttributes();
	         Node nodeAttr = attr.getNamedItem("Városnév");
	         nodeAttr.setTextContent("Budapest");

	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	}

}
