package livefull.comedoruniversitario;

/**
 * Created by Braian WD on 02/10/2015.
 */
public class Comidas {

    private String food_type;
    private String food_dessert;
    private String nutritional_information;

    public Comidas (String food_type, String food_dessert, String nutritional_information){
        this.food_type=food_type;
        this.food_dessert=food_dessert;
        this.nutritional_information=nutritional_information;
    }

    public String getFood_type() { return food_type; }
    public String getFood_dessert() { return food_dessert; }
    public String getNutritional_information(){return nutritional_information;}

}
