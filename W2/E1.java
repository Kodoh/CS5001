package W2;

public class E1 {
    public static void main(String[] args) {
        // one_to_ten();
        // inline_sequence(-2,4,1);
        // inline_sequence(6,18,2);
        // inline_sequence(10,50,10);
        // inline_sequence(68,44,-3);
        // while_one_to_ten();
        // ascii_art(3);
        E2 triangle = new E2(10);
        triangle.printToScreen();

    }

    public static void one_to_ten() {
        for (int i = 1; i<11; i++) {
            System.out.println(i);
        }
    }
    public static void inline_sequence(int start, int finish, int increment) {
        if (start < finish) {
            for (int i = start; i<(finish+increment); i+=increment) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        else {
            for (int i = start; i>(finish+increment); i+=increment) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }


    public static void while_one_to_ten() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void ascii_art(int size) {
        for (int i = 1; i<size;i++) {
            for(int j=0; j<size*2;j++) {
                if (j == (size-i) || (j== (size+(i-2)))) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 1;i<size*2;i++) {
            System.out.print('*');
        }
    }
}
