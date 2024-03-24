import java.util.Scanner;

public class {



    static Scanner scanner = new Scanner(System.in);
    static String nama;
    static int nim;
    static double TugasTest, QuizTest;
    static double finalScore;

    public static void main(String[] args) {
        choose();
        inputNilai();
        boolean exit = false;
        while (!exit) {
            System.out.println("\nPilihan:");
            System.out.println("1. input Nilai");
            System.out.println("2. Transkrip Nilai");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> inputNilai();
                case 2 -> TranskripNilai();
                case 3 -> exit = true;
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    static void choosekelas(int matkulchoice) {
        System.out.println("Pilih kelas:");
        System.out.println("1. kelas praktikum");
        System.out.println("2. kelas Teori");
        System.out.print("Pilihan Anda: ");
        int kelasChoice = scanner.nextInt();
        if (kelasChoice == 1) {
            
        } else if (matkulChoice == 3) {
            System.out.println("Pilih matkul:");
            System.out.println("1. PBO");
            System.out.println("2. SCPK");
            System.out.println("2. ALGO LANJUT");
            System.out.print("Pilihan Anda: ");
            if (matkulchoice == 1)
        } else {
            System.out.println("Pilihan tidak valid.");
            chooseMatkul();
        }
    }

    static void inputNilai() {
        scanner.nextLine(); 
        System.out.print("Masukkan nim: ");
        nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
        System.out.print("Nilai Tugas: ");
        double praktikumTest = scanner.nextDouble();
        System.out.print("Nilai Quiz: ");
        double ToeriTest = scanner.nextDouble();
      
    }

    static void TranskripNilai() {
        calculateFinalScore();
        System.out.println("\nNama: " + nama);
        String nim = null;
        System.out.println("NIM: " + nim);
        System.out.println("Total Nilai: " + finalScore);
        if (finalScore >= 85) {
    }

    static void calculateFinalScore(int Kelas) {
        switch (Kelas) {
            case "kelas praktikum":
                finalScore = (TugasTest * 0.30) + (QuizTest * 0.70) ;
                break;
            case "kelas teori":
                finalScore = (TugasTest * 0.70) + (QuizTest * 0.30) ;
                break;
            default:
                finalScore = 0;
        }
    }
}


