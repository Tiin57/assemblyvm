package net.alexhicks.assemblyvm.instructions;

import net.alexhicks.assemblyvm.AssemblyVM;
import net.alexhicks.assemblyvm.Cell;
import net.alexhicks.assemblyvm.Instruction;
import net.alexhicks.assemblyvm.ReturnCode;

public class InstructionSto implements Instruction {
	
	@Override
	public int[] getArgumentCount() {
		return new int[] { 1, 1 };
	}

	@Override
	public int handle(AssemblyVM vm, int val) {
		Cell newCell;
		if (!vm.cells.containsKey(val)) {
			newCell = new Cell(String.valueOf(vm.accumulator), val);
		} else {
			newCell = vm.cells.get(val).copy();
		}
		newCell.value = vm.accumulator;
		newCell.isNumber = true;
		vm.cells.put(val, newCell);
		return ReturnCode.NOCHANGE;
	}

	@Override
	public String getInstructionName() {
		return "sto";
	}
}
