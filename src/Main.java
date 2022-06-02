import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Afisati media varstei persoanelor din lista
        List<Persoana> persoane = new ArrayList<>();
        persoane.add(new Student("florin", "ionel", 29, 9.3));
        persoane.add(new Persoana("Flesar", "Radu", 31));
        persoane.add(new Student("Ion", "Ionel", 30, 10, "Stiinte economice"));


        int sumaVarste = 0;
        for (var p : persoane) {
            sumaVarste += p.getVarsta();
        }


        int sumaVarstePeroane = 0, nrPersoane = 0;
        for (var p : persoane) {
            if (!(p instanceof Student)) {
                sumaVarstePeroane += p.getVarsta();
                nrPersoane++;
            }
        }

        double nrStudenti = 0, sumaNotelor = 0;
        for (var p : persoane) {
            if (p instanceof Student) {
                sumaNotelor += ((Student)p).Media;
                nrStudenti++;
                }
        }


        double media = 1.0 * sumaVarste / persoane.size();
        double mediaStudenti = 1.0 * sumaVarstePeroane / nrPersoane;
        double mediaNotelorStudenti = sumaNotelor / nrStudenti;


        System.out.println("Media varstei este: " + media);
        System.out.println("Media varstei persoane este: " + mediaStudenti);
        System.out.println("Media notelor studentilor este: " + mediaNotelorStudenti);

    }
}

//    public static void main(String[] args) {
//        // Calculati intr-o variabila suma a doua nr primite pe linia de argumente
//
//        int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
//        int suma = x + y;
//        System.out.println("Suma este: " + suma);
//        Random random = new Random(System.currentTimeMillis());
//        x = random.nextInt(100);
//        y = random.nextInt(100);
//        suma = x + y;
//        System.out.println("x= " + x + " y=" + y + "\nSuma este: " + suma);
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0;i<12; i++){
//            list.add(random.nextInt(1000));
//        }
//        for (int z : list){
//            System.out.println(z + " ");
//        }
//        System.out.println();
//        int max = list.get(0), min = list.get(0);
//        for(int z: list){
//            if(z< min){
//                min = z;
//            }
//            if(z > max){
//                max = z;
//            }
//        }
//        System.out.println("Minimul este: "+ min + "\nMaximul este: "+ max);
//
//        Scanner tastatura = new Scanner(System.in);
//        System.out.println("Introduceti valoarea lui x:");
//        x = tastatura.nextInt();
//        System.out.println(x);
//
//    }
//}

//        int[] a = new int[100];
//        for (innt i=0;i<100;i++) {
//            a[i]= i
//        }
//
//        List<Inreger> A = new ArrayList<>();
//        for(int i=0 i<100;i++){
//            A.add(i);
//        }
//        System.out.println("Array:");
//        for(int i=0;i<100;i++){
//            System.out.println(i + " ");
//        }
//        System.out.println("\nList:");
//        a.forEach (System.out::print);
//        System.out.println("\nList for each");
//        for(var v :A) {
//            System.out.println(v);
//        }

//        // Creati o lista cu 10 elemente random
//        // afisati minimul, maximul, suma elementelor si media geometrica a min si max
//            List<Integer> integers = new ArrayList<>();
//                Random rand = new Random(System.currentTimeMillis());
//                for (int i=0; i<10; i++){
//                    integers.add(rand.nextInt(5000));
//                }
//
//                int min = integers.get(0), max = integers.get(0), suma = 0;
//                for( int x : integers) {
//                    suma += x;
//                    System.out.println(x+" ");
//                    if(x<min){
//                        min = x;
//                    }
//                    if(x> max){
//                        max = x;
//                    }
//                }
//        System.out.println();
//
//        System.out.printf("MInimul din lista este %d\nMaximul din lista este %d\n", min, max);
//        System.out.printf("Suma elementelor este %d\n", suma);
//        double mediaG = Math.sqrt(min*max);
//        System.out.printf("Media G este %f ", mediaG);
//




