public class AardbeienBavarois {

    Ingredients aardbeien = new Ingredients(375, "gram", "aardbeien");
    Ingredients slagroom = new Ingredients(375, "gram", "slagroom");
    Ingredients gelatine = new Ingredients(4.5, "blaadjes", "gelatine");
    Ingredients citroensap = new Ingredients(3, "eetlepels", "citroensap");
    Ingredients suiker = new Ingredients(112.5, "gram", "suiker");
    Ingredients olie = new Ingredients(1, "eetlepel", "olie");




    public void weekGelatine() {
        System.out.println("Week de blaadjes gelatine in koud water.");
    }

    public void pureerAardbeien() {
        System.out.println("Pureer de aardbeien met de staafmixer helemaal fijn.");
    }

    public void aardbeienSaus() {
        System.out.println("Doe de aardbeiensaus in een pannetje samen met het citroensap en verwarm dit. Het hoeft niet te koken.");
    }

    public void knijpGelatine() {
        System.out.println("Knijp de gelatine uit en voeg toe aan de warme aardbeiensaus. Laat het mengsel vervolgens weer iets afkoelen. Niet te ver anders wordt deze al stijf.");
    }

    public void mixSlagroom() {
        System.out.println("Mix de slagroom en de suiker lobbig. Voeg de aardbeiensaus met de opgeloste gelatine toe en mix er doorheen.");
    }

    public void vetVormpjes() {
        System.out.println("Vet de vormpjes in met een beetje olie. Zo laat de bavarois straks beter los. Of gebruik siliconen puddingvormpjes.");
    }

    public void gietMengsel() {
        System.out.println("Giet het mengsel in de vormpjes en zet minimaal 3 uur in de koelkast of een hele nacht.");
    }

    public void warmWater() {
        System.out.println("Doe wat warm water in een kom en houd de onderkant van de vormpjes kort hierin zodat de aardbeien bavarois makkelijk los komt. Stort de bavarois daarna op een bordje.");
    }

    public void garneerBavarois() {
        System.out.println("Garneer de bavarois eventueel met wat extra verse aardbeien.");
    }

    public void kleineTip() {
        System.out.println("Tip: wil je geen risico lopen dat de bavarois niet goed uit de vormpjes komt. Serveer de aardbeien bavarois dan in een glaasje die je laat opstijven in de koelkast.");
    }

    public void printIngredients() {
        System.out.println(aardbeien.getAmount() + " " + aardbeien.getUnit() + " " + aardbeien.getName());
        System.out.println(slagroom.getAmount() + " " + slagroom.getUnit() + " " + slagroom.getName());
        System.out.println(gelatine.getAmount() + " " + gelatine.getUnit() + " " + gelatine.getName());
        System.out.println(citroensap.getAmount() + " " + citroensap.getUnit() + " " + citroensap.getName());
        System.out.println(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName());
        System.out.println(olie.getAmount() + " " + olie.getUnit() + " " + olie.getName());

    }

    public void benodigdHeden() {
        System.out.println("Benodigdheden in de keuken: ");
        System.out.println("Staafmixer");
        System.out.println("Mixer");
        System.out.println("Puddingvormpjes van 10cm");
    }
    public void alleStappen() {
        benodigdHeden();
        printIngredients();
        weekGelatine();
        pureerAardbeien();
        aardbeienSaus();
        knijpGelatine();
        mixSlagroom();
        vetVormpjes();
        gietMengsel();
        warmWater();
        garneerBavarois();
        kleineTip();
    }
}
