package kotlingb.core

import kotlingb.core.cartridge.Cartridge

class Bus(private val cartridge: Cartridge, private val ppu: Ppu) : Memory {
    override fun readByte(address: Int): Int {
        return 0
    }

    override fun writeByte(address: Int, value: Int) {
    }
}
