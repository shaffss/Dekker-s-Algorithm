package pkg;

public class T1 extends Dekker {
    @Override
    public void run() {
        for(int i=0; i<n; i++) {
            wants_to_enter[1] = true;
            while (wants_to_enter[0] == true) {
                if (turn != 1) {
                    wants_to_enter[1] = false;
                    while (turn != 1) {
                        //busy waiting for its turn
                    }
                    wants_to_enter[1] = true;
                }
            }
            turn = 0;
            System.out.println("T1:" + turn);
            wants_to_enter[1] = false;
        }
    }
}
