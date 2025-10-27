package mx.com.telcel.sipab.utility;

import java.util.regex.Pattern;

public class Utilities {

    public static String RFCValidator(String rfc) {
        String RFC_PERSONA_FISICA_REGEX = "^([A-ZÑ\\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1]))([A-Z\\d]{3})?$";
        Pattern pattern = Pattern.compile(RFC_PERSONA_FISICA_REGEX);
        String tipoPersona = null;

        boolean valido = pattern.matcher(rfc).matches();

        if (!valido) {
            tipoPersona= null;
        }else {
            if (rfc.length() == 12) { //rfc moral
                tipoPersona = "M";
                System.out.println("RFC válido para persona moral.");

            } else if (rfc.length() == 13) { //rfc fisica

                tipoPersona = "F";
                System.out.println("RFC válido para persona fisica.");
            }
        }

        return tipoPersona;
    }

}
