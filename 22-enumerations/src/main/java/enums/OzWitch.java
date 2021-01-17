package enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public enum OzWitch {
    WEST("Miss Gulch,aka the Wicked Wich of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;

    private OzWitch(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch + ": " + ozWitch.getDescription());
        }
    }
}
