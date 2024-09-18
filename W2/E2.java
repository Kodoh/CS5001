package W2;

public class E2 { 

    int size;

    public E2(int size) {
        this.size = size;
    }

    public void printToScreen() {
        for (int i = 1; i<this.size;i++) {
            for(int j=0; j<this.size*2;j++) {
                if (j == (this.size-i) || (j== (this.size+(i-2)))) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 1;i<this.size*2;i++) {
            System.out.print('*');
        }
    }
}

