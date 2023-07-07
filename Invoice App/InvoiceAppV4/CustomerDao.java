import java.util.Hashtable;

public class CustomerDao{

    public static Hashtable getCustomer(String custmcode){

        Hashtable customer = new Hashtable();


        String cuscodes [] = {"E2121","E2122","E2123","E2124"};
        String cusnames [] = {"Kamal","Amal","Nimal","Sunil"};
        double cusdiscounts [] = {20.00,40.00,30.00,15.00};

        int c = 0;

        while(c<cuscodes.length){
            if(custmcode.equalsIgnoreCase(cuscodes[c])){

                customer.put("code", cuscodes[c]);
                customer.put("name", cusnames[c]);
                customer.put("discount", cusdiscounts[c]);

                break;
            }
            c++;
        }
        return customer;

    }
}