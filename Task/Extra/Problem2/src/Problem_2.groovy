class Problem_2 {
    static void main(String[] args) {

        def groceryList = []
        groceryList.add("Eggs")
        groceryList.add("Cheese")
        groceryList.add("Chicken")
        groceryList.add("Milk")
        groceryList.add("Beef")
        groceryList.add("Potato")
        groceryList.add("Potato")
        groceryList.add("Carrot")
        groceryList.add("Eggs")
        groceryList.add("Eggs")
        println("The array list is : \n $groceryList")
        def updateList = updatedGroceryLists(groceryList)
        println("The non duplicate arrayList :\n $updateList")
        println("is Potato there? " + isPotatoThere(updateList))
        //Replace  Beef = Mutton
        println("The updated List are: " + updatedArrayList(updateList))

    }

    static List<String> updatedGroceryLists(arrayList) {
        def updateGroceryList = []
        for (int i = 0; i < arrayList.size(); i++) {
            if (!updateGroceryList.contains(arrayList.get(i))) {
                updateGroceryList.add(arrayList.get(i))
            }
        }
        return updateGroceryList
    }

    static boolean isPotatoThere(arraylist) {
        def search = false
        if (arraylist.contains("Potato")) {
            search = true
        }
        return search
    }
    static updatedArrayList(groceryList){
        for(int i=0; i<groceryList.size(); i++){
            if(groceryList.get(i) == "Beef"){
                groceryList.set(i, "Mutton")
            }
        }
        return groceryList;
    }
}
