import java.util.Scanner;

public class PerhitunganGajiKaryawan{

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int masaKerja, totalJamKerja;
        double gajiPokok = 5000000, gajiAkhir, tambahanGaji = 0, uangLembur = 0;
        int jamKerjaPerHari = 8;  // Jam kerja normal per hari
        int jamKerjaPerMinggu = 40;  // Jam kerja normal per minggu
        int uangLemburPerJam = 50000;  // Uang lembur per jam
         // Hitung jumlah jam lembur dalam 1 bulan (dianggap 4 minggu dalam sebulan)
        int jamNormalSebulan = jamKerjaPerMinggu * 4;  // 40 jam kerja per minggu x 4 minggu
        int jamLembur = totalJamKerja - jamNormalSebulan;

        // Input masa kerja dan jumlah jam kerja dari user
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();

        System.out.print("Masukkan total jam kerja dalam 1 bulan: ");
        totalJamKerja = scanner.nextInt();

        // Hitung tambahan gaji berdasarkan masa kerja
        if (masaKerja >= 5 && masaKerja <= 10) {
            tambahanGaji = 0.05 * gajiPokok;  // Tambahan 5% jika masa kerja antara 5-10 tahun
        } else if (masaKerja > 10) {
            tambahanGaji = 0.10 * gajiPokok;  // Tambahan 10% jika masa kerja di atas 10 tahun
        }

        // Jika ada jam lembur, hitung uang lembur
        if (jamLembur > 0) {
            uangLembur = jamLembur * uangLemburPerJam;
        }

        // Hitung gaji akhir
        gajiAkhir = gajiPokok + tambahanGaji + uangLembur;

        // Tampilkan hasil perhitungan
        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Tambahan gaji: Rp " + tambahanGaji);
        System.out.println("Uang lembur: Rp " + uangLembur);
        System.out.println("Gaji total yang diterima: Rp " + gajiAkhir);
        
        scanner.close();
    }
}

        /* 
            Program Perhitungan Gaji Karyawan

            Deklarasi
                Var uangLemburPerJam = 50000,
                    jamKerjaPerHari = 8
                    jamKerjaPerMinggu = 40,
                    totalJamKerja,
                    jamKerjaPerBulan = jamKerjaPerMinggu * 4 // 160 jam per bulan
                    masaKerja,
                    : integer;
                    gajiPokok = 5000000,
                    tambahanGaji = 0,
                    uangLembur = 0,
                    gajiAkhir,
                    : double;
                    

            Algoritma
                input (masaKerja);
                input (totalJamKerja);

                if masaKerja >= 5 and masaKerja <= 10 then
                    output (tambahanGaji = 0.05 * gajiPokok);  // 5% tambahan
                else if masaKerja > 10 then
                    output (tambahanGaji = 0.10 * gajiPokok);  // 10% tambahan
                end if

                if totalJamKerja > jamKerjaPerBulan then
                    output (uangLembur = (totalJamKerja - jamKerjaPerBulan) * uangLemburPerJam);


                output (gajiPokok)
                output (tambahanGaji)
                output (uangLembur)
                output (gajiAkhir = gajiPokok + tambahanGaji + uangLembur);

            End
        */
