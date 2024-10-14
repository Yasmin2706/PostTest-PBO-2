# POSTTEST 2 PBO
# Manajemen Film dalam Bioskop

## Nama  : Yasmin Alya Aziza
## NIM   : 2309116036
## Kelas : A2

### Deskripsi Umum
Program manajemen film dalam bioskop ini dikembangkan untuk memenuhi kebutuhan pengelolaan daftar film secara efisien dan terorganisir. Dalam dunia perfilman yang terus berkembang, bioskop dan situs film perlu memiliki sistem yang memungkinkan pengguna untuk menambah, mengedit, menampilkan, dan menghapus film dengan mudah. Dengan program ini, pengguna dapat mengelola informasi film dan genre secara terstruktur, sehingga memudahkan dalam mencari dan menyajikan film kepada penonton. Dengan memisahkan logika ke dalam 3 package (MainBioskop, manajemen_film, dan manajemen_genre), program menjadi lebih terstruktur dan mudah dikelola. Penggunaan method, constructor, percabangan, perulangan, koleksi seperti ArrayList, inheritance, encapsulation, abstraction, interface, dan final keyword berkontribusi pada fungsionalitas dan efisiensi program.

### Komponen Utama
Film dan Genre. Film mewakili informasi dasar tentang judul, tahun rilis, dan sutradara, sedangkan genre berfungsi sebagai kategori yang mengelompokkan film berdasarkan tema atau jenisnya.

### Struktur Program
Struktur program terdiri dari beberapa file yang terorganisir dalam folder (package). Dengan cara ini, kode menjadi lebih terstruktur dan mudah dikelola. Pada manajemen film ini terdapat menu utama untuk menjalankan program dan 3 Package yang berfungsi untuk memisahkan logika yang terkait dengan film. Berikut adalah 3 Package utama:

#### 1. Package MainBioskop
- Package ini berisi kelas utama yang menghubungkan dan mengelola interaksi antara aplikasi dengan pengguna aplikasi.
- Percabangan: Menggunakan struktur switch untuk mengelola berbagai pilihan CRUD (Create, Read, Update, Delete). Misalnya, ketika pengguna memilih untuk menambahkan film baru, program akan menangani input tersebut.
- Perulangan: Menggunakan loop while untuk menjaga program tetap berjalan hingga pengguna memilih untuk keluar. Ini memungkinkan pengguna melakukan beberapa operasi tanpa harus menjalankan program berkali-kali.

##### Kelas: Bioskop
Fungsi: File ini berisi metode main, yang menjadi titik masuk untuk menjalankan program. Ini berfungsi untuk menampilkan menu pilihan kepada pengguna dan menangani interaksi.

##### Metode Utama:
- public static void main(String[] args) : Metode ini menjalankan program utama yang menangani input dari pengguna untuk operasi CRUD yang bisa melakukan looping, yaitu kembali ke menu utama.

#### 2. Package manajemen_film
- Package ini berisi kelas-kelas yang menangani data dan logika terkait film dan juga Interface untuk penerapan CRUD.

##### KELAS:

##### 1. Film
- Abstract: di kelas ini menggunakan kelas abstrak untuk menyederhanakan konsep yang lebih umum, yaitu misalnya Film
- Encapsulation (Getter dan Setter): untuk mengakses dan memodifikasi atribut (properti) dari kelas Film.
- Kelas ini memiliki beberapa properti untuk menyimpan informasi yang relevan untuk film, seperti judul, tahunRilis, sutradara, dan Genre.
- Constructor: Kelas ini memiliki constructor yang menginisialisasi objek Movie dengan nilai-nilai yang diberikan untuk setiap properti saat objek dibuat. Misalnya, saat pengguna menambahkan film baru, constructor akan dipanggil untuk membuat objek Movie.

##### Metode di Kelas Film:
- public abstract void displayInfo()
- Getter: getJudul(), getTahunRilis(), getSutradara(), getJenisGenre()
- Setter: setJudul(), setTahunRilis(), setSutradara(), setJenisGenre()

##### 2. Movie
- Inheritance: di kelas ini membuat subclass dari Film
- Fungsi: merepresentasikan berbagai film di bioskop
- public class Movie extends Film : subclass dari kelas Film

##### Metode di Kelas Movie:
@Override public void displayInfo() : implementasi untuk menampilkan informasi terkait film

##### 3. MovieManager
- MovieManager mengimplementasikan interface CRUDOperations untuk operasi CRUD seperti create, read, update, dan delete.
- Fungsi: Untuk melakukan input dalam proses CRUD
- public class MovieManager implements CRUDOperations

##### Metode di Kelas MovieManager:
- @Override public void create()
- @Override public void read()
- @Override public void update()
- @Override public void delete()

##### 4. ActionMovie
- Inheritance: di kelas ini membuat subclass dari Movie untuk jenis film yang lebih spesifik, yaitu misalnya ActionMovie.
- public final class ActionMovie extends Movie : subclass dari kelas Movie.
- Final Keyword: Kata kunci final diterapkan pada kelas ActionMovie yang menandakan bahwa kelas ini tidak bisa diwarisi. Juga diterapkan pada properti seperti specialEffects di ActionMovie
- Fungsi: merepresentasikan genre film aksi

##### Properti tambahan:
private final String specialEffects; : efek spesial film genre aksi
  
##### Metode di Kelas ActionMovie:
@Override public final void displayInfo() : implementasi untuk menampilkan informasi terkait film dengan genre aksi

##### 5. DramaMovie
- Inheritance: di kelas ini membuat subclass dari Movie untuk jenis film yang lebih spesifik, yaitu misalnya DramaMovie.
- public final class DramaMovie extends Movie : subclass dari kelas Movie.
- Final Keyword: Kata kunci final diterapkan pada kelas DramaMovie yang menandakan bahwa kelas ini tidak bisa diwarisi. Juga diterapkan pada properti seperti emotionalDepth di DramaMovie
- Fungsi: merepresentasikan genre film drama

##### Properti tambahan:
private final String emotionalDepth; : kedalaman emosi dari film genre drama

##### Metode di Kelas DramaMovie:
@Override public final void displayInfo() : implementasi untuk menampilkan informasi terkait film dengan genre drama

##### INTERFACE:
- fungsi: untuk penerapan CRUD, yaitu untuk menambahkan film, melihat film, update film, dan menghapus film di dalam bioskop.
  
#### 3. Package manajemen_genrefilm

##### Kelas: Genre
- Kelas ini mengelola kategori film dan kumpulan film dalam genre tertentu.
- Fungsi: Kelas ini berfungsi untuk menyimpan daftar film yang termasuk dalam genre tersebut.
- Constructor: Kelas ini juga memiliki constructor untuk menginisialisasi objek Genre, termasuk properti untuk menyimpan nama genre, deskripsi, dan daftar film.

### Fitur Utama
1. Menambahkan film baru di bioskop.
2. Menampilkan semua film yang tayang di bioskop.
3. Memperbarui informasi film yang ada.
4. Menghapus film di bioskop.

### Output
1. Menu Utama

   ![Screenshot 2024-09-30 030122](https://github.com/user-attachments/assets/1e7d9ebc-6f82-4ebc-aaa3-72e094d2393c)

2. Pilih Opsi
   1) Opsi 1
      Tambah film

    ![Screenshot 2024-10-14 194136](https://github.com/user-attachments/assets/602163ac-428a-4630-a7d3-8ac7834ba3e5)


      Looping ke menu utama

      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)

   2) Opsi 2
      Tampilkan daftar film

      ![image](https://github.com/user-attachments/assets/d41fb9cb-c693-4931-94f3-c26a30ec14c5)

      Looping ke menu utama
      
      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)
      
   3) Opsi 3
      Hapus film
  
      ![Screenshot 2024-10-14 194411](https://github.com/user-attachments/assets/4d7834af-5db3-4fc1-822b-b73eb525b3bc)


      Looping ke menu utama
      
      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)

      
   5) Opsi 4
      Update film
  
      ![Screenshot 2024-10-14 194516](https://github.com/user-attachments/assets/955c104c-8a1f-4725-830f-d7e24ffc9da0)


      Looping ke menu utama
      
      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)

      
   7) Opsi 5
      Keluar

      ![Screenshot 2024-10-14 194535](https://github.com/user-attachments/assets/2bc068ba-8ec7-4086-b9b4-4a2df37b45b8)

