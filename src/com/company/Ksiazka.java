package com.company;


public class Ksiazka {

  private int id;
  private String tytul;
  private String autor;
  private int rok;
  private String gatunek;

  public Ksiazka(int id, String tytul, String autor, int rok, String gatunek) {
    this.id = id;
    this.tytul = tytul;
    this.autor = autor;
    this.rok = rok;
    this.gatunek = gatunek;
  }

  public int getId() {
    return id;
  }

  public String getTytul() {
    return tytul;
  }

  public String getAutor() {
    return autor;
  }

  public int getRok() {
    return rok;
  }

  public String getGatunek() {
    return gatunek;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Ksiazka{" +
        "id=" + id +
        ", tytul='" + tytul + '\'' +
        ", autor='" + autor + '\'' +
        ", rok=" + rok +
        ", gatunek='" + gatunek + '\'' +
        '}';
  }
}
