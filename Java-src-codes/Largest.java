
import java.util.Scanner; 
class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] a= new int[4][3];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                
    a[i][j]= scanner.nextInt(); 
            }
            System.out.println("");
        }
          for(int i=0;i<3;i++)
        {
            int c=0;
            for(int j=0;j<4;j++)
            {
                int b=a[j][i];
                if(c<=b)
                {
                    c=b;
                }
    
            }
            System.out.println(c);
        }
        
    }
}