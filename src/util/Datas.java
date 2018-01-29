/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.time.LocalDate;
import negocio.excecoes.DataInvalidaException;

/**
 *
 * @author Yuri
 */
public class Datas {
    public static LocalDate getData(String data) throws DataInvalidaException{
        LocalDate nova;
        String s1 = "";
        char[] s = data.toCharArray();
        int dia, mes, ano;
        
        if(s.length != 10 )
            throw new DataInvalidaException();        
        
        s1 += s[0];
        s1 += s[1];
        dia = Integer.parseInt(String.valueOf(s1));
        
        s1 ="";
        s1 += s[3];
        s1 += s[4];
        mes = Integer.parseInt(s1);
        
        s1 ="";
        s1 += s[6];
        s1 += s[7];
        s1 += s[8];
        s1 += s[9];
        ano = Integer.parseInt(String.valueOf(s1));
        
        
        
        nova = LocalDate.of(ano, mes, dia);
        
        if(nova == null)
            throw new DataInvalidaException();
        
        return nova;
    }
}
