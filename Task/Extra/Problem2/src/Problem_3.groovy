class Problem_3 {
    static void main(String[] args) {
        def hashMap = [:]

        hashMap["Akib"] = ["Mirpur", "Dhanmondi", "Shiddheshwari"]
        hashMap["Sajeeb"] = ["Lalmatia "]
        hashMap["Niloy"] = ["Puran Dhaka", "Rajarbag"]
        hashMap["Ratul "] = []

        int individualCount = 0
        int addressCount = 1

        hashMap.each {name, addresses ->
            each {
                individualCount ++
                addressCount = 1
                println("\n Individual $individualCount : $name")
            }
            if (addresses){
                for (String address:addresses){
                    println("\tAddress $addressCount : $address")
                    addressCount++
                }
            }else {
                println("\tNo Address")
            }

        }
    }
}
