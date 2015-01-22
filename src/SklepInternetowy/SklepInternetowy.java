/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SklepInternetowy;

import java.util.Vector;

/**
 *
 * Interfejs służy do stworzenia systemu sklepu internetowego i jego obsługi.
 */
public interface SklepInternetowy {
    /**
     * Przechowuje wszystkich użytkowników systemu.
     */
    Vector<Uzytkownik> uzytkownicy = new Vector();
    
    /**
     * Przechowuje wszystkie produkty w systemie, dodane przez administratora.
     */
    Vector<Produkt> produktyUzytkownika = new Vector();
    
    
    /**
     * Dodaje uzytkownika
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean dodajUzytkownika();
    /**
     * Edytuje uzytkownika
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean edytujUzytkownika();
    /**
     * Usuwa uzytkownika
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean usunUzytkownika();
    
    /**
     * Dodaje produkt do sklepu.
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean dodajProdukt();
    /** 
     * Usuwa produkt ze sklepu
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean usunProdukt();
    /**
     * Edytuje produkt w sklepie.
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean edytujProdukt();

    /**
     * Służy do kupienia produktu, kiedy użytkownik jest zalogowany.
     * @param sesja Sesja użytkownika
     * @param idProduktu ID produktu, który chcemy kupić
     * @return True dla sukcesu, jesli nie false.
     */
    public boolean kupProdukt(SesjaUzytkownika sesja, int idProduktu);    
    
}
