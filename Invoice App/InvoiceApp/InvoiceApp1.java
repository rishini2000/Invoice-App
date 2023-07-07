
import javax.swing.JOptionPane;

public class InvoiceApp1 {

    public static void main(String[] args) {

        String codes[] = { "I001", "I002", "I003", "I004"};
        String names[] = { "Apple", "Yougurt", "Pencil", "Milk" };
        double prices[] = {150.00,60.00,20.00,875.00 };

        String cuscodes[] = { "E2121", "E2222", "E2323", "E2424", };
        String cusnames[] = {"Nimal", "Kamal","Seetha", "Amali" };
        double cusdiscount[] = {20.00, 15.00, 30.00, 25.00 };

        String itmcode;
        String itmname;
        double price;

        int quantity;
        double linetotal;
        double grandtotal;

        String custmcode;
        String cusName;
        double cusDiscount;

        custmcode = JOptionPane.showInputDialog(null, "Enter Customer Code");

        int c = 0;

    while (c < cuscodes.length) {
        if (custmcode.equalsIgnoreCase(cuscodes[c]))
        break;
        c++;
    }

    cusName = cusnames[c];
    cusDiscount = cusdiscount[c];

    JOptionPane.showMessageDialog(null,
    "Welcome : " + cusName + "\n\n" + "You have Discount per Item : Rs. " + cusDiscount);

    itmcode = JOptionPane.showInputDialog(null,"Enter Item Code");

    int i = 0;

    while (i < codes.length) {
        if (itmcode.equalsIgnoreCase(codes[i]))
        break;
        i++;
    }

    itmname = names[i];
    price = prices[i];

    String qty = JOptionPane.showInputDialog(null, "Item : " + itmname + "\n\n" + "Enter Quantity");
    quantity = Integer.parseInt(qty);

    linetotal = price * quantity;
    grandtotal = linetotal;

    String output = itmname + "   " + price + "   " + quantity + "    " + linetotal;

    output = output + "\n\nGrand Total : " + grandtotal;

    JOptionPane.showMessageDialog(null, output);
    JOptionPane.showMessageDialog(null, "Good Bye and Come Again" + "\n\n" + "Have a nice day...!");
    

    }
}