package lesson29;
@FunctionalInterface
public interface MyFunction <T, R>{

  R apply(T value);

}
