package github.io.jpdravila.Java12.ClasseCompactNumberFormat;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExemplo {
    public static void main(String[] args){
        NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(Locale.ITALY, NumberFormat.Style.LONG);

        System.out.println(nf.format(50000));
    }
}
