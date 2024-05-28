package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortujKsiazki {

  public void sortuj(List<Ksiazka> ksiazki, Scanner scanner) {
    System.out.println("Wybierz opcję sortowania:");
    System.out.println("1. Sortowanie po tytule rosnąco");
    System.out.println("2. Sortowanie po tytule malejąco");
    System.out.println("3. Sortowanie po autorze rosnąco");
    System.out.println("4. Sortowanie po autorze malejąco");
    System.out.println("5. Sortowanie po roku rosnąco");
    System.out.println("6. Sortowanie po roku malejąco");
    System.out.println("7. Sortowanie po gatunku rosnąco");
    System.out.println("8. Sortowanie po gatunku malejąco");
    System.out.println("0. Wyjście z sortowania");

    int choice = scanner.nextInt();
    scanner.nextLine();

    WyswietlKsiazki wyswietlKsiazki = new WyswietlKsiazki();

    switch (choice) {
      case 1:
        System.out.println("Posortowano po tytule rosnąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugTytuluRosnaco(ksiazki));
        break;
      case 2:
        System.out.println("Posortowano po tytule malejąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugTytuluMalejaco(ksiazki));
        break;
      case 3:
        System.out.println("Posortowano po autorze rosnąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugAutoraRosnaco(ksiazki));
        break;
      case 4:
        System.out.println("Posortowano po autorze malejąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugAutoraMalejaco(ksiazki));
        break;
      case 5:
        System.out.println("Posortowano po roku rosnąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugRokuRosnaco(ksiazki));
        break;
      case 6:
        System.out.println("Posortowano po roku malejąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugRokuMalejaco(ksiazki));
        break;
      case 7:
        System.out.println("Posortowano po gatunku rosnąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugGatunkuRosnaco(ksiazki));
        break;
      case 8:
        System.out.println("Posortowano po gatunku malejąco:");
        wyswietlKsiazki.pokazKsiazki(sortujWedlugGatunkuMalejaco(ksiazki));
        break;
      case 0:
        System.out.println("Wyjście z sortowania");
        return;
      default:
        System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
        break;
    }
  }

  private List<Ksiazka> sortujWedlugTytuluRosnaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparing(Ksiazka::getTytul));
    return kopia;
  }

  private List<Ksiazka> sortujWedlugTytuluMalejaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparing(Ksiazka::getTytul).reversed());
    return kopia;
  }

  private List<Ksiazka> sortujWedlugAutoraRosnaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparing(Ksiazka::getAutor));
    return kopia;
  }

  private List<Ksiazka> sortujWedlugAutoraMalejaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparing(Ksiazka::getAutor).reversed());
    return kopia;
  }

  private List<Ksiazka> sortujWedlugRokuRosnaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparingInt(Ksiazka::getRok));
    return kopia;
  }

  private List<Ksiazka> sortujWedlugRokuMalejaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparingInt(Ksiazka::getRok).reversed());
    return kopia;
  }

  private List<Ksiazka> sortujWedlugGatunkuRosnaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparing(Ksiazka::getGatunek));
    return kopia;
  }

  private List<Ksiazka> sortujWedlugGatunkuMalejaco(List<Ksiazka> ksiazki) {
    List<Ksiazka> kopia = new ArrayList<>(ksiazki);
    kopia.sort(Comparator.comparing(Ksiazka::getGatunek).reversed());
    return kopia;
  }

}

