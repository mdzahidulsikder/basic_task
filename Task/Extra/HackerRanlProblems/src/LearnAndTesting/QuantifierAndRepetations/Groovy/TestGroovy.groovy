package LearnAndTesting.QuantifierAndRepetations.Groovy

println("hello")
def text = "12-34-56-78"
def regex = "^[0-9]{2}(-|:|---|\\.){1}[0-9]{2}\\1[0-9]{2}\\1[0-9]{2}\$"
def matcher = text =~ regex
if (matcher) {
    int i = 1
    matcher.each { match ->
        println("$i. Match of your string:  $match --->" + true)
        i++
    }
} else {
    println("Not match ")
}
if (matcher) {
    println(true)
} else {
    println(false)
}
