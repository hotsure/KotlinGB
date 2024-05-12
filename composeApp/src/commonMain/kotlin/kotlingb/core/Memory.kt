package kotlingb.core

interface Memory {
    fun readByte(address: Int): Int
    fun writeByte(address: Int, value: Int)
}
