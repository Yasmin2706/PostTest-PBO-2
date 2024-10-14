package manajemen_film;

public final class ActionMovie extends Movie {

    private final String specialEffects; // Properti tambahan yang spesifik untuk ActionMovie

    public ActionMovie(String judul, int tahunRilis, String sutradara, String jenisGenre) {
        super(judul, tahunRilis, sutradara, jenisGenre);
        this.specialEffects = "High Octane"; // Misalnya, semua film aksi memiliki efek spesial
    }

    public String getSpecialEffects() {
        return specialEffects;
    }

    @Override
    public final void displayInfo() {
        super.displayInfo();
        System.out.println("Special Effects: " + specialEffects);
    }
}