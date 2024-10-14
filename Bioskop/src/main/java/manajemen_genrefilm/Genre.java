package manajemen_genrefilm;

import java.util.ArrayList;
import manajemen_film.Movie;

public final class Genre {
    private String jenisGenre;
    private String deskripsi;
    private static int movieCount;
    public ArrayList<Movie> movieList;
    
    public Genre(String jenisGenre, String deskripsi) {
        this.jenisGenre = jenisGenre;
        this.deskripsi = deskripsi;
        this.movieList = new ArrayList<>();
    }
    
    public String getJenisGenre() {
        return jenisGenre;
    }
    
    public void setJenisGenre(String jenisGenre) {
        this.jenisGenre = jenisGenre;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public static int getMovieCount() {
        return movieCount;
    }
    
    public void addMovie(Movie movie) {
        movieList.add(movie);
        movieCount++;
    }
    
    public void removeMovie(Movie movie) {
        movieList.remove(movie);
        movieCount--;
    }
    
    public void displayMovies() {
        System.out.println("Genre: " + jenisGenre + " (" + deskripsi + ")");
        System.out.println("Daftar Film:");
        for (Movie movie : movieList) {
            movie.displayInfo();
        }
    }
}
