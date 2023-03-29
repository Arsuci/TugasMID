/* Arsuci Fidyawati
 * 13020210297
 */
package testerr20297;

public class TestErr20297 {
    public static void main(String[] args) {
        int j = 0;
        for(int i=0; i<10; i++) {
            j += i;
            if(i<j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while(j<10);
        
        while(j<10) {
            j++;
        };        
    }
}