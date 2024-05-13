import sys
import json

def make_operands_name(operandDic):
    result = ""
    name = operandDic["name"]
    immediate = operandDic["immediate"]
    if "n8" == name:
        result = "Operands.Imm8"
    elif "n16"== name or "a16" == name:
        result = "Operands.Imm16"
    else:
        result = "Operands." + name

    if "increment" in operandDic:
        result += "I"

    if "decrement" in operandDic:
        result += "D"

    if not immediate:
        result += "r"

    return result

################################################

if len(sys.argv) != 2:
    print("no file")
    sys.exit(1)

file = open(sys.argv[1])
dstFile = open("output.txt", "w")

json_dict = json.load(file)

for opcode, dic in json_dict["unprefixed"].items():
    mnemonic = dic["mnemonic"]
    operands = dic["operands"]
    cycles = dic["cycles"]
    cycle = int(cycles[0] / 4)
    if "LD" == mnemonic:
        dst = operands[0]
        src = operands[1]
        dstName = make_operands_name(dst)
        srcName = make_operands_name(src)
        string = f"""{opcode} -> {mnemonic.lower()}({dstName}, {srcName}, {dic["bytes"]}, {cycle})\n"""
        # print(string)
        dstFile.write(string)

dstFile.close()
file.close()


