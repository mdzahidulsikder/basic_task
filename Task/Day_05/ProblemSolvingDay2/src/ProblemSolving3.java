import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProblemSolving3 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        dictionary.put("Akib", new ArrayList<>());
        dictionary.get("Akib").add("Mirpur");
        dictionary.get("Akib").add("Dhanmondi");
        dictionary.get("Akib").add("Shiddheshwari");

        dictionary.put("Sajeeb", new ArrayList<>());
        dictionary.get("Sajeeb").add("Lalmatia");

        dictionary.put("Niloy", new ArrayList<>());
        dictionary.get("Niloy").add("Puran Dhaka");
        dictionary.get("Niloy").add("Rajarbag");

        dictionary.put("Ratul", new ArrayList<>());

        int key = 0;

        for (Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()) {
            key = key + 1;
            System.out.println("Individual  " + key  + " : " + entry.getKey());

            if (entry.getValue().isEmpty()) {
                System.out.println("Address: NO ADDRESS.");
            } else {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.println("Address: " + (i + 1) + " : " + entry.getValue().get(i));
                }
                System.out.println("....................................................");
            }
        }
    }
}
