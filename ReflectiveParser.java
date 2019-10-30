import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.lang.reflect.*;

public class ReflectiveParser {
    public static void main(String[] args){

        String fileName = "file3.xml";
        SAXBuilder builder = new SAXBuilder();


        try {
            Document doc = builder.build(new File(fileName));
            Element rootElement = doc.getRootElement();

            List children = rootElement.getChildren();
            for(Object child_ : children){
                Element child = (Element) child_;

                Class objClass = Class.forName(child.getAttribute("class").getValue());
                Object obj = objClass.getConstructor().newInstance();
                List objChildren = child.getChildren();
                for(Object field_ : objChildren) {
                    Element field = (Element) field_;
                    //objClass.getField(field.getAttribute("name").getValue()).setAccessible(true);
                    Field pField = objClass.getDeclaredField(field.getAttribute("name").getValue());
                    pField.setAccessible(true);
                    Class fieldType = pField.getType();
                    if(fieldType == java.lang.String.class)
                        pField.set(obj,field.getValue());
                    else
                        pField.set(obj,Integer.valueOf(field.getValue()));
                }
                System.out.println(obj.toString());
            }



        }




     catch (IOException | NoSuchFieldException | ClassNotFoundException
                    | NoSuchMethodException | InstantiationException
    | IllegalAccessException | InvocationTargetException |
    JDOMException ex) {
        ex.printStackTrace();
    }





}


    }


