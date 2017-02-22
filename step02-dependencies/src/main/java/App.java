import com.google.common.base.MoreObjects;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println(app);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("greeting", getGreeting())
                .toString();
    }
}
