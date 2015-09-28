package net.alexhicks.assemblyvm.instructions;

import net.alexhicks.assemblyvm.AssemblyVM;
import net.alexhicks.assemblyvm.Instruction;
import net.alexhicks.assemblyvm.ReturnCode;

public class InstructionNot implements Instruction {
	
	@Override
	public int[] getArgumentCount() {
		return new int[] {0, 0};
	}

	@Override
	public int handle(AssemblyVM vm, int val) {
		vm.accumulator = ~vm.accumulator;
		return ReturnCode.NOCHANGE;
	}

	@Override
	public String getInstructionName() {
		return "not";
	}
}
