package lt.ornetas.dalyba;

public class IntDivider {

    public static int divide(String [] skaiciai)throws ArgumentIsZeroException {
        int pirmasSkaicius = Integer.parseInt(skaiciai[0]);
        int antrasSkaicius = Integer.parseInt(skaiciai[1]);


        if (pirmasSkaicius == 0 && antrasSkaicius == 0) {
            throw new ArgumentIsZeroException("PIRMAS", "ANTRAS");
        } else if ((pirmasSkaicius==0)) {
            throw new ArgumentIsZeroException("PIRMAS");
        } else if (antrasSkaicius == 0) {
            throw new ArgumentIsZeroException("ANTRAS");
        }

        return pirmasSkaicius / antrasSkaicius;
    }
}
