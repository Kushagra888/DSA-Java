
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("queen is moving...");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("rook is moving...");
    }
}


public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();
    }
}
