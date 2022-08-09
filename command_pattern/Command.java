
package command_pattern;

public interface Command {
	
	public void execute();
	
	//option if you want to undo
	public void undo();
	
}