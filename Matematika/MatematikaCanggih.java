// Nama  : Richard Panigor Sitompul
// NIM   : 11200930000025
// Kelas : 2A-Sistem Informasi
// Jawaban soal no.3

package Matematika;

public class MatematikaCanggih {

    int hasil;

    void pertambahan(int a, int b, int c){
        hasil = a+b+c;
        System.out.println("Hasil dari " + a + " + " + b + " + " + c + " = " + hasil);
    }

    void pengurangan(int a, int b, int c){
        hasil = a-b-c;
        System.out.println("Hasil dari " + a + " - " + b + " - " + c + " = " + hasil);
    }

    void perkalian(int a, int b, int c){
        hasil = a*b*c;
        System.out.println("Hasil dari " + a + " x " + b + " x " + c + " = " + hasil);
    }

    void pembagian(int a, int b, int c){
        hasil = a/b/c;
        System.out.println("Hasil dari " + a + " : " + b + " : " + c + " = " + hasil);
    }
    
    void modulus(int a, int b){
        hasil = a%b;
        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
    }
}
