package collectionConcepts;

public class StaticConcepts extends set {

//	static {
//		System.out.println("called before main");
//	}
	
	StaticConcepts()
	{
		System.out.println("StaticConcepts object created : 3");
	}
	
	{
		System.out.println("instancce initilizaer 3");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println("called after static");
		StaticConcepts obj = new StaticConcepts();
		
	}

}
