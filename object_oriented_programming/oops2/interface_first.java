public class interface_first {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        Rook r=new Rook();
        r.moves();
        Pawn p=new Pawn();
        p.moves();
    }
}
interface ChessPlayer{
    void moves();

}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagnol(in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagnol(by 1 step)");
    }
}
class Bishop implements ChessPlayer{
    public void moves(){
        System.out.println("diagnol only");
    }
}
class Knight implements ChessPlayer{
    public void moves(){
        System.out.println("two and a half steps");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("one step forward and diagnol to kill");
    }
}

