import java.util.HashSet;
import java.util.Set;

class ProductTagger {
    public static void main(String[] args) {
        Set<String>setA=new HashSet<>(Set.of("electronics","sale"));
        Set<String>setB=new HashSet<>(Set.of("electronics","sale","new"));
        System.out.println(isSubset(setA,setB));
    }
    public static boolean isSubset(Set<String> setA, Set<String> setB) {
        if(setB.containsAll(setA)){
            return true;
        }
        return false;
    }
}