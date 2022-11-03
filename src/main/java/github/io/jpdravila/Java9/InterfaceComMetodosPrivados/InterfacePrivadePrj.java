package github.io.jpdravila.Java9.InterfaceComMetodosPrivados;

public class InterfacePrivadePrj {
    public static void main(String[] args) {
        var log = new LogEventosI() {
        };

        log.logWarn("Todos os modos falharam");

    }
}
