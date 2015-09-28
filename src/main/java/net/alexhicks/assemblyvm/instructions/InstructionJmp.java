package net.alexhicks.assemblyvm.instructions;

import net.alexhicks.assemblyvm.AssemblyVM;
import net.alexhicks.assemblyvm.Instruction;

public class InstructionJmp implements Instruction {
	@Override
	public int[] getArgumentCount() {
		return new int[] {1, 1};
	}

	@Override
	public int handle(AssemblyVM vm, int val) {
		return val;
	}

	@Override
	public String getInstructionName() {
		return "jmp";
	}
	
}
