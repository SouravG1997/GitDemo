public class Challenge1 {
    public static void main(String[] args) {
        double myFirstValue  =20.00d;
        double mySecondValue =80.00d;
        double myValuesTotal =(myFirstValue +mySecondValue) *100.00d;
        System.out.println("My Values  Total =" + myValuesTotal);
        double theRemainder =myValuesTotal % 40.00d;
        System.out.println("theReminder =" + theRemainder) ;
        boolean isNoRemainder=(theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder="+isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some Remainder");
        }


    }
}
