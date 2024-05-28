package com.company;

import java.util.List;
import java.util.Scanner;

public class DodajKsiazke {

   public void dodajNowyRekord(List<Ksiazka> ksiazki, Scanner scanner) {
    System.out.print("Podaj tytul: ");
    String tytul = scanner.nextLine();

    System.out.print("Podaj autora: ");
    String autor = scanner.nextLine();

    System.out.print("Podaj rok: ");
    int rok = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Podaj gatunek: ");
    String gatunek = scanner.nextLine();

    dodaj(ksiazki, tytul, autor, rok, gatunek);
  }

  private void dodaj(List<Ksiazka> ksiazki, String tytul, String autor, int rok, String gatunek) {
    ksiazki.add(new Ksiazka(ksiazki.size() + 1, tytul, autor, rok, gatunek));
  }

}
