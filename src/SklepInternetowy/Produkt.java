/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SklepInternetowy;

import java.util.Date;

/**
 *
 * Służy do reprezentacji produktu w sklepie.
 * Opisuje jego podstawowe pola.
 */
public class Produkt {
    public int idProduktu;
    public String nazwa;
    public String opis;
    public double cena;
    public Date data;
    int ilosc;
    int formaPlatnosci;
}
