package cse360assignment02;

public class AddingMachine{
	private int total;
	private int nextone;
	private int as;
	private String str = null;
	
	public AddingMachine();
	
	public int getTotal(){
		return total;}
		
	public void add(int value){
		total += value;
		nextone = value;
		as = 1;
	}
	
	public void subtract(int value){
		int temp = total;
		total = temp - value;
		nextone = value;
		as = 2;
	}
	
	public String toString(){
		if(str == null) {
			return str.concat(String.valueOf(nextone));
		}
		else if (as == 1) {
			return str.concat(" + " + String.valueOf(nextone));
		}
		else if (as == 2) {
			return str.concat(" - " + String.valueOf(nextone));
		}
	}
	
	public void clear(){
		str = null;
	}
}

