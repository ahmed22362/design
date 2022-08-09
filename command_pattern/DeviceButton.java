package command_pattern;

// This is known as the invoker
// It has a method press() that when executed
// causes the execute method to be called


public class DeviceButton{
	
	Command theCommand;
	
	public DeviceButton(Command newCommand){
		
		theCommand = newCommand;
		
	}
	
	public void press(){
		
		theCommand.execute();
		
	}
	
	// Now the remote can undo past commands
	
	public void pressUndo(){
		
		theCommand.undo();
		
	}
	
}