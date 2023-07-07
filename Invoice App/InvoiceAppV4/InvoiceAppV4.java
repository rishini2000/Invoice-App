import javax.swing.JOptionPane;

import java.util.Hashtable;

public class InvoiceAppV4{

    public static void main(String[]args){

        while(true){

            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - for new customer\n 2 - for Exit"));
            if(op1 == 2) break;

        String custmcode;
        String cusname;
        double cusdiscount;

        String itemcode;
        String itemname;
        double itemprice;


        double quantity;
        double linetotal;
        double grandtotal;

        custmcode = JOptionPane.showInputDialog(null,"Enter Customer Code :\n");

        Hashtable cus = CustomerDao.getCustomer(custmcode);

        cusname = (cus.get("name")).toString();
        cusdiscount = (double) (cus.get("discount"));

        JOptionPane.showMessageDialog(null,"Welcome : "+cusname+"\nYour Discount Per Item : "+cusdiscount);

        String output ="";
        grandtotal = 0;


        while(true){
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - for new item\n 2 - for Finished\n 3 - for exit"));
                if(op == 2) break;
                if(op == 3) System.exit(0);
        
        itemcode = JOptionPane.showInputDialog(null,"Enter Item Code : ");

        Hashtable itm = ItemDao.getItem(itemcode);

        itemname = (String) (itm.get("name"));
        itemprice = (double) (itm.get("price"));

        String qty = JOptionPane.showInputDialog(null,"Item Name : "+itemname+"\nUnit Price : "+itemprice+"\nEnter Your Quantity : ");
        quantity = Integer.parseInt(qty);

        linetotal = itemprice * quantity;
        grandtotal = grandtotal + linetotal;

        output = "item Name : "+itemname+"\nUnit Price : "+itemprice+"\nQuantity : "+quantity+"\n"+
                        "Linetotal : "+linetotal;

    }

        output = output +"\nGrandtotal : "+grandtotal;

        JOptionPane.showMessageDialog(null,output);
        JOptionPane.showMessageDialog(null,"Good Bye and Come Again"+"\n"+"Thank You");

    }

    }
}