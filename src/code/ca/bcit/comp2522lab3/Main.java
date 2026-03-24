package ca.bcit.comp2522lab3;

/**
 * Main method that drives the program.
 *
 * @author Kiet Tran
 * @author Tommy White
 *
 * @version 1.0
 */
public class Main {

    /**
     * Driver method.
     *
     * @param args unused
     */
    public static void main(final String[] args) {

        final IPod ipod1;
        final IPod ipod2;
        final IPod ipod3;

        ipod1 = new IPod(300,
                80.0);
        ipod2 = new IPod(400,
                85.0);
        ipod3 = new IPod(300,
                70.0);

        System.out.println("IPod Equality Test:");

        if (!ipod1.equals(ipod2))

        {
            System.out.println("CORRECT: ipod1 is not equal to ipod2");
        }

        else

        {
            System.out.println("INCORRECT: ipod1 should not be equal to ipod2");
        }

        if (ipod1.equals(ipod3))

        {
            System.out.println("CORRECT: ipod1 is equal to ipod3");
        }

        else

        {
            System.out.println("INCORRECT: ipod1 should be equal to ipod3");
        }

        System.out.println();

        final IPad ipad1;
        final IPad ipad2;
        final IPad ipad3;

        ipad1 = new IPad(true,
                "iPadOS 15");
        ipad2 = new IPad(false,
                "iPadOS 14");
        ipad3 = new IPad(true,
                "iPadOS 15");

        System.out.println("IPad Equality Test:");

        if (!ipad1.equals(ipad2))

        {
            System.out.println("CORRECT: ipad1 is not equal to ipad2");
        }

        else

        {
            System.out.println("INCORRECT: ipad1 should not be equal to ipad2");
        }

        if (ipad1.equals(ipad3))

        {
            System.out.println("CORRECT: ipad1 is equal to ipad3");

        }

        else

        {
            System.out.println("INCORRECT: ipad1 should be equal to ipad3");
        }

        System.out.println();

        final IPhone iphone1;
        final IPhone iphone2;
        final IPhone iphone3;

        iphone1 = new IPhone(120.0,
                "Verizon");
        iphone2 = new IPhone(180.0,
                "T-Mobile");
        iphone3 = new IPhone(120.0,
                "AT&T");

        System.out.println("IPhone Equality Test:");

        if (!iphone1.equals(iphone2))

        {
            System.out.println("CORRECT: iphone1 is not equal to iphone2");
        }

        else

        {
            System.out.println("INCORRECT: iphone1 should not be equal to iphone2");
        }

        if (iphone1.equals(iphone3))

        {
            System.out.println("CORRECT: iphone1 is equal to iphone3");
        }

        else

        {
            System.out.println("INCORRECT: iphone1 should be equal to iphone3");
        }

        System.out.println();

        final IPhone17 iphone17_1;
        final IPhone17 iphone17_2;
        final IPhone17 iphone17_3;

        iphone17_1 = new IPhone17(100.0,
                "Verizon", true,
                512);
        iphone17_2 = new IPhone17(100.0,
                "Verizon",
                true,
                256);
        iphone17_3 = new IPhone17(100.0,
                "Verizon",
                false,
                512);

        System.out.println("IPhone17 Equality Test:");

        if (iphone17_1.equals(iphone17_2))

        {
            System.out.println("CORRECT: iphone17_1 is equal to iphone17_2");
        }

        else

        {
            System.out.println("INCORRECT: iphone17_1 should be equal to iphone17_2");
        }

        if (!iphone17_1.equals(iphone17_3))

        {
            System.out.println("CORRECT: iphone17_1 is not equal to iphone17_3");
        }

        else

        {
            System.out.println("INCORRECT: iphone17_1 should not be equal to iphone17_3");
        }

        System.out.println();
    }
}

