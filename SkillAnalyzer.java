import java.util.HashSet;
import java.util.Set;

class SkillAnalyzer {

    public static void main(String[] args) {

        Set<String> candidateASkills = new HashSet<>();
        candidateASkills.add("Java");
        candidateASkills.add("Python");

        Set<String> candidateBSkills = new HashSet<>();
        candidateBSkills.add("Python");
        candidateBSkills.add("SQL");
        System.out.println(findUniqueSkills(candidateASkills,candidateBSkills));
    }
    public static Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        //Symmetric Difference = (Set A ∪ Set B) − (Set A ∩ Set B)
        //union
        Set<String> union = new HashSet<>(candidateASkills); // Copy candidateASkills into a new set
        union.addAll(candidateBSkills); // Add all elements from candidateBSkills
        // intersection
        Set<String> intersection = new HashSet<>(candidateASkills);// Copy candidateASkills into a new set
        intersection.retainAll(candidateBSkills);// Keeps only the skills  common to both
        //Symmetric Difference = Union - Intersection
        union.removeAll(intersection);
        return union;
    }
}