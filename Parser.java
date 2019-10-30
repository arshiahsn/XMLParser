import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

public class Parser {
    public static void main(String[] args){

        String fileName = "file2.xml";
        SAXBuilder builder = new SAXBuilder();
        List<Employee> employeeList = new LinkedList<Employee>();

        try {
            Document doc = builder.build(new File(fileName));
            Element rootElement = doc.getRootElement();

            List children = rootElement.getChildren();
            for(Object child_ : children){
                Element child = (Element) child_;
                Employee employee = new Employee();
                employee.setId(child.getAttribute("id").getIntValue());
                employee.setFirstName(child.getChild("firstname").getText());
                employee.setLastName(child.getChild("lastname").getText());
                employee.setPerk(child.getChild("perk").getText());
                employee.calculateTaxedSalary(Double.valueOf(child.getChild("salary").getText()));
                employeeList.add(employee);
            }




        } catch (IOException | JDOMException ex) {
            ex.printStackTrace();
        }

        Company company = new Company(new ArrayList(employeeList));
        System.out.println(company.toString());




    }


}
