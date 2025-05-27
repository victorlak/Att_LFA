/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vitorrural.att_lfa;

/**
 *
 * @author USUARIO
 */
public class Att_LFA {

    public static void main(String[] args) {
        ExpressaoRegular expressao = new ExpressaoRegular();
         //CASO ACEITO E NÃO ACEITO DE CADA QUESTÃO!
         
         //PALAVRAS COM NO MINIMO 3 DIGITOS
        expressao.confere(expressao.LINGUAGEM1, "100");
        expressao.confere(expressao.LINGUAGEM1, "10");

        //PALAVRAS COM AA OU BB
        expressao.confere(expressao.LINGUAGEM2, "aaaaaaaaa");
        expressao.confere(expressao.LINGUAGEM2, "baba");

        //PALAVRAS(VALOR REAL)
        expressao.confere(expressao.REAL, "-123.456E-78");
        expressao.confere(expressao.REAL, "1.2.3.4.5");
    }
}
