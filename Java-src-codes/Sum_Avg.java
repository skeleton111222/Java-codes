import java.util.Scanner; 
class Sum_Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int[] a= new int[10];
        for(int i=0;i<10;i++)
        {
    a[i]= scanner.nextInt(); 
     sum+=a[i];
        }
        double avg= sum / 10;
            System.out.println("Sum is:"+sum);
            System.out.println("Average is:"+avg);
        
    }
}