package com.company;


import java.util.List;

class WyswietlKsiazki {

  public void pokazKsiazki(List<Ksiazka> ksiazki) {
    for (Ksiazka ksiazka : ksiazki) {
      System.out.println(ksiazka);
    }
  }

}
