//: enumerated/Competitor.java
// Switching one enum on another.
package bookCode.enumerated;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
