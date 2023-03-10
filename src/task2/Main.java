package task2;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        XPathExpression expression = path.compile("//flower/* |//visual_рarameters/*| //grovin_tips/*");
        File xml = new File("D:\\ДЗ\\WEB_003\\src\\task2\\flower.xml");
        InputSource source = new InputSource(new FileInputStream(xml));
        Object result = expression.evaluate(source, XPathConstants.NODESET);
        NodeList list = (NodeList) result;

        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.print( node.getNodeName());
            System.out.print(" " + node.getFirstChild().getNodeValue());
            System.out.print("\n");
            if (node.getNodeName().equals("multiplying")) {
                System.out.print("\n");
            }

        }

    }

}
