package net.alexhicks.assemblyvm.instructions;

import net.alexhicks.assemblyvm.AssemblyVM;
import net.alexhicks.assemblyvm.Instruction;
import net.alexhicks.assemblyvm.ReturnCode;

public class InstructionHlt implements Instruction {
	@Override
	public int[] getArgumentCount() {
		return new int[] {0, 0};
	}

	@Override
	public int handle(AssemblyVM vm, int val) {
		return ReturnCode.HALT;
	}

	@Override
	public String getInstructionName() {
		return "hlt";
	}
	
}