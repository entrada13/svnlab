import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Parsing {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        XMLParse print = new XMLParse();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/exams.xml"));
        document.getDocumentElement().normalize();
        Element root = document.getDocumentElement();
        System.out.println("Root element: " + root.getNodeName());
        if (root.hasChildNodes()) {
            print.printNote(root.getChildNodes());
            System.out.println("Labwork done");
        }
    }
}
    

