package snake

class SnakePart(
    var id: Int,
    var posX: Int,
    var posY: Int,
    var isHead: Boolean,
    ){
    override fun toString(): String {
        return if (isHead) "o" else "+"
    }
}