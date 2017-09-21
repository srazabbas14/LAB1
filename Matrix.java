import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author sabbas.bscs15seecs
 */
public class Matrix {
    private static Scanner scanner = new Scanner(System.in);
    public static functions obj = new functions();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt the user
        //Assumption: Matrix would always be square matrix
        System.out.print("Type name for 1st matrix: ");

        // Read a line of text from the user.
       String m1 = scanner.nextLine();

        System.out.print("Type name for 2nd matrix: ");

        // Read a line of text from the user.
        String m2 = scanner.nextLine();

        //Getting dimensions for 1st matrix
        System.out.print("Enter dimension for matrix " + m1 + "  ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Dimension:" + a + " x " + b);

        System.out.println("Enter elements in " + m1);
       double[][] array1 = new double[a][b];

       for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array1[i][j] = scanner.nextInt();
            }
       }

        //Getting dimensions for 2nd matrix
        System.out.print("Enter dimension for matrix: " + m2 + "  ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
       System.out.println("Dimension:" + c + " x " + d);

        System.out.println("Enter elements in " + m2);
        double[][] array2 = new double[c][d];

        for (int i = 0; i < c; i++) {
           for (int j = 0; j < d; j++) {
               array2[i][j] = scanner.nextInt();
           }
        }
        System.out.print("Kindly follow these equation formats: \n");
        System.out.print("For addition: martix1_name,+,matrix2_name \n");
        System.out.print("For subtraction: martix1_name,-,matrix2_name \n");
        System.out.print("For multiplication: martix1_name,*,matrix2_name \n");
        System.out.print("For scalar multiplication: martix1_name,x,scalar_value \n");
        System.out.print("For transpose: martix_name,^ \n");
        System.out.print("For inverse: martix_name,I \n");
        System.out.print("Enter an equation:  ");

        String equation = scanner.next();
        
        StringTokenizer st = new StringTokenizer(equation, ",");
        String arr1=st.nextToken();
        String op = st.nextToken();
        String s;
        int scalar=1;
        
         double[][] a1 = new double[a][b];
         double[][] a2 = new double[c][d];
  
         int n1=0;
         int n2=0;
        
         if (arr1.equals(m1))
        {
         for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                a1[i][j] = array1[i][j];
            }
          }
         n1=a;
         n2=b;
        }
        
        if (arr1.equals(m2))
        {
         for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                a1[i][j] = array2[i][j];
            }
         }
         n1=c;
         n2=d;
        }
        
        if (op.equals("x"))
        {
         s=st.nextToken();
         scalar=Integer.parseInt(s);
        }
        
        if (!op.equals("^") && !op.equals("I") && !op.equals("x"))
        {
          String arr2=st.nextToken();
           if (arr2.equals(m1))
        {
         for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                a2[i][j] = array1[i][j];
            }
          }
         n2=b;
        }
        
        if (arr2.equals(m2))
        {
         for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                a2[i][j] = array2[i][j];
            }
         }
         n2=d;
        }
        }
        else
        {
        	 for (int i = 0; i < c; i++) {
                 for (int j = 0; j < d; j++) {
                     a2[i][j] = array2[i][j];
                 }
              }
        }
        
        double [][]f=new double[n1][n2];
   

        switch(op) {
         case "+" :
        f=functions.addition(a1,a2);
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
            	System.out.println(f[i][j]);
            }
         }
            break;
         case "-" :
        f=functions.subtraction(a1,a2);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
            	System.out.println(f[i][j]);
            }
         }
             break;
         case "*" :
       f=functions.multiplication(a1,a2);
       for (int i = 0; i < n1; i++) {
           for (int j = 0; j < n2; j++) {
           	System.out.println(f[i][j]);
           }
        }
            break;
         case "x" :
        f=functions.scalar_multiply(a1,scalar);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
            	System.out.println(f[i][j]);
            }
         }
            break;
         case "^" :
        f=functions.transpose(a1);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
            	System.out.println(f[i][j]);
            }
         }
            break;
         case "I" :
        f=functions.inverse(a1);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
            	System.out.println(f[i][j]);
            }
         }
            break;
         default :
            System.out.println("Invalid operation");
      }
    }   
}