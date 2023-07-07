import javax.swing.JOptionPane;

import java.util.List;

public class InvoiceAppV5{

    public static void main(String[]args){

        while(true){

            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - For New Invoice\n 2 - For Exit"));
            if(op1 == 2) break;

        String custmcode;
        String cusname = null;
        double cusdiscount = 0.0;

        String itemcode;
        String itemname = null;
        double itemprice = 0.0;


        double quantity;
        double linetotal;
        double grandtotal;

        custmcode = JOptionPane.showInputDialog(null,"Enter Customer Code :\n");

        Customer customer = (Customer) CustomerDao.getCustomer(custmcode);
            
            cusname = customer.getName();
            cusdiscount = customer.getDiscount();

        
        JOptionPane.showMessageDialog(null,"Welcome : "+cusname+"\nYour Discount Per Item : "+cusdiscount);

        String output ="";
        grandtotal = 0;


        while(true){
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - For New item\n 2 - For Finished\n 3 - For Exit"));
                if(op == 2) break;
                if(op == 3) System.exit(0);
        
        itemcode = JOptionPane.showInputDialog(null,"Enter Item Code : ");

        Item item = (Item) ItemDao.getItem(itemcode);
        
            
            itemname = item.getName();
            itemprice = item.getPrice();

        
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