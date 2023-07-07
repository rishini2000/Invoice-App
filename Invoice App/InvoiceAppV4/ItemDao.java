import java.util.Hashtable;

public class ItemDao{

    public static Hashtable getItem(String itemcode){

        Hashtable item = new Hashtable();

        String codes [] = {"I001","I002","I003","I004"};
        String names [] = {"Apple","Rice","Milk Powder","Buscuit"};
        double prices [] = {80.00,200.00,400.00,180.00};

        int i = 0;

        while(i<codes.length){
            if(itemcode.equalsIgnoreCase(codes[i])){

                item.put("code", codes[i]);
                item.put("name", names[i]);
                item.put("price", prices[i]);

                break;
            }
            i++;
        }
        return item;

    }
}