/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vitorrural.trabalho2;

/**
 *
 * @author USUARIO
 */
public class Trabalho2 {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();
        
        System.out.println("Testando expressões do vídeo 13.");
        System.out.println("Comprimento múltiplo de 4.(Alfabeto ab)\n");
     ER.confere(ER.EXPRESSAO1_VIDEO, "baaa"); 
     ER.confere(ER.EXPRESSAO1_VIDEO, "");  // pode ter sentença vazia?
     ER.confere(ER.EXPRESSAO1_VIDEO, "ababababa"); // rejeitada
        System.out.println("\nQuantidade par de a's\n");
     ER.confere(ER.EXPRESSAO2_VIDEO, "abbbbbbbbbbbba"); 
     ER.confere(ER.EXPRESSAO2_VIDEO, "baaabbaa"); // rejeitada
        

        System.out.println("\nTestando assinatura\n");
    ER.confere(ER.ASSINATURA_FUNCAO, "void funcao1(int a, float b)"); 
    ER.confere(ER.ASSINATURA_FUNCAO, "String funcao2()"); 
    ER.confere(ER.ASSINATURA_FUNCAO, "void funcao(int a)");
    ER.confere(ER.ASSINATURA_FUNCAO, "void ()"); // Rejeitada
    ER.confere(ER.ASSINATURA_FUNCAO, "String funcao2"); 
    

    // Teste parâmetros de função
    System.out.println("\nTestando esse trem de parmetros\n:");
    ER.confere(ER.PARAMETROS_FUNCAO, "(int a, float b)");
    ER.confere(ER.PARAMETROS_FUNCAO, "(float media, String nome)");
    ER.confere(ER.PARAMETROS_FUNCAO, "()");
    ER.confere(ER.PARAMETROS_FUNCAO, "(float)"); // Rejeitada

    // Teste condicionais
    System.out.println("\nTestando condicional:");
    ER.confere(ER.CONDICIONAL_IF, "if(ano < 1990)");
    ER.confere(ER.CONDICIONAL_IF, "if(3*a != 4+t)"); //Rejeitada

    // Teste expressões matemáticas
    System.out.println("\nTestando expressao:");
    ER.confere(ER.EXPRESSAO_MATHEMATICA, "3 +_ (media/3) - x*3.75");
    ER.confere(ER.EXPRESSAO_MATHEMATICA, "-4 + beta * media[1].x * soma(a,b)/4 * vetor[5].idade");
     ER.confere(ER.EXPRESSAO_MATHEMATICA, "+");
        //Teste 0, tres ou mais : TRES_OU_MAIS
        // ER.confere(ER.TRES_OU_MAIS, "011");

        //Teste 1, aa bb subpalavras: PALAVRA_AA_BB
        // ER.confere(ER.PALAVRA_AA_BB, "aabba");

        //Teste 3, aceitar exponencial: REAL
        // ER.confere(ER.REAL, "-123.908777E+30");

        //Teste 1, expressão regular: DIGITOS
        //ER.confere(ER.DIGITOS, "000511200021");

        //Teste 2, expressão regular: DIGITOS
        //ER.confere(ER.DIGITOS, "000511200021ADAF");
        
        //Teste 3, expressão regular: LETRAS
        //ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf");

        //Teste 4, expressão regular: LETRAS
        //ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf4565");
                
        //Teste 5, expressão regular: IDENT (nome de variável, função e classes)
        //ER.confere(ER.IDENT, "Altura1");

        //Teste 6, expressão regular: IDENT (nome de variável, função e classes)
        //ER.confere(ER.IDENT, "1Altura");
                
        
        //Teste 7, expressão regular: REAL
        //ER.confere(ER.REAL, "123.908777E+30");
        
        //Teste 8, expressão regular: REAL
        //ER.confere(ER.REAL, "0.17E-5");
        
        //Teste 9, expressão regular: ATRIBUICAO
        //ER.confere(ER.ATRIBUICAO, "media=-123.908777E+30");
        
        //ER.confere(ER.INTEIRO, "10");              
    }
}
