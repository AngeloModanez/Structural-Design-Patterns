public class CompositeDemo {
    public static void main(String[] args) {
        Employee bruno = new Employee("Bruno", "Estágio", 1200);
        Employee ronaldo = new Employee("Ronaldo", "TI", 3000);
        Employee everson = new Employee("Everson", "TI", 3200);
        Employee ruan = new Employee("Ruan", "TI", 3100);
        Employee julia = new Employee("Julia", "Gestão", 6000);

        ronaldo.add(bruno);

        julia.add(ronaldo);
        julia.add(everson);
        julia.add(ruan);

        System.out.println(julia);
    }
}
