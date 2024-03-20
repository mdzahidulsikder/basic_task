package LearnAndTesting.QuantifierAndRepetations.Groovy

import java.util.regex.Pattern

def scanner = new Scanner(System.in)

def inputText = scanner.nextLine()
def regex = "^\\d\\w{4}\\.\$"

def pattern = Pattern.compile(regex)
def matcher = pattern.matcher(inputText)

println matcher.find()