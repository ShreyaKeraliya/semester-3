/**
 * PascalTriangle
 */
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int ans = 1;
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print(ans+" ");
                ans = ans*(i-k)/(k);
                    
                }     
                System.out.println();
            }
        }
        
    }

    
