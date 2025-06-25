import java.util.List;
import java.util.ArrayList;
public class Problem{
	private String name;
	private ProblemType type;
	private boolean status;

	public Problem(String name, ProblemType type){
		this.name = name;
		this.type = type;
		this.status = false;
		
	}
	public boolean getStatus(){
		return status;
	}
	public String getName(){

		return name;
	}
	public ProblemType getType(){

		return type;
	}
	public boolean isProblemSolved(){

		return status;
	}

	public void setStatus(boolean status) {
		status = false;
	}
}



