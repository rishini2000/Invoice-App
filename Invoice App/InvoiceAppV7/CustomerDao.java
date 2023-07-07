import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CustomerDao{

    public static List<Customer> getCustomer(String custmcode){

        List <Customer> cuscodelist = new ArrayList <Customer>();

        String cuscodes [] = {"E2121","E2122","E2123","E2124"};
        String cusnames [] = {"Kamal","Amal","Nimal","Sunil"};
        double cusdiscounts [] = {20.00,40.00,30.00,15.00};

        try{

        int c = 0;

        while(c<cuscodes.length){
            if(custmcode.equalsIgnoreCase(cuscodes[c])){
                break;
            }
            c++;

        }

        Customer customer = new Customer();

        customer.setCode(cuscodes[c]);
        customer.setName(cusnames[c]);
        customer.setDiscount(cusdiscounts[c]);
        cuscodelist.add(customer);

    }

    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The Customer Code you entered is wrong.Please restart the sysytem and try");
        System.exit(0);
    }

        return cuscodelist;

    }
}