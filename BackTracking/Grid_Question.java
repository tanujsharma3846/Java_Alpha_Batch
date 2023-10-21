public class Grid_Question {
    public static int gridWays(int i,int j,int n,int m){
        // base case
        if(i==n-1 && j==m-1){ // last cell conditon
            return 1;
        }else if(i==n || j==n){ // boundary cross conditon
            return 0; 
        }
        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;

    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(gridWays(0,0,n,m));

    }
}
