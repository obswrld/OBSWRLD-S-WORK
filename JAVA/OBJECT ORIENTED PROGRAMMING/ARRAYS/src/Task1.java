public class Task1 {
    public static void main(String[] args){

        int number = 100;
        for(number = 1; number <= 100; number++){
            if(number % 3 == 0){
                System.out.println("FLIZZ");
            } else {
                System.out.println(number);
            }
        }
    }
}
