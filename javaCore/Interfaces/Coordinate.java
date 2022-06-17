import java.util.*;

public class Coordinate {

    public static int area(int x1, int x2, int y1, int y2) {

        int dx = x2 - x1;
        int dy = y2 - y1;
        if (dx < 0) {
            dx = 0;
        }
        int value = dx * y1 + dy * x2;
        return value;
    }
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
            
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  // End of function call sort().
    }

    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        // int n=3;
        // int[][] arr=new int[n][2];

        // for(int i=0;i<2;i++){
        // for(int j=0;j<n;j++){
        // arr[i][j]=sc.nextInt();
        // }
        // }
        // for(int i=0;i<2;i++){
        // for(int j=0;j<n;j++){
        // System.out.println(arr[i][j]+"");
        // }
        System.out.println();
        int n=3;
        int[][] arr = { { 2, 5 }, { 3, 4 }, { 4, 2 } };
        sortbyColumn(arr, 1);
        int sum=arr[0][0]*arr[0][1];
        for(int i=1;i<n;i++){
           sum+=area(arr[i-1][0], arr[i][0], arr[i-1][1],arr[i][1]);
            
        }
        System.out.println(sum);
    }

}
