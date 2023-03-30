import org.springframework.stereotype.Component;

@Component
public class UserService {
    public NotificationService notificationService;

    public UserService(NotificationService notificationService){
        System.out.println("Ejecutando constructor GestorFacturas");
        this.notificationService = notificationService;
    }
}
