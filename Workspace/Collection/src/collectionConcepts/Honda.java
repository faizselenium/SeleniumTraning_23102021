package collectionConcepts;

public class Honda extends Bike implements FirstInterface{
	 int speedlimit=150;  
	 
	 public void run(){
		 super.run();
			System.out.println("Honda");
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj=new Honda();  
		obj.run();
		
		 // System.out.println(obj.speedlimit);//90  

	}

	@Override
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sub() {
		// TODO Auto-generated method stub
		
	}

}
