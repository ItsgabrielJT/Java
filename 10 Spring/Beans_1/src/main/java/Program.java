import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {

        // CArgamos el archivo bean
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // POr medio del id que hemos colocado en el bean, recuperamos el objeto que hemos creado en el xml
        Saludo saludo = (Saludo) context.getBean("saludo");
        // Came mencionar que este obejto es unico y es el mismo en cada parte o instancia de codigo
        saludo.imprimirSaludo();

        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        notificationService.imprimirSaludo();

        UserService userService= (UserService) context.getBean("userService");
        userService.notificationService.imprimirSaludo();
    }
}
