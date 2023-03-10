package task5;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Flowers fl = new Flowers();
        try {
            File file = new File("src\\task5\\flower.xml");
            JAXBContext context = JAXBContext.newInstance(Flowers.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            fl = (Flowers) unmarshaller.unmarshal(file);
            System.out.println("All flowers: ");
            System.out.println(fl.getFlower());

        } catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
