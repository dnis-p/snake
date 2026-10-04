package snake

class Row(
    var isTB: Boolean,
    var id: Int
){
    override fun toString(): String {
        return if (isTB) "------------------------------" else "|                            |"
    }
}