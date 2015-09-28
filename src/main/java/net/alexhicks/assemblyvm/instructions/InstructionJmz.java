package net.alexhicks.assemblyvm.instructions;

import net.alexhicks.assemblyvm.AssemblyVM;
import net.alexhicks.assemblyvm.Instruction;
import net.alexhicks.assemblyvm.ReturnCode;

public class InstructionJmz implements Instruction {
	@Override
	public int[] getArgumentCount() {
		return new int[] {1, 1};
	}

	@Override
	public int handle(AssemblyVM vm, int val) {
		return val == 0 ? val : ReturnCode.NOCHANGE;
	}

	@Override
	public String getInstructionName() {
		return "jmz";
	}
	
}
