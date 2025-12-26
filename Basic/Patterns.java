package Java.Basic;
import java.util.*;
import java.io.*;

public class Patterns {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value n: ");
        int n = scan.nextInt();
        Patterns pattern = new Patterns();
        pattern.pattern16(n);
    }
    
   void pattern16(int n){
    
   for(int i = 1; i<=n; i++){
   int k = (2*n + 3) - 2*i;
       for(int j = 1; j<= k; j++){
       System.out.print(" ");
       }

       for(int g = 1; g<=i; g++){
        System.out.print(ncrpascal(i, g) + "   ");
       }

       System.out.println();
   }
 }

    int ncrpascal(int a, int b){

    int x = a-1;
    int y = b-1;
    int res = 1;
    for(int i = 0; i<y; i++){
        res = res * (x - i);
        res = res / (i + 1);
    }
    return res;
    }

    void pattern15(int n) {
    if (n <= 0) return;

    // upper half (1..n)
    for (int i = 1; i <= n; i++) {
        for (int s = 0; s < n - i; s++) System.out.print(" ");

        int inner = 2 * i - 3;
        if (inner < 0) {
            System.out.println("*");
        } else {
            System.out.print("*");
            for (int k = 0; k < inner; k++) System.out.print(" ");
            System.out.println("*");
        }
    }

    // lower half (r = 1..n-1) using the derived formula
    for (int r = 1; r < n; r++) {
        for (int s = 0; s < r; s++) System.out.print(" ");

        int inner = 2 * (n - r) - 3;
        if (inner < 0) {
            System.out.println("*");
        } else {
            System.out.print("*");
            for (int k = 0; k < inner; k++) System.out.print(" ");
            System.out.println("*");
        }
    }
}














    void pattern14(int n){
     
        for (int i=1; i<=n; i++){
        
        for(int j = 1; j<i; j++){ // leading spaces
            System.out.print(" ");
          } 
        
        if(i==1){
        for(int j=1; j<=((2*n)-1); j++){
            System.out.print("*");
         }
        }
        else if(i==n){
            System.out.print("*");
        }else{
        System.out.print("*");
        for(int j = 0 ;j<((2*(n-i))-1) ; j++){
        System.out.print(" ");
        }
        System.out.print("*");
        }
  
        System.out.println("");
        }
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    void pattern13(int n) {
    for (int i = 1; i <= n; i++) {
        // leading spaces
        for (int j = 1; j <= n - i; j++) System.out.print(" ");

        if (i == 1) {
            System.out.print("*");
        } else if (i == n) {
            for (int j = 1; j <= ((2*n)-1); j++) System.out.print("*");
        } else {
            System.out.print("*");
            for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
    }
}




    void pattern12(int n){  
     
    System.out.println("Similar to previous ones");


    }

    void pattern11(int n){  
     
    System.out.println("Similar to previous ones");


    }
     
    
    void pattern10(int n){  
     
    System.out.println("Similar to previous ones");


    }

    void pattern9(int n){
        for(int i = 1; i<=n; i++){
        //section1
            for(int j = 1; j<i; j++){
                System.out.print("  ");
            }
        //section2
             for (int a = 1; a<=n-i+1; a++) {
                System.out.print("* ");
            }
        
        //section3
             for (int a = 1; a<=n-i; a++) {
                System.out.print("* ");
            } 
         System.out.println();
        }
     }
    
    
    void pattern8(int n){
        for(int i = 1; i<=n; i++){
        //section1
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
        //section2
             for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
        
        //section3
        
            for (int a = 1; a < i; a++) {
                 System.out.print("* ");
            }
        
            /*
                for(int k = 1; k<=(1+(2*i)) ; k++){
                    System.out.println("* ");
            }
        //section4
        
            for (int j = n-i; i > 0; j--) {
                System.out.print("  ");
            }*/

         System.out.println();
        }
     }



    void pattern7(int n){
       for(int i = 1; i<=n; i++){
         for(int j = 1; j<= i-1; j++){
            System.out.print("  ");
         }
         for(int k = n-i+1; k>0; k--){
            System.out.print("* ");
         }  
        System.out.println();
       }
    }



    void pattern6(int n){
    for (int i = 1; i <= n ; i++) {
        for(int j = n - i; j>0; j--){
            System.out.print("  ");
        }
        for (int j = 1; j <= i ; j++) {
            System.out.print("* ");
        }
        System.out.println("");
     }
    }
    void pattern5(int n){
    for(int i = 1;  i<=n; i++){
      for (int j = 1; j <= i; j++) {
          System.out.print("* ");
      }
      System.out.println();
     }
     for(int i = n; i>1; i--){
      for (int j = 1; j < i; j++) {
          System.out.print("* ");
      }
      System.out.println();
     }
    }

    
    void pattern4(int n){
    for(int i = 1;  i<=n; i++){
      for (int j = 1; j <= i; j++) {
          System.out.print(j);
      }
      System.out.println();
     }
    }
    
    void pattern3(int n){
       for(int i=1; i<=n; i++){// Creates n number of line
       // code block to be performed from 1 to n number line
        for(int j=n-i+1; j>0; j--){// now for each line say i = 1, so here the loop performs for 1x1, 1x2 ,......,1xn
        System.out.print("* ");
        }
        System.out.println();// need to move to second
      }
    }  

    void pattern2(int n){
       for(int i=1; i<=n; i++){// Creates n number of line
       // code block to be performed from 1 to n number line
        for(int j=1; j<=i; j++){// now for each line say i = 1, so here the loop performs for 1x1, 1x2 ,......,1xn
        System.out.print(j);
        }
        System.out.println();// need to move to second
      }
    }  
  
    void pattern1(int n){
       for(int i=1; i<=n; i++){// Creates n number of line
       // code block to be performed from 1 to n number line
        for(int j=1; j<=n; j++){// now for each line say i = 1, so here the loop performs for 1x1, 1x2 ,......,1xn
        System.out.print("* ");
        }
        System.out.println();// need to move to second
    }
 }
}