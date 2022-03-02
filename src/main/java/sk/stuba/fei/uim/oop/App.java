package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        /*int celeCislo = 5;
        long celeVacsieCislo = 5L;
        float desatinneCislo = 5.5f;
        double dlhsieDesatinneCislo = 5.5;
        char znak = 'a';
        String retazec = "retazec";
        boolean bool = false;

        int podiel = 2/3; //0
        System.out.println(podiel);

        int zvysok = 2%3;  //2
        System.out.println(zvysok);

        float podielFloat = 2/3.0f;
        System.out.println(podielFloat);*/ //premenne
        /*int cislo = Integer.parseInt(args[0]);
        if(cislo == 0) {
            System.out.println("je to nula");
        } else {
            System.out.println("nie je to nula");
        }*/ //if
        /*int cislo = 1;
        while( cislo<4 ) {
            switch (cislo) {
                case 1:
                    System.out.println("Cislo je 1");
                    break;
                case 2:
                    System.out.println("Cislo je 2");
                    break;
                default:
                    System.out.println("Cislo je ine ako 1 alebo 2");
            }
            cislo++;
        }*/ //switch + while
        int[] pole = new int[10];
        for(int i = 0; i< pole.length; i++){
            pole[i]=i;
        }
        for(int i = 0; i< pole.length; i++){
            App.vypis(i);
        }
    }
    public static void vypis(int a){
        System.out.println(a);
    }
}
