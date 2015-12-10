import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParse {
    public void printNote(NodeList nodeList) {
    	int i = 0;
        for (int temp = 0; temp < nodeList.getLength(); temp++) {
            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                { 
                	System.out.println("Name: " + node.getNodeName() + "\nValue: " + node.getTextContent());
                
                }
            }
        }   
        System.out.println(i);
     }
}

