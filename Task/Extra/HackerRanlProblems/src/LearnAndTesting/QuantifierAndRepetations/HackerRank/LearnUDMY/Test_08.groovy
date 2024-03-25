/**
 * ex 1 : text longisland regex (?=longisland)long
 * ex 2 : regex \b[a-zA-Z]+\b(?=\.)
 *      text : ea is one of the most popular hot drinks all around the world. The people of our country are enjoying drinking tea after the British colonizer introduced this drinking item to the people of this land. Since then, tea has been a part of this country's people's day-to-day lives. As a result, a tea stall is a familiar place for people of all socioeconomic backgrounds in any part of our country. A tea stall is a small shop where people can order and get tea. It is commonly found on the side of the road, in marketplaces, stations, terminals, launch terminals, or ferry ghats. Almost everyone is known to it. Besides tea and coffee, this shop sells cookies, cakes, bread, betel leaves, etc. It usually opens in the early morning and closes late at night. It does not always appear to be well-equipped. There are no chairs in some stalls. However, there are benches to sit on. A tea stall is often divided into two sections. They are often furnished with chairs, tables, and display cases in the front section. While the kitchen is located opposite the room. A young man is often seen working at such a tea stall. Sometimes the owner serves as both. A stall can be thought of as the villagers' tiny Sangsad. People from many walks of life congregate here. They take a break with a cup of tea and talk about politics and various social issues. As a result, a tea stall is a loud, chaotic, crowded, untidy, and busy environment for most people. A TV set was recently noticed in a tea stall in towns and villages. It is a place where people can express their joys and sorrows from day-to-day life. Its importance cannot be overstated. A tea stall is a gathering place for all kinds of people. It can play an essential role in making people aware of the importance of enjoying their free time. A tea stall should be kept neat and hygienic to be a healthy place for the people visiting it for having a nice cup of warm tea.
 *
 * ex 3 : look behind
 * (?<a=)b
 *
 *
 *

 */




def text = "1 877 2638277"


def regex = "[\\s\\-]?\\d\\S*"
def matcher = text =~ regex
if (matcher) {
    int i = 1
    List<Integer> list = new ArrayList<>();

    matcher.each { match ->
     list.add(match)
    }
    println("country code: "+ list.get(0))
    println("area code: "+ list.get(1))
    println("phone number: "+ list.get(2))


} else {
    println("Not match ")
}

if (matcher){
    println true
}else{
    println false
}

