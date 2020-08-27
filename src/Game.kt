fun main() {

    var hp=100
    var playerN="Omar"

    val isBlessed = true
    if(hp == 100) println(playerN +" is an Excellent Condition !" + "  " + hp)
    else if (hp in 90 .. 99) println(playerN +" has afew Scratches " + "   " +hp)
    else if (hp in 75 .. 89) {
        if (isBlessed == true) println(playerN +
                "has some miner wounds but is healing quite qickly"
                + "  " +playerN)
        
        else println("has some minor wounds")
    }
    else if (hp in 15 ..74) println(playerN +" looks pretty hurt" + "   " + hp)
    else println(playerN + " is in awful condition" +"   " + hp)
}