public class Tiling {
    public static int tiles(int n){
        if(n==0||n==1){
            return 1;
        }
        // vertical tiles
        int fm1=tiles(n-1);

        // horizontal tiles
        int fm2=tiles(n-2);

        // total ways
        int total=fm1+fm2;
        return total;
    }
    public static void main(String args[]){
        System.out.println(tiles(3));
    }
}
