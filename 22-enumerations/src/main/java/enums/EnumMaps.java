package enums;

import java.util.EnumMap;
import java.util.Map;

import static enums.AlarmPoints.*;
/**
 * V1.0 created by wujf  on  2021-01-17
 */
interface Command{
    void action();
}
public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em =
                new EnumMap<>(AlarmPoints.class);
        em.put(KITCHEN,
                () -> System.out.println("Kitchen fire!"));

        em.put(BATHROOM,
                () -> System.out.println("Bathroom alert!"));

        for (Map.Entry<AlarmPoints, Command> entry : em.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            entry.getValue().action();
        }
        try {
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println("Expected: " + e);
        }
    }

}
