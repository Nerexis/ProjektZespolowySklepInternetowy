/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SklepInternetowy;

import java.util.Date;

/**
 *
 * Służy do reprezentacji sesji zalogowanego uzytkownika
 */
public interface SesjaUzytkownika {
    public int idSesji = 0;
    public int idUzytkownika = 0;
    public Date dataWygasniecia = new Date();
    /**
     * Wylogowuje użytkownika
     */
    public void wyloguj();
    
}
