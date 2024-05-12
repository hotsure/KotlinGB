package kotlingb.core

class Ppu() : Memory {
    private val vram: Array<Int> = Array<Int>(0x2000) { 0 }
    private var lcdc: Int = 0x91
    private var stat: Int = 0x0
    private var scy: Int = 0x0
    private var scx: Int = 0x0
    private var ly: Int = 0x0
    private var lyc: Int = 0x0

    override fun readByte(address: Int): Int {
        return 0
    }

    override fun writeByte(address: Int, value: Int) {
    }
}
