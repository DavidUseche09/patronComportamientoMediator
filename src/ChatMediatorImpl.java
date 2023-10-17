import java.util.ArrayList;
import java.util.List;

// Mediator concreto
public class ChatMediatorImpl implements ChatMediator {
    private final List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // Asegurarse de que el mensaje no se envíe al usuario que lo envió
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
