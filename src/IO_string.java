import java.util.Scanner;

public class IO_string {

    public static void main(String args[]) {

                // Program info

        System.out.println("Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран. ");

                // Var

        String io_str;

                // Data processing

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите сроку: ");
        io_str = scan.nextLine();
        System.out.println("Ваша строка: " + io_str);

    }


}
