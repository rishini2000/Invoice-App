
public class ItemDao{

    public static Item getItem(String itemcode){

        Item item = new Item();


        String codes [] = {"I001","I002","I003","I004"};
        String names [] = {"Apple","Rice","Milk Powder","Buscuit"};
        double prices [] = {80.00,200.00,400.00,180.00};

        int i = 0;

        while(i<codes.length){
            if(itemcode.equalsIgnoreCase(codes[i])){

              
                break;
            }
            i++;
        }
        item.setCode(codes[i]);
        item.setName(names[i]);
        item.setPrice(prices[i]);
        return item;

    }
}