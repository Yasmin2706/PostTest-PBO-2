package manajemen_film;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager implements CRUDOperations {
    private final ArrayList<Movie> movieList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void create() {
        System.out.print("Masukkan Judul Film: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Tahun Rilis: ");
        int tahunRilis = scanner.nextInt();
        scanner.nextLine();  // Clear buffer
        System.out.print("Masukkan Sutradara: ");
        String sutradara = scanner.nextLine();
        System.out.print("Masukkan Genre: ");
        String genre = scanner.nextLine();
        
        // Membuat objek Movie baru
        Movie newMovie = new Movie(judul, tahunRilis, sutradara, genre);
        
        // Menambahkan objek Movie ke dalam daftar
        movieList.add(newMovie);
        
        System.out.println("Film berhasil ditambahkan!");
    }

    @Override
    public void read() {
        if (movieList.isEmpty()) {
        System.out.println("Tidak ada film dalam daftar.");
        } else {
            System.out.println("Daftar Film:");
            for (int i = 0; i < movieList.size(); i++) {
                System.out.println((i + 1) + ". " + movieList.get(i).getJudul());
                movieList.get(i).displayInfo();
            }
        }
    }

    @Override
    public void update() {
        read(); // Menampilkan daftar film terlebih dahulu
        if (!movieList.isEmpty()) {
            System.out.print("Pilih nomor film yang ingin diperbarui: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (index > 0 && index <= movieList.size()) {
                Movie movieToUpdate = movieList.get(index - 1);

                System.out.print("Masukkan Judul Baru (kosongkan jika tidak ingin mengubah): ");
                String judul = scanner.nextLine();
                if (!judul.isEmpty()) {
                    movieToUpdate.setJudul(judul);
                }

                System.out.print("Masukkan Tahun Rilis Baru (0 jika tidak ingin mengubah): ");
                int tahunRilis = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                if (tahunRilis != 0) {
                    movieToUpdate.setTahunRilis(tahunRilis);
                }

                System.out.print("Masukkan Sutradara Baru (kosongkan jika tidak ingin mengubah): ");
                String sutradara = scanner.nextLine();
                if (!sutradara.isEmpty()) {
                    movieToUpdate.setSutradara(sutradara);
                }

                System.out.print("Masukkan Genre Baru (kosongkan jika tidak ingin mengubah): ");
                String genre = scanner.nextLine();
                if (!genre.isEmpty()) {
                    movieToUpdate.setJenisGenre(genre);
                }

                System.out.println("Film berhasil diperbarui!");
            } else {
                System.out.println("Nomor film tidak valid.");
            }
        }
    }

    @Override
    public void delete() {
        read(); // Menampilkan daftar film terlebih dahulu
        if (!movieList.isEmpty()) {
            System.out.print("Pilih nomor film yang ingin dihapus: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (index > 0 && index <= movieList.size()) {
                movieList.remove(index - 1);
                System.out.println("Film berhasil dihapus!");
            } else {
                System.out.println("Nomor film tidak valid.");
            }
        }
    }
}
