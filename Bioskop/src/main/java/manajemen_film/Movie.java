package manajemen_film;

public class Movie extends Film {

    public Movie(String judul, int tahunRilis, String sutradara, String jenisGenre) {
        super(judul, tahunRilis, sutradara, jenisGenre);
    }

    @Override
    public void displayInfo() {
        System.out.println("Judul: " + getJudul() + ", Tahun: " + getTahunRilis() + ", Sutradara: " + getSutradara() + ", Genre: " + getJenisGenre());
    }
}