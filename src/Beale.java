import java.io.*;
import java.util.*;

public class Beale {
    public void encrypt(String fname, String fjala) {
        Scanner textContent = null;
        try {
            File file = new File(fname);

            StringBuilder cool = new StringBuilder();
            textContent = new Scanner(file);

            while (textContent.hasNext()) {
                cool.append(textContent.nextLine());
            }

            ArrayList<Integer> Numrat = new ArrayList<>();

            String s = cool.toString();
            String finalString[] = s.split(" ");

            for (int i = 0; i < fjala.length(); i++) {
                if (fjala.charAt(i) == ' ')
                    continue;
                for (int j = 0; j < finalString.length; j++) {
                    if (fjala.charAt(i) == finalString[j].charAt(0)) {

                        if (Numrat.contains(j + 1))
                            continue;
                        else {
                            Numrat.add(j + 1);
                            break;
                        }
                    }
                }
            }

            System.out.println(Numrat.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            textContent.close();
        }
    }

    //it ain't much but it's honest work
    public void decrypt(String fname, String numrat) {
        Scanner textContent = null;
        try {
            File file = new File(fname);

            StringBuilder cool = new StringBuilder();
            textContent = new Scanner(file);

            while (textContent.hasNext()) {
                cool.append(textContent.nextLine());
            }

            StringBuilder fjala = new StringBuilder();

            String s = cool.toString();
            String libri[] = s.split(" ");

            String nr[] = numrat.split(", ");

            for(int i = 0; i < nr.length; i++) {
                int index = (Integer.parseInt(nr[i]) - 1) % libri.length;
                fjala.append(libri[index].charAt(0));
            }

            System.out.println(fjala.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            textContent.close();
        }
    }
}

