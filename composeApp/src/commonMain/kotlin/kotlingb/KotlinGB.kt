package kotlingb

import kotlingb.core.Bus
import kotlingb.core.Ppu
import kotlingb.core.cartridge.Cartridge
import kotlingb.core.cpu.Cpu

class KotlinGB {
    fun start(data: ByteArray) {
        val ppu: Ppu = Ppu()
        val cartridge: Cartridge = Cartridge(data)
        val bus: Bus = Bus(cartridge, ppu)
        val cpu: Cpu = Cpu(bus)
    }

    fun update() {
    }

    fun reset() {
    }
}
