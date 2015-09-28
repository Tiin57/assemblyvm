package net.alexhicks.assemblyvm;

public interface Instruction {
	public abstract int handle(AssemblyVM vm, int args);
	public abstract String getInstructionName();
	/**
	 * @return {minArgCount, maxArgCount}
	 */
	public abstract int[] getArgumentCount();
}
