public class CustomerDao{

    public static Customer getCustomer(String custmcode){

        Customer customer = new Customer();


        String cuscodes [] = {"E2121","E2122","E2123","E2124"};
        String cusnames [] = {"Kamal","Amal","Nimal","Sunil"};
        double cusdiscounts [] = {20.00,40.00,30.00,15.00};

        int c = 0;

        while(c<cuscodes.length){
            if(custmcode.equalsIgnoreCase(cuscodes[c])){

                customer.setCode(cuscodes[c]);
                customer.setName(cusnames[c]);
                customer.setDiscount(cusdiscounts[c]);

                break;
            }
            c++;
        }

    
        return customer;

    }
}