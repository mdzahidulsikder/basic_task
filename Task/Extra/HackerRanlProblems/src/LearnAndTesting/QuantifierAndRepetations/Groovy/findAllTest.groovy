def lst = [10, 20, 30, 40]
lst.findAll{
    if (it>25){
        println(it)
    }
}