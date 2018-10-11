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
    assertFalse("Les deux lettres du debut et de la fin sont différentes", ChallengeList.commenceFini("AZERTYYTRE"));
  }

  public static void testNonMonotone(){
    assertTrue("Le mot contient des lettres différentes", ChallengeList.nonMonotone("AAAAAARAAAAAA"));
    assertFalse("Le mot contient des lettres identiques", ChallengeList.nonMonotone("AAAAAAAAAAAAA"));
  }

  public static void testTarif(){
    // TODO @B
    assertEquals("C'est gratuit", "gratuit", ChallengeList.tarif(1));
    assertEquals("C'est pour un tarif réduit", "reduit", ChallengeList.tarif(5));
    assertEquals("C'est plein tarif ", "plein", ChallengeList.tarif(15));
    assertEquals("C'est une erreur", "erreur", ChallengeList.tarif(-5));
  }

  public static void testCaGele(){
    assertEquals("Que pensez vous de la température ? ", "Ca caille !", ChallengeList.caGele(4));
    assertEquals("Que pensez vous de la température ? ","Ca gele !", ChallengeList.caGele(-5));
    assertEquals("Que pensez vous de la température ? " , "R.A.S.", ChallengeList.caGele(46));
    assertEquals("Que pensez vous de la température ? ", "Ca bouille !", ChallengeList.caGele(91));
    assertEquals("Que pensez vous de la température ? ", "erreur", ChallengeList.caGele(-274));
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
