package lt.ornetas.dalyba;

public class ArgumentIsZeroException extends Throwable {
    String messege;

    public ArgumentIsZeroException(String additional1) {
        messege =
                "Negalime dalinti nes " + additional1 + " skaicius turi NULI";
    }
    public ArgumentIsZeroException(String additional1, String additional2) {
        messege =
                String.format(
                        "Negalime dalinti nes %s ir %s skaiciai turi po NULI",
                        additional1,
                        additional2
                );
    }




    @Override
    public String toString(){
        return messege;
    }
}
