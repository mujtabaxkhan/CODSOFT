import java.util.Scanner;

public class Main {
    public static void GradeGenerator(float percentile){
        if(percentile >90.0F && percentile <101.0F){
            System.out.println("CONGRATS YOU SCORES A*");
            System.out.println("Your percentile is: "+percentile);
        }
        else if(percentile >80.0F && percentile <91.0F){
            System.out.println("CONGRATS YOU SCORES A");
            System.out.println("Your percentile is: "+percentile);
        }
        else if(percentile >70.0F && percentile <81.0F){
            System.out.println("CONGRATS YOU SCORES B");
            System.out.println("Your percentile is: "+percentile);
        }
        else if(percentile >60.0F && percentile <71.0F){
            System.out.println("CONGRATS YOU SCORES C");
            System.out.println("Your percentile is: "+percentile);
        }
        else if(percentile >50.0F && percentile <61.0F){
            System.out.println("CONGRATS YOU SCORES D");
            System.out.println("Your percentile is: "+percentile);
        }
        else if(percentile >40.0F && percentile <51.0F){
            System.out.println("CONGRATS YOU SCORES A*");
            System.out.println("Your percentile is: "+percentile);
        }
        else if(percentile >-1.0F && percentile <41.0F){
            System.out.println("BETTER LUCK NEXT TIME YOU HAVE NOT PASSED THE EXAM");
            System.out.println("YOUR GRADE IS F");
            System.out.println("Your percentile is: "+percentile);
        }
        else{
            System.out.println("Unexpected ERROR");
        }
    }

    public static void Calculator(int n){
        float sum = 0F;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Enter the Marks out of 100 for subject "+(i+1)+" :");
            float temp = input.nextInt();
            if(temp>100 || temp < 0){
                System.out.println("ERROR....Kindly Enter marks within the 0-100 range");
                i= i-1;
            }
            else{
                sum = sum + temp;
            }
        }
        float x = (float) n;
        float percentile = (sum/x);
        GradeGenerator(percentile);
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\t\t\tCALCULATOR");
        System.out.println("-------------------------------------------------------------");
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter How Many Papers were given by the student: ");
        int n = input.nextInt();
        Calculator(n);
    }
}