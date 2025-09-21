import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

class EventSecurity {

    static HashSet<String> vipList = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));

    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Alice", "Bob","maha");
        System.out.println(containsNonVip(attendees));


    }
    public static boolean containsNonVip(List<String> attendees) {
        for(String attend:attendees){
            if(!vipList.contains(attend)){
                return true;
            }
        }
        return false;

    }
}