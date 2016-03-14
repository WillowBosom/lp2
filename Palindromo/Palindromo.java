/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromo;

/** YOOOOO, programa feito no NetBeans pq NetBeans > abismo > eclipse
 *							VLW FLW
 ~mentira, eu acabei fazendo no Kate, que 'e o bloco de notas do Mint KDE. Mas Kate > abismo > eclipse~
 * @author caio lopes
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No exerc'icio proposto, o tamanho seria 5, mas aqui h'a a possibilidade de escolher o tamanho
        int tamanho = 5;
        String entrada = args[0];
        String pal="";
        int Tentrada = entrada.leght();
        int qtdTest = Tentrada - entrada;
        boolean tranquilofavoravel = false;
        for(int i=0; i<=qtdTest; i++){
	   pal = entrada.substring(i, i + tamanho);
	   StringBuffer inverte = new StringBuffer(pal);
	   inverte.reverse();
	   String inv = inverte.toString();
	   if(pal.equals(inv)){
	      System.out.println("BELUGA! Tem um palindromo aqui, e ele 'e: " + pal);
	      System.out.println("Posiç~ao:" + (i+1) + "-" + (i+tamanho));
	      tranquilofavoravel = true;
	   }
	   if(tranquilofavoravel==false){
	      System.out.println("BELUGA! N TEM PALINDROM");
	   }
        }
    }

}
