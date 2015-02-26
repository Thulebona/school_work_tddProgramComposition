package za.ac.cput.tddProgram;

/**
 * Created by student on 2015/02/26.
 */
public class Vehicle {

    Car car ;

    private String v_maker;
    private String v_model;
    private int v_year;

    public Vehicle() {
        car = new Car();
    }

    public Vehicle(String v_maker, String v_model, int v_year, String v_type) {
        car = new Car();
        this.v_maker = v_maker;
        this.v_model = v_model;
        this.v_year = v_year;
        car.setV_type(v_type);
    }
    public String getV_type(){ return car.getV_type(); }
}
