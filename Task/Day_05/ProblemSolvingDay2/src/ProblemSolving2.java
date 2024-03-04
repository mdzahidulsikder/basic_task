import java.util.ArrayList;
import java.util.List;

public class ProblemSolving2 {
    public static void main(String[] args) {
        ArrayList<String> groceryList= new ArrayList<>();
        ArrayList<String>  nonDuplicateList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Cheese");
        groceryList.add("Chicken");
        groceryList.add("Beef");
        groceryList.add("Potato");
        groceryList.add("Potato");
        groceryList.add("Carrot");
        groceryList.add("Eggs");
        groceryList.add("Eggs");

        System.out.println("Grocery List is : ");
        for (String grocery: groceryList){
            System.out.print(grocery + " ");
        }

        /**
        * checking the duplicate value
         * removing duplicate value
         */

        for (String grocery: groceryList){
            if (!nonDuplicateList.contains(grocery)){
                nonDuplicateList.add(grocery);
            }
        }

        System.out.println("\n ...................\nGrocery without duplicate  List is : ");
        for (String grocery: nonDuplicateList){
            System.out.print(grocery + " ");
        }


        System.out.println("\n ...................\nIs potato is there in the list? ");
        boolean result = isPotatoThere(nonDuplicateList);

        if (result == true){
            System.out.println(" = yes, Potato is available in this list.");
        }else {
            System.out.println(" = No, There is no Potato in the list");
        }

        System.out.println("\n ...................\nUpdate the grocery list : ");
        updatedArrayList(groceryList);

    }

    private  static  boolean isPotatoThere(ArrayList<String> groceryList){
        String s = "Potato";
        boolean isPotato = false;
        for (String grocery: groceryList){
            if(grocery.equals(s)){
               return true;
            }
       }
        return isPotato;
    }
    private  static void updatedArrayList(ArrayList<String> groceryList){
        for (String grocery : groceryList){
            if (grocery.equals("Beef")){
                grocery = "Mutton";
            }
            System.out.print(grocery+ " ");
        }
    }

}
