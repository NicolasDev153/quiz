package quizes.q2.nikoloz_beridze_3.tunneling.sub;

import quizes.q2.nikoloz_beridze_3.tunneling.A21;
import quizes.q2.nikoloz_beridze_3.biochemistry.A22;

public class R21 {

    public static void main(String[] args) {
        System.out.printf("Area: %d\n", A21.hei, A21.len, A21.hei * A21.len);

        if (A22.month < 1 || A22.month > 12) {
            System.out.println("Invalid input");
        } else {
            System.out.printf("Month: %d\n", A22.month);
        }
    }

}
