public class Problem{
	private String name;
	private ProblemType type;
	private boolean status;

	public void Problem(String name, ProblemType type){
		this.name = name;
		this.type = type;
		
	}

	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public boolean isProblemSolved(){
		return status;
	}
}

