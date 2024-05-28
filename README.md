# Zarządzanie książkami

## Spis treści
- [Opis projektu](#opis-projektu)
- [Funkcjonalności](#funkcjonalności)
- [Instrukcja obsługi](#instrukcja-obsługi)
    - [Wymagania](#wymagania)
    - [Uruchomienie aplikacji](#uruchomienie-aplikacji)
    - [Przykładowe użycie](#przykładowe-użycie)

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
- Java Development Kit (JDK) w wersji 8 lub wyższej.
- Środowisko IDE do uruchamiania projektu (np. IntelliJ IDEA, Eclipse) lub możliwość uruchamiania z linii poleceń.

### Uruchomienie aplikacji
1. **Pobierz repozytorium**
    - Sklonuj repozytorium na swój lokalny komputer za pomocą polecenia:
      ```sh
      git clone https://github.com/username/book-management.git
      ```
    - Przejdź do katalogu projektu:
      ```sh
      cd book-management
      ```

2. **Kompilacja projektu**
    - Jeśli używasz IDE, zaimportuj projekt jako projekt Java.
    - Jeśli używasz linii poleceń, przejdź do katalogu `src` i skompiluj projekt:
      ```sh
      javac com/company/*.java
      ```

3. **Uruchomienie aplikacji**
    - Jeśli używasz IDE, uruchom klasę `Main` w pakiecie `com.company`.
    - Jeśli używasz linii poleceń, uruchom aplikację za pomocą polecenia:
      ```sh
      java com.company.Main
      ```

### Przykładowe użycie
Po uruchomieniu aplikacji użytkownik zobaczy menu z następującymi opcjami:
1. Wyszukaj książki z wykorzystaniem wyrażeń regularnych
2. Sortuj książki według różnych kryteriów
3. Dodaj książkę
4. Usuń książkę
5. Wyświetl informacje o książkach
0. Wyjdź

Użytkownik może wprowadzić odpowiedni numer, aby wybrać akcję do wykonania. Na przykład:
- Wybór opcji `3` pozwala na dodanie nowej książki poprzez podanie jej tytułu, autora, roku wydania oraz gatunku.
- Wybór opcji `1` umożliwia filtrowanie książek według wybranego kryterium i wyrażenia regularnego.

## Autorzy
Projekt został stworzony przez [Twoje Imię] w ramach nauki podstaw programowania w języku Java.