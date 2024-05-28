package com.company;

import java.util.List;
import java.util.Scanner;

public class UsunKsiazke {

  public void usunWierszPoId(List<Ksiazka> ksiazki, Scanner scanner) {
    System.out.print("Podaj identyfikator książki do usunięcia: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    usun(ksiazki, id);
  }

  private void usun(List<Ksiazka> ksiazki, int id) {
    for (int i = 0; i < ksiazki.size(); i++) {
      if (ksiazki.get(i).getId() == id) {
        ksiazki.remove(i);
        break;
      }
    }

    int noweId = 1;
    for (Ksiazka ksiazka : ksiazki) {
      ksiazka.setId(noweId++);
    }
  }

}

