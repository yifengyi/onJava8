package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class CommunicateSimply{
    static void perform(Performs performer){
        performer.speak();
        performer.sit();
    }
}
public class SimpleDogsAndRobots {
    public static void main(String[] args) {
        CommunicateSimply.perform(new PerformingDog());
        CommunicateSimply.perform(new Robot());
    }
}
