/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Anime {
    private String judul;
    private String genre;
    private String status;

    // Constructor
    public Anime(String judul, String genre, String status) {
        this.judul = judul;
        this.genre = genre;
        this.status = status;
    }

    // Getter & Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Untuk menampilkan data dengan rapi
    @Override
    public String toString() {
        return judul + " | Genre: " + genre + " | Status: " + status;
    }
}
