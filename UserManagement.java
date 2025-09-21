import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

class UserManagement {
    private Set<String> approvedUsers = new HashSet<>(Arrays.asList("a@test.com", "b@test.com", "c@test.com"));

    public static void main(String[] args) {
        // Create an instance to call non-static methods
        UserManagement manager = new UserManagement();

        Set<String> emailsToRemove = new HashSet<>(Arrays.asList("a@test.com"));

        // Call the method with a List (List.copyOf() works on Java 10+, or use Arrays.asList())
        manager.removeUsers(List.copyOf(emailsToRemove));

        // Print the result
        System.out.println("Approved users: " + manager.getApprovedUsers());
    }


    public void removeUsers(List<String> emailsToRemove) {

     approvedUsers.removeAll(emailsToRemove);
    }

    public Set<String> getApprovedUsers() {
        return approvedUsers;
    }
}