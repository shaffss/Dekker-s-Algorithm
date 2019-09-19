package pkg;

public class Dekker extends Thread{
    protected static final int n = 10; //liczba wykonan dla kazdego watku
    protected static volatile boolean[] wants_to_enter = new boolean[]{false,false}; //flagi checi wejscia w sekcje krytyczna dla watkow
    protected static volatile int turn = 0; //lub 1, inicjalizacja
    //sterownik do testow:
    public static void main(String[] args){

        //tworzenie watkow
        Thread t = new T0();
        Thread tt = new T1();

        //uruchamianie
        t.start();
        tt.start();
    }
}
