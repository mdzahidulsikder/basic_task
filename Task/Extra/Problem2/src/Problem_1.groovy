class Problem_1 {
    static void main(String[] args) {
        /**
         * find max and min value from an array
         * array to arrayList convert
         */
        int[] arr = [10, 32, 1, 8, 32, 92, 41, 71, 34, 64, 99]
        println("The Max value is: " + findMaxValue(arr) + " and Min Value is: " + findMinValue(arr));
        convertingToListAndPrint(arr);
    }
    static findMaxValue(arr) {
        int max = arr[0]

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr[i] > max) {
                max = arr[i]
            }
        }
        return max
    }

    static findMinValue(arr) {
        int min = arr[0]

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr[i] < min) {
                min = arr[i]
            }
        }
        return min
    }

    static convertingToListAndPrint(arr){
        def arrayList = []
        for (int i = 0; i< arr.size(); i++){
            arrayList.add(arr[i])
        }
        println("The array_list : \n $arrayList")
    }


}
