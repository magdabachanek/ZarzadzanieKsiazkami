﻿# Zarządzanie książkami

## Spis treści

- [Opis projektu](#opis-projektu)
- [Funkcjonalności](#funkcjonalności)
- [Instrukcja obsługi](#instrukcja-obsługi)
  - [Wymagania](#wymagania)
  - [Uruchomienie aplikacji](#uruchomienie-aplikacji)
  - [Przykładowe użycie](#przykładowe-użycie)
- [Autorzy](#autorzy)

## Opis projektu

Projekt "Zarządzanie książkami" to aplikacja konsolowa w języku Java umożliwiająca zarządzanie kolekcją książek. Użytkownik może dodawać, usuwać, sortować, filtrować oraz wyświetlać książki. Projekt ma na celu demonstrację podstawowych operacji CRUD (Create, Read, Update, Delete) oraz wykorzystania wyrażeń regularnych i sortowania.

## Funkcjonalności

1. **Wyszukiwanie książek z wykorzystaniem wyrażeń regularnych**
   - Użytkownik może filtrować książki według tytułu, autora, roku lub gatunku.
2. **Sortowanie książek według różnych kryteriów**
   - Sortowanie książek według tytułu, autora, roku i gatunku w porządku rosnącym i malejącym.
3. **Dodawanie książek**
   - Użytkownik może dodać nową książkę do kolekcji, podając jej tytuł, autora, rok wydania oraz gatunek.
4. **Usuwanie książek**
   - Użytkownik może usunąć książkę z kolekcji, podając jej identyfikator.
5. **Wyświetlanie informacji o książkach**
   - Wyświetlanie listy wszystkich książek znajdujących się w kolekcji.

## Instrukcja obsługi

### Wymagania

- Java Development Kit (JDK) w wersji 11 lub wyższej.
- IntelliJ IDEA.

### Uruchomienie aplikacji

1. **Pobierz repozytorium**

   - Sklonuj repozytorium na swój lokalny komputer za pomocą polecenia:
     ```sh
     git clone https://github.com/magdabachanek/ZarzadzanieKsiazkami.git
     ```
   - Przejdź do katalogu projektu

2. **Importowanie projektu do IntelliJ IDEA**

   - Otwórz IntelliJ IDEA.
   - Wybierz opcję `Open` lub `Import Project`.
   - Przejdź do katalogu projektu i wybierz go.
   - IntelliJ IDEA automatycznie wykryje pliki projektu i zaimportuje go.

3. **Kompilacja projektu**

   - IntelliJ IDEA automatycznie skompiluje projekt po jego zaimportowaniu.
   - Jeśli kompilacja nie rozpocznie się automatycznie, możesz ręcznie uruchomić kompilację, wybierając `Build` > `Build Project` z menu.

4. **Uruchomienie aplikacji**
   - W panelu `Project` po lewej stronie, przejdź do katalogu `src/com/company`.
   - Znajdź plik `Main.java` i kliknij go prawym przyciskiem myszy.
   - Wybierz opcję `Run 'Main.main()'`.
   - Aplikacja uruchomi się w konsoli w dolnej części okna IntelliJ IDEA.

### Przykładowe użycie

Po uruchomieniu aplikacji użytkownik zobaczy menu z następującymi opcjami:

1. Wyszukaj książki z wykorzystaniem wyrażeń regularnych
2. Sortuj książki według różnych kryteriów
3. Dodaj książkę
4. Usuń książkę
5. Wyświetl informacje o książkach
6. Wyjdź

Użytkownik może wprowadzić odpowiedni numer, aby wybrać akcję do wykonania. Na przykład:

- **Wybór opcji `1`** pozwala na wyszukiwanie książek według wybranego kryterium (tytuł, autor, rok, gatunek) za pomocą wyrażenia regularnego. Użytkownik podaje frazę do filtrowania, a aplikacja wyświetla pasujące książki.

  Po wybraniu tej opcji, użytkownik zostanie poproszony o wybór pola, po którym chce filtrować:

  - Filtrowanie po tytule
  - Filtrowanie po autorze
  - Filtrowanie po roku
  - Filtrowanie po gatunku
  - Wyjście z filtrowania

  Następnie użytkownik podaje wyrażenie regularne, które będzie użyte do filtrowania książek. Aplikacja przeszuka wybrane pole i wyświetli książki, które pasują do podanej frazy.

  Przykład:

  - Użytkownik wybiera opcję `1` z głównego menu.
  - Użytkownik wybiera `1` z opcji filtrowania (Filtrowanie po tytule).
  - Aplikacja prosi o podanie frazy do filtrowania, np. "Tadeusz".
  - Aplikacja wyświetla wszystkie książki, których tytuł zawiera frazę "Tadeusz".

- **Wybór opcji `2`** umożliwia sortowanie książek według różnych kryteriów. Użytkownik wybiera jedno z poniższych kryteriów, a aplikacja wyświetla posortowaną listę książek:

  - Sortowanie po tytule rosnąco
  - Sortowanie po tytule malejąco
  - Sortowanie po autorze rosnąco
  - Sortowanie po autorze malejąco
  - Sortowanie po roku rosnąco
  - Sortowanie po roku malejąco
  - Sortowanie po gatunku rosnąco
  - Sortowanie po gatunku malejąco
  - Wyjście z sortowania

  Przykład:

  - Użytkownik wybiera opcję `2` z głównego menu.
  - Użytkownik wybiera `1` z opcji sortowania (Sortowanie po tytule rosnąco).
  - Aplikacja sortuje książki według tytułu w porządku rosnącym i wyświetla posortowaną listę książek.

- **Wybór opcji `3`** pozwala na dodanie nowej książki do kolekcji. Użytkownik zostanie poproszony o podanie szczegółów książki, takich jak tytuł, autor, rok wydania oraz gatunek. Aplikacja następnie dodaje nową książkę do listy i przypisuje jej unikalny identyfikator.

  Przykład:

  - Użytkownik wybiera opcję `3` z głównego menu.
  - Aplikacja prosi o podanie tytułu książki, np. "Nowa Książka".
  - Aplikacja prosi o podanie autora książki, np. "Nowy Autor".
  - Aplikacja prosi o podanie roku wydania, np. "2023".
  - Aplikacja prosi o podanie gatunku, np. "Fantastyka".
  - Aplikacja dodaje nową książkę do listy z podanymi szczegółami i przypisuje jej nowy identyfikator.

- **Wybór opcji `4`** umożliwia usunięcie książki z kolekcji. Użytkownik zostanie poproszony o podanie identyfikatora książki, którą chce usunąć. Aplikacja następnie usuwa książkę z listy i aktualizuje identyfikatory pozostałych książek, aby były unikalne i ciągłe.

  Przykład:

  - Użytkownik wybiera opcję `4` z głównego menu.
  - Aplikacja prosi o podanie identyfikatora książki do usunięcia, np. "3".
  - Aplikacja usuwa książkę o identyfikatorze 3 z listy.
  - Aplikacja aktualizuje identyfikatory pozostałych książek, aby były ciągłe.

- **Wybór opcji `5`** wyświetla listę wszystkich książek znajdujących się w kolekcji. Aplikacja iteruje przez listę książek i wyświetla szczegóły każdej z nich, w tym identyfikator, tytuł, autora, rok wydania oraz gatunek.

  Przykład:

  - Użytkownik wybiera opcję `5` z głównego menu.
  - Aplikacja wyświetla listę wszystkich książek w kolekcji, np.:
    ```
    Ksiazka{id=1, tytul='Pan Tadeusz', autor='Adam Mickiewicz', rok=1834, gatunek='Epopeja narodowa'}
    Ksiazka{id=2, tytul='Lalka', autor='Bolesław Prus', rok=1890, gatunek='Powieść'}
    ...
    ```

- **Wybór opcji `0`** kończy działanie programu.

## Autorzy

Projekt został stworzony przez Magdalena Bachanek w ramach nauki podstaw programowania w języku Java.
