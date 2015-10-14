package livefull.comedoruniversitario;

/**
 * Created by Braian WD on 03/10/2015.
 */
public class CargarComidas {

    private String food_type;
    private String dessert_type;
    private String food_nutritional_information;
    private String dessert_nutritional_information;

    public CargarComidas (
            String food_type,
            String food_dessert,
            String nutritional_information,
            String dessert_nutritional_information){
        this.food_type=food_type;
        this.dessert_type=food_dessert;
        this.food_nutritional_information=nutritional_information;
        this.dessert_nutritional_information=dessert_nutritional_information;
    }

    public String getFood_type() { return food_type; }
    public String getFood_dessert() { return dessert_type; }
    public String getNutritional_information(){return food_nutritional_information;}
    public String getDessert_nutritional_information(){return dessert_nutritional_information;}



}
