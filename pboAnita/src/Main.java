import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int menu;
        String tempNama;
        String tempNim;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nama: Ni Made Anita Dewi\nNIM: 1908561104\nMenu:\n1. Ubah Data Mahasiswa\n2. Print Data Mahasiswa\n3. Keluar\nPil: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Nama: ");
                    tempNama = input.nextLine();
                    System.out.println("NIM: ");
                    tempNim = input.nextLine();

                    DataMahasiswa dataMahasiswa = new DataMahasiswa(tempNama, tempNim);
                    SimpanData simpanData = new SimpanData();
                    simpanData.simpanData(dataMahasiswa);
                    break;
                case 2:
                    DataMahasiswa dataMahasiswa1 = new MuatData().muatDataMhs();
                    System.out.println("Nama: " + dataMahasiswa1.getNama());
                    System.out.println("NIM: " + dataMahasiswa1.getNim());

                    break;
                case 3:
                    break;
            }
            System.out.println("Tekan apapun untuk melanjutkan");
            input.nextLine();
        } while (menu != 3);
    }
}
