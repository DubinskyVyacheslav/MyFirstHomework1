//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstHomework {

    String HelpMe="Я не понял немного";
    char i = 'и';


    public static void main(String[] args) {

        Bank Michail = new Bank("Michail",27,1000,1512253);

        System.out.println("Имя : " + Michail.getname());
        System.out.println("Возраст: " + Michail.getAge());
        System.out.println("Money: " + Michail.getMoney());
        System.out.println("Ваш id: " + Michail.getId());

    }
}