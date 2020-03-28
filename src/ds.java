
public class ds {
    public static void main(String[] args) {

        Beale metodaBeale = new Beale();
        Frequency frekuenca = new Frequency();
        FourSquare fourSquareMetoda = new FourSquare();

        if (args.length<1 || args.length>5) {
            System.out.println("WRONG USAGE!");
            System.out.println("Usage ds Beale encrypt|decrypt <book> <plaintext>|<ciphertext>");
            System.out.println("Usage ds Frequency <text>");
            System.out.println("Usage ds FourSquare encrypt|decrypt <key1> <key2> <plaintext>|<ciphertext>");
            System.exit(1);

        } else if (args[0].equals("Beale") || args[0].equals("beale")) {

            if (args[1].equals("encrypt")) {
                metodaBeale.encrypt(args[2], args[3]);
            } else if (args[1].equals("decrypt")) {
                metodaBeale.decrypt(args[2], args[3]);
            } else{
                System.out.println("Usage ds Beale encrypt|decrypt <book> <plaintext>|<ciphertext>");
                System.exit(1);
            }

        } else if (args[0].equals("Frequency") || args[0].equals("frequency")) {

            frekuenca.frekuenca(args[1]);

        } else if (args[0].equals("FourSquare") ||  args[0].equals("foursquare") || args[0].equals("four-square")){

            if (args[1].equals("encrypt")){
                System.out.println(fourSquareMetoda.encrypt(args[2],args[3],args[4]));
            } else if (args[1].equals("decrypt")){
                System.out.println(fourSquareMetoda.decrypt(args[2],args[3],args[4]));
            } else{
                System.out.println("Usage ds FourSquare encrypt|decrypt <key1> <key2> <plaintext>|<ciphertext>");
                System.exit(1);
            }

        } else {
            System.out.println("WRONG USAGE!");
            System.out.println("Usage ds Beale encrypt|decrypt <book> <plaintext>|<ciphertext>");
            System.out.println("Usage ds Frequency <text>");
            System.out.println("Usage ds FourSquare encrypt|decrypt <key1> <key2> <plaintext>|<ciphertext>");
            System.exit(1);
        }

    }
}
