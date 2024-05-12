package kotlingb.core.cartridge

import kotlingb.core.Memory

@OptIn(ExperimentalUnsignedTypes::class)
class Cartridge(private val _data: ByteArray) : Memory {
    private val data: UByteArray = UByteArray(0x10000)

    init {
        _data.toUByteArray().copyInto(data, endIndex = 0x7FFF)
    }

    override fun readByte(address: Int): Int {
        return data[address].toInt()
    }

    override fun writeByte(address: Int, value: Int) {
        data[address] = value.toUByte()
    }
}
