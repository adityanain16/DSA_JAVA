package Week4;
import java.util.Scanner;
public class more{
    public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
            double[] numbers = new double[5];

            for (int i = 0; i < numbers.length; i++)
            {
                System.out.println("Please enter number");
                numbers[i] = input.nextDouble();
            }
        }
}
}
// 	 try (Scanner scn = new Scanner(System.in)) {
//         System.out.println("Enter Array ");
// 		int number = scn.nextInt();
// 		System.out.println("Array is "+number);
// 	 }
// }
// 		static void Selectionsort(int[] arr){
//         for(int i=0;i<arr.length-1;i++){
//             int idx= minimumvalue(arr, i);
//             int temp=arr[i];
//             arr[i]=arr[idx];
//             arr[idx]=temp;
//     }
// }

// // Find the index of the minimum element from an array: arr
// static int minimumvalue(int[] arr,int a){
//     int mini= a;
//     for(int i=a+1; i<arr.length;i++)
//         if(arr[mini]>arr[i])
//             mini=i;
//     return mini;
// }

// static void display(int[] arr){
//     for(int i:arr) System.out.print(i+" ");
//     System.out.println();
// }
// }
    // public static void main(int n) {
    //         int count=0;
    //         int temp =n;
    //         while(temp>0){
    //             if(temp==count)
    //             count++;
    //             count=count/10;
    //         }
    //         System.out.println(count);
    //     }
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         int n = sc . nextInt();
    //         }
    //     }



    //     public static int countRepeatingDigits(int num) {
//         int count = 0;
//         // try (Scanner scn = new Scanner(System.in)) {
//         String strNum = Integer.toString(num); // Convert the number to a string
 
//         // Outer loop to iterate through each digit in the number
//         for (int i = 0; i < strNum.length(); i++) {
//             // Inner loop to compare the current digit with subsequent digits
//             for (int j = i + 1; j < strNum.length(); j++) {
//                 // Check if the current digit (at index i) is equal to the subsequent digit (at index j)
//                 if (strNum.charAt(i) == strNum.charAt(j)) {
//                     count++; // Increment count if a repeating digit is found
//                     break; // Exit the inner loop once a repeating digit is found
//                 }
//             }
//         }
 
//         return count;
//     }
//     public static void main(String[] args) {
//         int num = 5433231;
//         int repeatingDigits = countRepeatingDigits(num);
//         System.out.println("Number of repeating digits: " + repeatingDigits);
//     }
// }
    



    //     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         int sum=0,x,i=0;
//         int[] arr=new int[9];
//         while(sc.hasNext())
//         {
//          x=sc.nextInt();
//          arr[i]=x;
//          if(sum+arr[i]<0)
//                 break;
//          i++;
//         }
//         System.out.println();
//         for(int j=0;j<i;j++)
//         {
//             System.out.println(arr[j]);
//         }

//     }
// }


    //     public static void main(String[] args) {
//         int n, count = 0, a, b, c, sum = 0;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         n = s.nextInt();
//         a = n;
//         c = n;
//         while(a > 0)
//         {
//             a = a / 10;
//             count++;
//         }
//         while(n > 0)
//         {
//             b = n % 10;
//             sum = (int) (sum+Math.pow(b, count));
//             n = n / 10;
//         }
//         if(sum == c)
//         { System.out.println(c+ " is an Armstrong number");
//     }
//     else
//     {
//         System.out.println(c+ " is not an Armstrong number");
//     }    
// }
// }


//     public static void main(String[] args) {

//         Scanner reader = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = reader.nextInt();

//         if(num % 2 == 0)
//             System.out.println(num + " is even");
//         else
//             System.out.println(num + " is odd");
//     }
// }


//     public static void main(String[] args) {
//         try (Scanner scn = new Scanner(System.in)) {
//         // int count = 0;
//         int number=0;
//         String strNum = Integer.toString(number); // Convert the number to a string
 
//         // Outer loop to iterate through each digit in the number
//         for (int i = 0; i < strNum.length(); i++) {
//             // Inner loop to compare the current digit with subsequent digits
//             for (int j = i + 1; j < strNum.length(); j++) {
//                 // Check if the current digit (at index i) is equal to the subsequent digit (at index j)
//                 if (strNum.charAt(i) == strNum.charAt(j)) {
//                     number++; // Increment count if a repeating digit is found
//                     break; // Exit the inner loop once a repeating digit is found
//                 }
//             }
//         }
//         // return num;
// }
//     }
// }


//     public static void main(String[] args) {
//         int  = 5433231;
//         int repeatingDigits = countRepeatingDigits(num);
//         System.out.println("Number of repeating digits: " + repeatingDigits);
//     }
// }


    // public class Main {
//     public static void main(String[] args) {
//         try (Scanner scn = new Scanner(System.in)) {
//             int number = scn.nextInt();
//             int rev = 0;
            
//             while(number != 0) {
//                 int rem = number % 10;
//                 rev = rev * 10 + rem;
//                 number /= 10;
//             }
            
//             System.out.println(rev);
//         }
//     }
// }