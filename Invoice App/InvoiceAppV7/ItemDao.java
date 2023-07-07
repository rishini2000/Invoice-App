import java.util.ArrayList;
import java.util.List;

public class ItemDao{

    public static List<Item> getItem(String itemcode){

        List <Item> itemcodelist = new ArrayList <Item> ();

        String codes [] = {"I001","I002","I003","I004"};
        String names [] = {"Apple","Rice","Milk Powder","Buscuit"};
        double prices [] = {80.00,200.00,400.00,180.00};

    try{
        int i = 0;

        while(i<codes.length){
            if(itemcode.equalsIgnoreCase(codes[i])){
                break;
            }
            i++;
        }

        Item item = new Item();

        item.setCode(codes[i]);
        item.setName(names[i]);
        item.setPrice(prices[i]);
        itemcodelist.add(item);

    }

    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The Item Code you entered is wrong.Please restart the sysytem and try");
        System.exit(0);
    }
    
        return itemcodelist;

    }
}