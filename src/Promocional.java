public interface Promocional {
    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10() {
        return aplicaDescontoDe(0.1);
    }
}
