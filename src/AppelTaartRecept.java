public class AppelTaartRecept {

    Ingredients roomboter = new Ingredients(200, "gram", "ongezouten roomboter");
    Ingredients suikerWit = new Ingredients(200, "gram", "witte bastard suiker");
    Ingredients bakmeel = new Ingredients(400, "gram", "zelfrijzend bakmeel");
    Ingredients ei = new Ingredients(1, "stuk", "ei");
    Ingredients vanilleSuiker = new Ingredients(8, "gram", "vanille suiker");
    Ingredients zout = new Ingredients(1, "snuf", "zout");
    Ingredients appel = new Ingredients(1.5, "kilo", "zoetzure appels");
    Ingredients suikerKristal = new Ingredients(75, "gram", "kristal suiker");
    Ingredients kaneel = new Ingredients(1, "theelepel", "kaneel");
    Ingredients paneermeel = new Ingredients(15, "gram", "paneermeel");
public void welcomeTxt(){
    System.out.println("Ingredienten: ");
}
public void printIngredients(){


    System.out.println(
            roomboter.getAmount() + " " +
            roomboter.getUnit()   + " " +
            roomboter.getName()
    );
    System.out.println(
            suikerWit.getAmount() + " " +
            suikerWit.getUnit()   + " " +
            suikerWit.getName()
    );
    System.out.println(
            bakmeel.getAmount() + " " +
            bakmeel.getUnit()   + " " +
            bakmeel.getName()
    );
    System.out.println(
            ei.getAmount() + " " +
            ei.getUnit()   + " " +
            ei.getName()
    );
    System.out.println(
            vanilleSuiker.getAmount() + " " +
            vanilleSuiker.getUnit()   + " " +
            vanilleSuiker.getName()
    );
    System.out.println(
            appel.getAmount() + " " +
            appel.getUnit()   + " " +
            appel.getName()
    );
    System.out.println(
            zout.getAmount() + " " +
            zout.getUnit()   + " " +
            zout.getName()
    );
    System.out.println(
            suikerKristal.getAmount() + " " +
            suikerKristal.getUnit()   + " " +
            suikerKristal.getName()
    );
    System.out.println(
            paneermeel.getAmount() + " " +
            paneermeel.getUnit()   + " " +
            paneermeel.getName()
    );
    System.out.println(
            kaneel.getAmount() + " " +
            kaneel.getUnit()   + " " +
            kaneel.getName()
    );
}
}
