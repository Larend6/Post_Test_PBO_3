# Post Test PBO 2

Narendra Augusta Srianandha | 2409116010 | SI A'24

## 📌 Deskripsi Program

**Anime Management Project** adalah aplikasi Java CLI sederhana untuk mengelola data anime.
Program ini menggunakan konsep **Object-Oriented Programming (OOP)** dengan implementasi **inheritance**, **polymorphism**, dan **encapsulation**.
Pengguna dapat menambahkan anime dengan format **Movie** maupun **Series**, lalu menampilkannya dalam daftar.

---

## 🗂️ Struktur Project

```
├── Main.java          # Entry point program
├── Anime.java         # Class induk (Model) berisi atribut umum anime
├── MovieAnime.java    # Subclass untuk anime berformat Movie
├── SeriesAnime.java   # Subclass untuk anime berformat Series
└── AnimeService.java  # Service class untuk mengelola daftar anime
```

### Penjelasan Singkat

* **Main.java** → Menjalankan program, membuat objek, dan menampilkan output.
* **Anime.java** → Model utama, menyimpan atribut `judul`, `genre`, `status`.
* **MovieAnime.java** → Subclass dari `Anime`, menambahkan atribut `durasi`.
* **SeriesAnime.java** → Subclass dari `Anime`, menambahkan atribut `episode`.
* **AnimeService.java** → Menyimpan daftar anime dengan `ArrayList` dan menyediakan method untuk menambahkan & menampilkan data.

---

## 🔄 Alur Program

1. **Menambahkan Anime (Movie & Series)**

   * Objek `MovieAnime` dan `SeriesAnime` dibuat di `Main.java`.
   * Data dimasukkan ke dalam `AnimeService`.

   ✅ Contoh kode di `Main.java`:

   ```java
   AnimeService service = new AnimeService();

   service.addAnime(new MovieAnime("One Piece Film: Red", "Action", 2022, 115));
   service.addAnime(new SeriesAnime("Attack on Titan", "Action/Fantasy", 2013, 87));
   ```

---

2. **Menyimpan Data**

   * Data anime tersimpan dalam `ArrayList<Anime>` di `AnimeService`.
   * Memanfaatkan **polymorphism**, sehingga `MovieAnime` dan `SeriesAnime` bisa disimpan dalam satu list karena keduanya adalah turunan dari `Anime`.

---

3. **Menampilkan Daftar Anime**

   * Method `printAllAnime()` dipanggil untuk menampilkan seluruh data.
   * Masing-masing subclass (`MovieAnime`, `SeriesAnime`) melakukan **override** method `toString()` untuk menampilkan data sesuai formatnya.

   ✅ Output:

   ```
   === Daftar Anime ===
    1. Kimi no Nawa | Genre: Drama | Status: Completed | Durasi: 120 menit (Movie)
    2. Evangelion | Genre: Thriller | Status: Completed | Episode: 12 (Series)
   ```

---

4. **Keluar Program**

   * Program berhenti setelah menampilkan output.

---

## 📖 Contoh Output Lengkap



---

## 💡 Konsep OOP yang Digunakan

* **Inheritance** → `MovieAnime` dan `SeriesAnime` mewarisi class `Anime`.
* **Polymorphism** → `toString()` di-override agar setiap subclass menampilkan data berbeda.
* **Encapsulation** → Atribut diset `private` dengan akses melalui getter & setter.
* **Service Class** → `AnimeService` bertugas mengelola data agar lebih terstruktur.

---

👨‍💻 Dibuat untuk memenuhi tugas Post Test PBO 2.
