import java.awt.Label;
import java.time.Year;

public class index
{

    public static void main(String[] args)
    {

        // MAAK ALLE ONDERDELEN AF OM DE OPDRACHT TE VOLTOOIEN!

        OnderdeelEen();
        OnderdeelTwee();
        OnderdeelDrie();

    }


    public static void OnderdeelEen()
    {

        /*
         * ################## VARIABELEN MAKEN ##################
         *
         * Maak twee variabelen en print de waarde van deze variabelen uit.
         * De eerste variabele moet een "boolean" zijn en de tweede variabele
         * moet een "String" zijn. (Zorg ervoor dat de String gevuld is. ;D )
         *
         */

        System.out.println("################## VARIABELEN MAKEN ##################");


        // Maak hier de variabelen:
        boolean var1 = true;
        String var2 = "lets go";

        // VERVANG DE COMMENT (inclusief /* en */ ) MET JOUW VARIABELEN!

        System.out.println(  var1  );
        System.out.println(  var2  );


    }

    public static void OnderdeelTwee()
    {

        /*
         * ################## DATATYPES ##################
         *
         * Zorg ervoor dat de correcte soort waarde in de getypeerde variabelen terecht komt.
         *
         */

        // Vul de correcte waarde bij deze variabelen in:

        String	variabeleA = "lets dont go";
        boolean variabeleB = false;
        int		variabeleC = 3012;

        Label	variabeleD = new Label("Naam van het Label"); // Deze klopt al.

        char	variabeleE = new Character('a');
        double	variabeleF = 3;
        float	variabeleG = 5;



        // Hier worden de resultaten geprint:

        System.out.println("################## DATATYPES ##################");
        System.out.println(variabeleA);
        System.out.println(variabeleB);
        System.out.println(variabeleC);

        System.out.println(variabeleD.getText());

        System.out.println(variabeleE);
        System.out.println(variabeleF);
        System.out.println(variabeleG);

    }

    public static void OnderdeelDrie()
    {

        /*
         * ################## VARIABELEN IN VARIABELEN ##################
         *
         * Maak 8 variabelen in totaal, waarvan 2 een "boolean" zijn, 3 een "int" en 3 een "String".
         *
         * Boolean 1 heeft een ja/nee waarde.
         * Boolean 2 heeft een referentie naar boolean 1.
         *
         * Int 1 heeft een getallenwaarde.
         * Int 2 heeft een getallenwaarde.
         * Int 3 heeft de waarde: int 1 - int 2. (int 1 MINUS int 2)
         *
         * String 1 heeft een tekstwaarde.
         * String 2 heeft een tekstwaarde.
         * String 3 heeft de waarde: String 1 + String 2. (String 1 PLUS String 2)
         *
         *
         * Vervolgens print je boolean 2, int 3 en String 3 uit.
         *
         */

        System.out.println("################## VARIABELEN IN VARIABELEN ##################");



        // Maak hier de variabelen:
        boolean trello = false;
        boolean trello1 = trello;
        int number = 5;
        int number2 = 4;
        int number3 = number - number2;
        String tekt = "Hello";
        String tekt2 = "world";
        String yes = tekt + tekt2;


        // VERVANG DE COMMENT (inclusief /* en */ ) MET JOUW VARIABELEN!

        System.out.println(  trello1  );
        System.out.println( number3  );
        System.out.println( yes );

    }

}
