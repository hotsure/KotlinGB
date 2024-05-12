package kotlingb.core.cpu

import kotlingb.core.Bus

class Cpu(private val bus: Bus) {
    private val registers: Registers = Registers()
}
