package manajemen_film;

public abstract class Film {
    private String judul;
    private int tahunRilis;
    private String sutradara;
    private String jenisGenre;

    public Film(String judul, int tahunRilis, String sutradara, String jenisGenre) {
        this.judul = judul;
        this.tahunRilis = tahunRilis;
        this.sutradara = sutradara;
        this.jenisGenre = jenisGenre;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getJenisGenre() {
        return jenisGenre;
    }

    public void setJenisGenre(String jenisGenre) {
        this.jenisGenre = jenisGenre;
    }

    public abstract void displayInfo();
}