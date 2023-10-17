// Ejemplo de uso del patrón Mediator
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new User("User1", mediator);
        User user2 = new User("User2", mediator);
        User user3 = new User("User3", mediator);
        User user4 = new User("User4", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hola a todos");
        user2.send("Hola User1, ¿cómo estás?");
        user3.send("Hola, ¿alguien quiere jugar un juego?");
        user4.send("Sí, ¡me encantaría!");

        user1.send("¿Qué juego les gustaría jugar?");
        user2.send("¿Qué les parece ajedrez?");
        user3.send("¡Perfecto! Comencemos.");

        user1.send("Buena suerte a todos.");
    }
}
