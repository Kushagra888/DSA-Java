
class Wood {
    // priority wise -- static block -- constructor block -- constructor
    static {
        System.out.println("static block of wood");
    }

    {
        System.out.println("jite rho");
    }

    Wood() {
        System.out.println("con. of wood");
    }
}

public class Block {
    static {
        System.out.println("Hii from static block in java");
    }

    public static void main(String[] args) {
        // Wood w = new Wood();
    }
}
