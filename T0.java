package pkg;

public class T0 extends Dekker {
    @Override
    public void run() {
        for(int i=0; i<n; i++) {
            wants_to_enter[0] = true;
            while (wants_to_enter[1] == true) {
                if (turn != 0) {
                    wants_to_enter[0] = false;
                    while (turn != 0) {
                        //busy waiting for its turn
                    }
                    wants_to_enter[0] = true;
                }
            }
            turn = 1;
            System.out.println("T0:" + turn);
            wants_to_enter[0] = false;
        }
    }
}
