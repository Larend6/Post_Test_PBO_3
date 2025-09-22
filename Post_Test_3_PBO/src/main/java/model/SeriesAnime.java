/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class SeriesAnime extends Anime {
    private int episodeCount;

    public SeriesAnime(String judul, String genre, String status, int episodeCount) {
        super(judul, genre, status);
        this.episodeCount = episodeCount;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    @Override
    public String toString() {
        return super.toString() + " | Episode: " + episodeCount + " (Series)";
    }
}