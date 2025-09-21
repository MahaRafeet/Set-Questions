import java.util.HashSet;
import java.util.Set;

class DataValidator {
    public static void main(String[] args) {
        String[] items ={"Book","Pen","Paper"};
        System.out.println(hasDuplicates(items));
    }
    public static boolean hasDuplicates(String[] items) {
        Set<String> seenItems = new HashSet<>();
        for(String item:items){
            if(!seenItems.add(item)){
                return true;
            }

        }
        return false; // Placeholder
    }
}