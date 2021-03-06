package controlflow;

import onjava.TimedAbort;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class RandomBounds {
    public static void main(String[] args) {
        new TimedAbort(3);
        switch (args.length == 0 ? "" : args[0]) {
            case "lower":
                while (Math.random()!=0.0){
                 ;
                }
                System.out.println("Produced 0.0!");
                break;
            case"upper":
                while (Math.random()!=1.0){
                    ;
                }
                System.out.println("Produced 1.0");
                break;
                default:
                    System.out.println("Usage:");
                    System.out.println("\tcontrolflow.RandomBounds lower");
                    System.out.println("\tcontrolflow.RandomBounds upper");
                    System.exit(1);
        }
    }
}
