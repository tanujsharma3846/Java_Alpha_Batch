public class bit_operations{

    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static int updateIthbit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
    }

    public static int updateIthbit2(int n,int i,int newBit){
        n=clearIthBit(n,i);
        int BitMask=newBit<<i;
        return n|BitMask;
    }

    public static void main(String[] args) {
        //System.out.println(getIthBit(10,2));
        //System.out.println(getIthBit(10,3));
        //System.out.println(setIthBit(10,2));
        //System.out.println(clearIthBit(10,1));
        //System.out.println(updateIthbit(10,1,0));
        System.out.println(updateIthbit2(10,2,1));
        

    }
}