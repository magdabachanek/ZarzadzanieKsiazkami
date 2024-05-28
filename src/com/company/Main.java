package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Ksiazka> ksiazki = new ArrayList<>();

        ksiazki.add(new Ksiazka(1, "Pan Tadeusz", "Adam Mickiewicz", 1834, "Epopeja narodowa"));
        ksiazki.add(new Ksiazka(2, "Lalka", "Bolesław Prus", 1890, "Powieść"));
        ksiazki.add(new Ksiazka(3, "Quo Vadis", "Henryk Sienkiewicz", 1896, "Powieść historyczna"));
        ksiazki.add(new Ksiazka(4, "W pustyni i w puszczy", "Henryk Sienkiewicz", 1912, "Przygodowa"));
        ksiazki.add(new Ksiazka(5, "Krzyżacy", "Henryk Sienkiewicz", 1900, "Powieść historyczna"));
        ksiazki.add(new Ksiazka(6, "Ogniem i mieczem", "Henryk Sienkiewicz", 1884, "Powieść historyczna"));
        ksiazki.add(new Ksiazka(7, "Potop", "Henryk Sienkiewicz", 1886, "Powieść historyczna"));
        ksiazki.add(new Ksiazka(8, "Pan Wołodyjowski", "Henryk Sienkiewicz", 1888, "Powieść historyczna"));
        ksiazki.add(new Ksiazka(9, "Zbrodnia i kara", "Fiodor Dostojewski", 1866, "Powieść"));
        ksiazki.add(new Ksiazka(10, "Dziady", "Adam Mickiewicz", 1823, "Dramat"));
        ksiazki.add(new Ksiazka(11, "Chłopi", "Władysław Reymont", 1904, "Powieść"));
        ksiazki.add(new Ksiazka(12, "Faraon", "Bolesław Prus", 1897, "Powieść historyczna"));
        ksiazki.add(new Ksiazka(13, "Kamienie na szaniec", "Aleksander Kamiński", 1943, "Powieść dokumentalna"));
        ksiazki.add(new Ksiazka(14, "Przedwiośnie", "Stefan Żeromski", 1924, "Powieść"));
        ksiazki.add(new Ksiazka(15, "Syzyfowe prace", "Stefan Żeromski", 1897, "Powieść"));
        ksiazki.add(new Ksiazka(16, "Noce i dnie", "Maria Dąbrowska", 1934, "Powieść"));
        ksiazki.add(new Ksiazka(17, "Cudzoziemka", "Maria Kuncewiczowa", 1936, "Powieść"));
        ksiazki.add(new Ksiazka(18, "Nad Niemnem", "Eliza Orzeszkowa", 1888, "Powieść"));
        ksiazki.add(new Ksiazka(19, "Kordian", "Juliusz Słowacki", 1834, "Dramat"));
        ksiazki.add(new Ksiazka(20, "Ludzie bezdomni", "Stefan Żeromski", 1900, "Powieść"));
        ksiazki.add(new Ksiazka(21, "Wesele", "Stanisław Wyspiański", 1901, "Dramat"));
        ksiazki.add(new Ksiazka(22, "Odprawa posłów greckich", "Jan Kochanowski", 1578, "Dramat"));
        ksiazki.add(new Ksiazka(23, "Solaris", "Stanisław Lem", 1961, "Science fiction"));
        ksiazki.add(new Ksiazka(24, "Cyberiada", "Stanisław Lem", 1965, "Science fiction"));
        ksiazki.add(new Ksiazka(25, "Kosmos", "Witold Gombrowicz", 1965, "Powieść"));

        pokazMenu(ksiazki);
    }

    public static void pokazMenu(List<Ksiazka> listaKsiazek) {
        Scanner scanner = new Scanner(System.in);
        int wyborAkcji = -1;

        do {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Wyszukaj książki z wykorzystaniem wyrażeń regularnych");
                System.out.println("2. Sortuj książki według różnych kryteriów");
                System.out.println("3. Dodaj książke");
                System.out.println("4. Usuń książke");
                System.out.println("5. Wyświetl informacje o książkach");
                System.out.println("0. Wyjdź");
                System.out.print("Wybierz opcję: ");
                wyborAkcji = scanner.nextInt();
                scanner.nextLine();

                switch (wyborAkcji) {
                    case 1:
                        System.out.println("Wybrano: Wyszukaj książki z wykorzystaniem wyrażeń regularnych");
                        FiltrujKsiazki filtrujKsiazki = new FiltrujKsiazki();
                        filtrujKsiazki.filtrujPoFrazie(listaKsiazek, scanner);
                        break;
                    case 2:
                        System.out.println("Wybrano: Sortuj książki według różnych kryteriów");
                        SortujKsiazki sortujKsiazki = new SortujKsiazki();
                        sortujKsiazki.sortuj(listaKsiazek,scanner);
                        break;
                    case 3:
                        System.out.println("Wybrano: Dodaj książke");
                        DodajKsiazke dodajKsiazke = new DodajKsiazke();
                        dodajKsiazke.dodajNowyRekord(listaKsiazek, scanner);
                        break;
                    case 4:
                        System.out.println("Wybrano: Usuń książke");
                        UsunKsiazke usunKsiazke = new UsunKsiazke();
                        usunKsiazke.usunWierszPoId(listaKsiazek, scanner);
                        break;
                    case 5:
                        System.out.println("Wybrano: Wyświetl informacje o książkach");
                        WyswietlKsiazki wyswietlKsiazki = new WyswietlKsiazki();
                        wyswietlKsiazki.pokazKsiazki(listaKsiazek);
                        break;
                    case 0:
                        System.out.println("Wyjście z programu");
                        break;
                    default:
                        System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny wybór. Proszę wprowadzić cyfrę od 0 do 5.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
                e.printStackTrace();
            }
        } while (wyborAkcji != 0);

        scanner.close();
    }
}
