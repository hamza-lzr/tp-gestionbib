package library.utils;

/**
 * Classe utilitaire pour héberger des méthodes
 * n'appartenant à aucune autre classe métier (ex: démos).
 */
public class DemoUtils {

    /**
     * Méthode volontairement complexe (pour TP SonarQube / Métriques).
     * Extraite de la classe Book pour améliorer WMC, RFC, et LCOM.
     */
    public static void complexMethodExample(int n) {
        System.out.println("\n--- Running Complexity Demo ---");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else if (i % 3 == 0) {
                System.out.println(i + " divisible by 3");
            } else {
                System.out.println(i + " something else");
            }
        }
    }
}
