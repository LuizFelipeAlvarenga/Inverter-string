package targetstring;

public class Inverter {
    
    public static String inverter(String plv) {
        char[] plvChar = plv.toCharArray();
        int primeira = 0;
        int ultima = plvChar.length - 1;

        while (primeira < ultima) {
            char temp = plvChar[primeira];
            plvChar[primeira] = plvChar[ultima];
            plvChar[ultima] = temp;

            primeira++;
            ultima--;
        }

        return new String(plvChar);
    }
}
