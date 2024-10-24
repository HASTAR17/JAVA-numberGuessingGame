import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        //string
        String a= "Hello Java";
        String b= " Hello Java2";
        System.out.println(a.charAt(0));
        System.out.println(a.concat(b));
        System.out.println(b.replace('l', 'b'));

        //Array
        int marks[] = new int [4]; //array initalizes
        marks[0] =99;
        marks[1] =1001;
        marks[2] =1000;
        marks[3] =102;
        for (int i : marks) {
            System.out.println(i);
        }
        System.out.println("Before sort array: " + marks[1]);
        Arrays.sort(marks);  //sort array functions
        System.out.println("After sort array:"+marks[1]);

        int mark2[]= {90, 91, 92, 93, 94}; //array input while initialize, easy way;
        for (int i : mark2) {
            System.out.println("mark2: "+i);
        }

        //2D ARRAYS

        int [][]finalMarks={{50, 60, 70, 80}, 
                            {10, 20, 30, 40, 90, 100}}; //2D array initialize & value input;
    
        System.out.println(finalMarks[1][5]);
    
        //CASTING
        int p= 100; //যার ক্যাপাসিটি বেশি সে তার থেকে ছোট টাইপ এর গুলো অটোমেটিক টাইপ কাস্টিং করে নিবে যেমন ডাবল করেছে ইন্টেজের ke
        int fP= p+(int)10.0;     //type casing 10.0 double to int
    
    System.out.println(fP);
    
    //CONSTANTS
    float PI= 3.14159F; //F REPRESENT FLOAT
    System.out.println(PI);
    //but PI here could be change so we need to do so nobody could change this constant number;
    final float PI2 = 3.1416F; //Final value can't be change

    //Operator
    int a2= 4;
    int b2= 2;
    int c = a2%b2; // a|b|c 
    int d= b2%a2; //b|a|d
    System.out.println(c);
    System.out.println(d);

    //Math Function
    int a3=5, b3=6;
    System.out.println(Math.max(a3, b3)); //Math.max function return maximum value
    System.out.println(Math.min(a3, b3)); //Math.min function return maximum value
    System.out.println((int)(Math.random()*100)); //Math.random function generate random number from 0to<1;

        //Take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int result=input.nextInt();
        System.out.print("Enter Float : ");
        float result2= input.nextFloat();
        System.out.print("Enter String: ");
        String result3= input.nextLine();
        System.out.println("Int: "+result+" Float: "+result2+" String: "+result3);

       // Try-catch Exception
        int result4[]={0,1,2,3};
        try{
        System.out.println(result4[5]);
        }catch(Exception e){
            System.out.println("Exception caught");
        

        }System.out.println("The sudent name is Amana");

        

}

}
