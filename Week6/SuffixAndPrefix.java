package Week6;

public class SuffixAndPrefix {
    // Q1 
    // static String reverse(String s1){
    //     String s2="";
    //     for(int i=s1.length()-1;i>=0;i--){
    //            s2+=s1.charAt(i);

    //     }
    //     return s2;


// Q2
    // static boolean checkpal(String s){
    //     int i=0, j=s.length()-1;
    //     while(i<=j){
    //         if(s.charAt(i)!=s.charAt(j))
    //             return false;
    //         i++;j--;        
    //     }
    //     return true;

    // Q3
    // static char MaxOcc1(String s){
    //     int CountMaxElement=0;
    //     char maxElement='*';
    //     int countCurrElement=0;
    //     int currElement='*';
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)!=currElement){
    //             if(countCurrElement>CountMaxElement){
    //                 CountMaxElement=countCurrElement;
    //                 maxElement=currElement;
    //             }
    //             currElement= s.charAt(i);
    //             countCurrElement=1;
    //         }
    //         else{
    //             countCurrElement++;
    //         }
    //     }
    //     if(countCurrElement>CountMaxElement){
    //         CountMaxElement=countCurrElement;
    //         maxElement=currElement;
    //     }
    //     return maxElement;


//Q4
// static char MaxOcc2(String s){
//     int[] arr= new int[26];
//     for(int i=0;i<s.length();i++){
//         arr[s.charAt(i)-'a']++;
//     }
//     int index=0;
//     for(int i=0;i<arr.length;i++){
//         if(arr[index]<arr[i]){
//             index=i;
//         }
//     }
//     return(char)('a'+index);


// Q5
static void reverseWords(String s){
        String[] arr= s.split("\\s");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
}

    public static void main(String[] args) {
        String original="I am Batman";
        reverseWords(original);
    }
}

       
        // Q4
        // String original="aaaadddeegg"
        // System.out.println(original);


    // Q3
// String original="aaaabbccddde";
// System.out.println(original);



    // Q2 Check palendrome
// String original="PotatoP";
// System.out.println(checkpal(original));


// Q1 Function to reverse the string 
//Eg: Potato=otatoP
// String original="Potato";
// String rev= reverse(original);
// System.out.println(rev);



        // String s="hello";
        // char[] c={'h','e','l','l','o'};
        // System.out.println(c);

    // String S1= "Hello";
    // String S2= "lo";
    // System.out.println(S1.contains(S2));
    
    // String S1= "Hello";
    // String S2= new String(" ");
    // System.out.println(S2.isEmpty());

//     String S1= "Hello Aditya";
//     S1= S1.replace("Aditya","Ankit")
//     System.out.println(S1);

// String s1= "   Aditya   ";
// s1= s1.trim();
// System.out.println(s1);

// String s1= "this is classes";
// System.out.println(s1.indexOf("class"));

// String S1= "Hello ADFTR";
//     System.out.println(S1.toUpperCase());

//Part 2 Regex
// String s1="This\sis\sCla\sss";    // it is used for normal space 
// System.out.println(s1);

// String s2= "This \tis\t cl\tass"; // it is use to for tab space 
// System.out.println(s2);

// String s3= "This is \r Funny";    // use to rewrite or overwrite the sentence 
// String s4= "Girls Rule \f";       // backspace where we write before that it remove the alphabet
// System.out.println(s4);

// String s5="\"Hello\"";           // Use to add double quotes to the same word 
// System.out.println(s5);

//Part 3 Split Function (Return type of split function is an array)
// String s1= "Hi, this is an example string ";
// String[] arr=s1.split("\\s",4);            // first slash is for regex code and second slash for breaking the string into parts (the number will divide it into the no of separate strings)
// for(String i: arr)
//     System.out.println(i);

//Part 4 String Intern
// String s1="hello";
// String s2= "hello";
// String s3 =new String("hello").intern();      // intern will copy s3 and check wheather it is present before and gives the first created hello
// System.out.println(s1==s3);

//Part 5 ValueOf (in this we can also pass the objects also)
// int n= 5;
// String s1= String.valueOf(n);
// s1+= "abc";
// System.out.println(s1);

