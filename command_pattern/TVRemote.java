package command_pattern;

public class TVRemote {
	
	public static ElectronicDevice getDevice(){
		
		return new Television();
		
	}
	
}