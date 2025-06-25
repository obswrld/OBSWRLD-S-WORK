import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Problem> problems ;

    public Person(){

    }
        /*
        public Person(){
            problems = new ArrayList<>();
        }
        */
        public void addProblem(Problem problems1){

            problems.add(problems1);
        }

        public void solveProblem(Problem problems){
            problems.setStatus(true);
        }

        public void tellProblem(){
            Problem[] problemList = new Problem[problems.size()];
            for(Problem problem : problemList){
                if(!problem.isProblemSolved()){
                    System.out.println("Unsolved Problem: " + problem.getName());
                }
            }
        }
    }

