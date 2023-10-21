public class inverted_star {
    public static void main(String[] args) {
        for(int line=0;line<=5;line++){
            for(int stars=1;stars<=5-line-1;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
