package enums;


/**
 * V1.0 created by wujf  on  2021-01-17
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
