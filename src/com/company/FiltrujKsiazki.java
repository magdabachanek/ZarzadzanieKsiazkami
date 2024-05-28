package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FiltrujKsiazki {


  public void filtrujPoFrazie(List<Ksiazka> ksiazki, Scanner scanner) {
    WyswietlKsiazki wyswietlKsiazki = new WyswietlKsiazki();

    System.out.println("Wybierz opcję filtrowania:");
    System.out.println("1. Filtrowanie po tytule");
    System.out.println("2. Filtrowanie po autorze");
    System.out.println("3. Filtrowanie po roku");
    System.out.println("4. Filtrowanie po gatunku");
    System.out.println("0. Wyjście z filtrowania");

    int wybranyNumer = scanner.nextInt();
    scanner.nextLine();

    switch (wybranyNumer) {
      case 1:
        System.out.print("Podaj frazę do filtrowania po tytule: ");
        String tytulRegex = scanner.nextLine();
        List<Ksiazka> filtrujPoTytule = filtrujWedlugTytulu(ksiazki, tytulRegex);
        System.out.println("Wynik filtrowania po tytule:");
        wyswietlKsiazki.pokazKsiazki(filtrujPoTytule);
        break;
      case 2:
        System.out.print("Podaj frazę do filtrowania po autorze: ");
        String autorRegex = scanner.nextLine();
        List<Ksiazka> filtrujPoAutorze = filtrujWedlugAutora(ksiazki, autorRegex);
        System.out.println("Wynik filtrowania po autorze:");
        wyswietlKsiazki.pokazKsiazki(filtrujPoAutorze);
        break;
      case 3:
        System.out.print("Podaj frazę do filtrowania po roku: ");
        String rokRegex = scanner.nextLine();
        List<Ksiazka> filtrujPoRoku = filtrujWedlugRoku(ksiazki, rokRegex);
        System.out.println("Wynik filtrowania po roku:");
        wyswietlKsiazki.pokazKsiazki(filtrujPoRoku);
        break;
      case 4:
        System.out.print("Podaj frazę do filtrowania po gatunku: ");
        String gatunekRegex = scanner.nextLine();
        List<Ksiazka> filtrujPoGatunku = filtrujWedlugGatunku(ksiazki, gatunekRegex);
        System.out.println("Wynik filtrowania po gatunku:");
        wyswietlKsiazki.pokazKsiazki(filtrujPoGatunku);
        break;
      case 0:
        System.out.println("Wyjście z filtrowania");
        break;
      default:
        System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
        break;
    }
  }

  private List<Ksiazka> filtrujWedlugTytulu(List<Ksiazka> ksiazki, String regex) {
    List<Ksiazka> wynik = new ArrayList<>();
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    for (Ksiazka ksiazka : ksiazki) {
      Matcher matcher = pattern.matcher(ksiazka.getTytul());
      if (matcher.find()) {
        wynik.add(ksiazka);
      }
    }

    return wynik;
  }

  private List<Ksiazka> filtrujWedlugAutora(List<Ksiazka> ksiazki, String regex) {
    List<Ksiazka> wynik = new ArrayList<>();
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    for (Ksiazka ksiazka : ksiazki) {
      Matcher matcher = pattern.matcher(ksiazka.getAutor());
      if (matcher.find()) {
        wynik.add(ksiazka);
      }
    }

    return wynik;
  }

  private List<Ksiazka> filtrujWedlugRoku(List<Ksiazka> ksiazki, String regex) {
    List<Ksiazka> wynik = new ArrayList<>();
    Pattern pattern = Pattern.compile(regex);

    for (Ksiazka ksiazka : ksiazki) {
      Matcher matcher = pattern.matcher(String.valueOf(ksiazka.getRok()));
      if (matcher.find()) {
        wynik.add(ksiazka);
      }
    }

    return wynik;
  }

  private List<Ksiazka> filtrujWedlugGatunku(List<Ksiazka> ksiazki, String regex) {
    List<Ksiazka> wynik = new ArrayList<>();
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    for (Ksiazka ksiazka : ksiazki) {
      Matcher matcher = pattern.matcher(ksiazka.getGatunek());
      if (matcher.find()) {
        wynik.add(ksiazka);
      }
    }

    return wynik;
  }

}
