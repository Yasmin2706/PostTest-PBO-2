package manajemen_film;

public final class DramaMovie extends Movie {

    private final String emotionalDepth; // Properti tambahan yang spesifik untuk DramaMovie

    public DramaMovie(String judul, int tahunRilis, String sutradara, String jenisGenre) {
        super(judul, tahunRilis, sutradara, jenisGenre);
        this.emotionalDepth = "Very High"; // Misalnya, semua film drama memiliki kedalaman emosional
    }

    public String getEmotionalDepth() {
        return emotionalDepth;
    }

    @Override
    public final void displayInfo() {
        super.displayInfo();
        System.out.println("Emotional Depth: " + emotionalDepth);
    }
}