# Post Test PBO 3

Narendra Augusta Srianandha | 2409116010 | SI A'24

## 📌 Deskripsi Program

**AnimeStream.ID** adalah aplikasi Java CLI sederhana untuk mengelola data anime. Program ini menggunakan konsep **Object-Oriented Programming (OOP)** dengan implementasi **inheritance**, **polymorphism**, dan **encapsulation**. Pengguna dapat menambahkan anime dengan format **Movie** maupun **Series**, lalu menampilkannya dalam daftar.

---

## 🗂️ Struktur Project

<img width="405" height="271" alt="image" src="https://github.com/user-attachments/assets/33ef7a58-aa45-45b7-b41d-0fa9be8fb7c6" />

### Penjelasan Singkat

* **Main.java** → Menjalankan program, membuat objek, dan menampilkan output.
* **Anime.java** → Model utama, menyimpan atribut `judul`, `genre`, `status`, Superclass dari para Subclass.
* **MovieAnime.java** → Subclass dari `Anime`, menambahkan atribut `durasi`.
* **SeriesAnime.java** → Subclass dari `Anime`, menambahkan atribut `episode`.
* **AnimeService.java** → Menyimpan daftar anime dengan `ArrayList` dan menyediakan method untuk menambahkan & menampilkan data.

---

## 🔄 Alur Program

1. **Menu Utama**  
   Setelah program dijalankan, pengguna akan melihat menu utama dengan pilihan: Tambah, Lihat, Ubah, Hapus, Cari, dan Keluar.  
   <img width="319" height="186" alt="Screenshot 2025-09-22 231732" src="https://github.com/user-attachments/assets/b3914d84-8b09-419b-ad75-285f798e16ec" />


---

2. **Tambah Anime**  
   - Pengguna memasukkan jenis (subclass), judul, genre, dan status anime  
   - Program melakukan **validasi input** agar tidak kosong dan sesuai format  
   - Data yang valid akan disimpan ke dalam `ArrayList`  
   - Output:  
   <img width="535" height="368" alt="Screenshot 2025-09-22 231752" src="https://github.com/user-attachments/assets/626032a4-eed7-48be-a920-3a3163d14146" />


---

3. **Lihat Daftar Anime**  
   - Menampilkan daftar anime yang sudah tersimpan dengan nomor urut  
   - Jika daftar kosong, muncul pesan "Belum ada anime dalam daftar"  
   <img width="1047" height="365" alt="Screenshot 2025-09-22 231919" src="https://github.com/user-attachments/assets/12eb5c38-4676-45bd-8c08-5207e3e05b9e" />

   <img width="418" height="237" alt="image" src="https://github.com/user-attachments/assets/4a56bebb-0d93-476d-9ea1-4d9a77e34e9c" />

---

4. **Ubah Data Anime**  
   - Pengguna memilih nomor anime yang ingin diubah  
   - Bisa mengubah judul, genre, atau status (boleh sebagian atau semua)  
   - Output:  
   <img width="1038" height="285" alt="Screenshot 2025-09-22 232001" src="https://github.com/user-attachments/assets/cf639490-4a56-40dc-8f3c-ff900eeede19" />
 
   <img width="1034" height="373" alt="Screenshot 2025-09-22 232013" src="https://github.com/user-attachments/assets/4578e5bd-6044-48ea-8918-a8c4788f3aa4" />

---

5. **Hapus Data Anime**  
   - Pengguna memilih nomor anime yang ingin dihapus  
   - Data langsung dihapus dari daftar  
   - Output:  
   <img width="1031" height="410" alt="Screenshot 2025-09-22 232026" src="https://github.com/user-attachments/assets/66245958-d43a-4fa6-b0b4-8619ff83fe88" />
  
   <img width="1029" height="171" alt="Screenshot 2025-09-22 232035" src="https://github.com/user-attachments/assets/3d3b2a48-2b37-4a26-9913-c343a4b7172b" />
   
---

6. **Cari Anime**  
   - Pengguna memasukkan kata kunci  
   - Program akan menampilkan daftar anime yang cocok dengan pencarian judul  
   - Output:  
   <img width="877" height="261" alt="Screenshot 2025-09-22 232046" src="https://github.com/user-attachments/assets/3774fc18-2676-4b77-b0f8-27abd7f677e6" />
   
---

7. **Keluar Program**  
   - Program berhenti dan menampilkan pesan perpisahan  
   <img width="773" height="227" alt="Screenshot 2025-09-22 232104" src="https://github.com/user-attachments/assets/6fdb95af-41b2-403b-9a30-a7c3cbd8c129" />

---

## 💡 Konsep OOP yang Digunakan

* **Inheritance** → `MovieAnime` dan `SeriesAnime` mewarisi class `Anime`.
* **Polymorphism** → `toString()` di-override agar setiap subclass menampilkan data berbeda.
* **Encapsulation** → Atribut diset `private` dengan akses melalui getter & setter.
* **Service Class** → `AnimeService` bertugas mengelola data agar lebih terstruktur.

---

👨‍💻 Dibuat untuk memenuhi tugas Post Test PBO 3.
