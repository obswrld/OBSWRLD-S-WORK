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

class Persons{
	private List<Problem> probelmList;


	public Person(){
		this.problemList = new ArrayList<>();
	}

	public void addProblem(Problems problem){
		problemList.add(problem)
	}

	public void solveProblem(Problems problem){
		problem.setResolved(true)
	}
	
	public void tellProblem(){
		for(Problem problem : problemList){
			if(!problem.isProblemSolved()){
				System.out.println("Unsolved Problem: " + problem.getName());
			}
		}
	}
}

