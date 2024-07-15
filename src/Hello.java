public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {  // code block allow is if expression is true
            System.out.println("Its is not an alien!");
            System.out.println("And I am Scared of  aliens");

        }
        //logical AND Operator
        int topScore = 80;
        if (topScore <100) {
            System.out.println("you got high Score");
        }

        int secodTopScore=60;
        if (topScore>secodTopScore && topScore<100) {
            System.out.println("Grater that second top score & less then 100");
        }
        //logical OR Operator
        if(topScore >90 || secodTopScore <=90){
            System.out.println("Either or both of the condition are true");
        }
        int newvalue =50;
        if(newvalue == 50){
            System.out.print("This is true");
        }
        boolean isCar= false;
        if(isCar==true){
            System.out.println("This is not supposed to happen");
        }







    }
}
