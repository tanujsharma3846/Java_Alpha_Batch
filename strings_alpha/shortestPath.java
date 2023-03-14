public class shortestPath {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            // south
            if(dir=='S'){
                y--;
            }
            // North
            else if(dir=='N'){
                y++;
            }
            // west
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        float x2=x*x;
        float y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="NS";
        System.out.println(getShortestPath(path));
    }
}
