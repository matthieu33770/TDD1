import java.util.Arrays;

public class ChallengeListTest{

  /**
  * Les tests sont à écrire ici.
  * Il peut y avoir plusieurs assert pour chaque methode testée.
  */


  public static void testMoyenne(){
    // TODO @Matthieu Test
    assertEquals("Calcul de la moyenne", 11, ChallengeList.moyenne(10,12));
  }

  public static void testPerimetreCarre(){
  assertEquals("test le perimetre", 16, ChallengeList.perimetreCarre(4));
  }

  public static void testCommenceFini(){
    // TODO @B
    //ChallengeList.commenceFini("AZERTYYTREAZ");
    assertTrue("Les deux lettres du debut et de la fin sont identiques", ChallengeList.commenceFini("AZERTYYTREAZ"));
  }

  public static void testNonMonotone(){
    assertTrue("Le mot contient des lettres différentes", ChallengeList.nonMonotone("AAAAAARAAAAAA"));
  }

  public static void testTarif(){
    // TODO @B
    assertEquals("C'est pour un tarif réduit", "reduit", ChallengeList.tarif(5));
  }

  public static void testCaGele(){
    assertTrue("Que pensez vous de la température ? ", ChallengeList.caGele(90));
  }

  public static void testFiltreShort(){
    // TODO @B
  }

  public static void testFiltreLetter(){
    // TODO @A
  }


  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }

  public static void assertEquals(String message, String[] expected, String[] res){
   if (java.util.Arrays.deepEquals(expected, res)) {
     System.out.println("\nOK >> "+message);
   }
   else {
     throw new Error("\nKO!! >> "+message+" (exp : "+Arrays.toString(expected)+", res : "+Arrays.toString(res)+")");
   }
 }

 public static void assertEquals(String message, String expected, String res){
   if (res.equals(expected)) {
     System.out.println("\nOK >> "+message);
   }
   else {
     throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
   }
 }

 public static void assertEquals(String message, double expected, double res){
   if (Math.abs(expected-res) < 0.0001) {
     System.out.println("\nOK >> "+message);
   }
   else {
     throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
   }
 }

 public static void assertEquals(String message, int expected, int res){
   if (expected == res) {
     System.out.println("\nOK >> "+message);
   }
   else {
     throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
   }
 }

 public static void assertTrue(String message, boolean res){
   if (res) {
     System.out.println("\nOK >> "+message);
   }
   else {
     throw new Error("\nKO!! >> "+message+" (res : "+res+")");
   }
 }

 public static void assertFalse(String message, boolean res){
   assertTrue(message, !res);
 }
}
