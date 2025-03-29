class Janvar {
    Janvar() {
        System.out.println("constructor of Janvar is called");
    }
    Janvar(int a) {
        System.out.println("value is very " + a);
    }

    int weight;
    
}

class ghoda extends Janvar {
    ghoda() {
        super(28);
        // super.color = "green";
        System.out.println("cons. of ghoda is called");
    }
}


public class Super {
    public static void main(String[] args) {
        // ghoda h = new ghoda();
        // System.out.println(h.color);
    }
}
