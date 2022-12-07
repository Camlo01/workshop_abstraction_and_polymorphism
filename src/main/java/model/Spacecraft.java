package model;


/**
 * Abstract class representing a spaceship
 *
 * @author Camilo Beltrán
 */
public abstract class Spacecraft implements Ship, Radio {

    private String name;
    private int startActivity;
    private Integer endActivity;
    private String nationality;
    private boolean statusActive;
    private String description;
    private int speed;

//    Constructors

    /**
     * Empty constructor
     */
    public Spacecraft() {
        this.startActivity = 1;
        this.endActivity = null;
        this.statusActive = true;
        this.speed = 0;
    }

    /**
     * Constructor for not active spacecrafts
     */
    public Spacecraft(String name, int startActivity, Integer endActivity, String nationality, String description) {
        this.name = name;
        this.startActivity = startActivity;
        this.endActivity = endActivity;
        this.nationality = nationality;
        this.description = description;
        this.statusActive = false;
        this.speed = 0;
    }

    /**
     * Constructors for active spacecraft
     */
    public Spacecraft(String name, int startActivity, String nationality, String description) {
        this.name = name;
        this.startActivity = startActivity;
        this.nationality = nationality;
        this.description = description;
        this.statusActive = true;
        this.speed = 0;
    }

//    Getters and Setters

    public String getName() {
        return name;
    }

    public int getStartActivity() {
        return startActivity;
    }

    public Integer getEndActivity() {
        return endActivity;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isStatusActive() {
        return statusActive;
    }

    public String getDescription() {
        return description;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartActivity(int startActivity) {
        this.startActivity = startActivity;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //    Implemented methods


    @Override
    public void sendMessage(String message) {
    }

    @Override
    public void alert() {
        System.out.println("Alert Message");
    }

    @Override
    public void sosMessage() {
        System.out.println("S.O.S");
    }

    @Override
    public void shipEndsActivity(Integer endingYear) {
        this.endActivity = endingYear;
        this.statusActive = false;
    }

    @Override
    public void takeOffShip() {
        System.out.println("the ship takes off");
    }

    @Override
    public void accelerateSpeed() {
        this.speed += 1;
    }

    @Override
    public void accelerateSpeed(int speed) {
        this.speed += speed;
    }


    @Override
    public String getShipInfo() {
        return "--------------- Information ---------------\n" +
                "Name: " + name + "\n" +
                "Start Activity: " + name + "\n" +
                (statusActive ? " - The ship is currently active -  " : "End Activity: " + endActivity) + "\n" +
                "Nationality: " + nationality + "\n" +
                "Description: " + description + "\n";
    }

    @Override
    public String getShipInfoInline() {
        return "Name: " + name + ", status: " + startActivity + "-" + (statusActive ? "active" : endActivity) + ", nationality: " + nationality;
    }

    @Override
    public String toString() {
        return "Spacecraft{" +
                "name='" + name + '\'' +
                ", startActivity=" + startActivity +
                ", endActivity=" + endActivity +
                ", nationality='" + nationality + '\'' +
                ", statusActive=" + statusActive +
                ", description='" + description + '\'' +
                ", speed=" + speed +
                '}';
    }
}
