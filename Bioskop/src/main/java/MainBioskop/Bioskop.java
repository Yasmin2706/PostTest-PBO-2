package MainBioskop;

import java.util.Scanner;
import manajemen_film.MovieManager;
import manajemen_genrefilm.Genre;
import java.util.ArrayList;

public class Bioskop {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            MovieManager movieManager = new MovieManager();
            ArrayList<Genre> genreList = new ArrayList<>();

            // Tambahkan beberapa genre ke daftar genre
            genreList.add(new Genre("Action", "Film dengan banyak adegan aksi yang seru!"));
            genreList.add(new Genre("Drama", "Film dengan cerita yang mendalam dan menyentuh hati."));
            genreList.add(new Genre("Comedy", "Film dengan unsur humor yang lucu!"));
            genreList.add(new Genre("Horror", "Film yang menakutkan dan menyeramkan."));

            boolean running = true;

            while (running) {
                System.out.println("\n== Manajemen Film Bioskop ==");
                System.out.println("1. Tambah Film");
                System.out.println("2. Tampilkan Daftar Film");
                System.out.println("3. Hapus Film");
                System.out.println("4. Update Film");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // Tambah Film
                        movieManager.create();
                        break;

                    case 2:
                        // Tampilkan Daftar Film
                        movieManager.read();
                        break;

                    case 3:
                        // Hapus Film
                        movieManager.delete();
                        break;

                    case 4:
                        // Update Film
                        movieManager.update();
                        break;

                    case 5:
                        running = false;
                        System.out.println("Keluar dari sistem.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }
}