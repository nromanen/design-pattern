package decorator;

public class Task {
    public static void main(String[] args) {
        Developer javaDeveloper = new TechleadDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(javaDeveloper.doJob());

    }
}
