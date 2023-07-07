import javax.swing.JOptionPane;

public class InvoiceApp2{

    public static void main(String[] args){
        
        String codes [] = { "I001", "I002", "I003", "I004" };
        String names [] = { "Apple", "Yogurt", "Pencil", "Milk" };
        double prices [] = { 150.00, 60.00, 20.00, 875.00 };

        String cuscodes[] = { "E2121", "E2222", "E2323", "E2424" };
        String cusnames [] = { "Nimal", "Kamal", "Seetha", "Amali" };
        double cusdiscounts [] = { 20.00, 15.00, 30.00, 25.00 };

        String itmcode;
        String itemname;
        double price;

        int quantity;
        double linetotal;
        double grandtotal = 0.0;

        String custmcode;
        String cusName;
        double cusDiscount;

        custmcode =JOptionPane.showInputDialog(null, "Enter Customer Code");

        int c = 0;

        while (c < cuscodes.length){
            if (custmcode.equalsIgnoreCase(cuscodes[c]))
                break;
            c++;
        }

        cusName = cusnames[c];
        cusDiscount = cusdiscounts[c];

        JOptionPane.showInputDialog(null,
                 "Welcome : " + cusName + "\n\n" + "You have Discount per Item : Rs. " + cusDiscount);
    String output = "";

    while(true){

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-New Item \n 2-Finish \n 3-Exit"));
        if(op==2) break;
        if(op==3) System.exit(0);
    
        
        itmcode = JOptionPane.showInputDialog(null, "Enter Item Code");

        int i = 0;

        while (i < codes.length){
            if (itmcode.equalsIgnoreCase(codes[i]))
                break;
            i++;
        }

        itemname = names[i];
        price = prices[i];

        String qty= JOptionPane.showInputDialog(null, "Item : " + itemname + "\n\n" + "Enter Quantity");

        quantity = Integer.parseInt(qty);

        linetotal = price * quantity;
        grandtotal = linetotal;

        output = itemname + "    " + price + "    " + linetotal;
    }

        output = output + "\n\nGrand Total : " + grandtotal;

        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null, "Good Bye and Come Again" + "\n\n" + "Have a nice day..!");

   }


}