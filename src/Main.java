import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
ДОМАШНЕЕ ЗАДАНИЕ
Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель. Нужно создать набор телевизоров
и выполнить следующие задачи:
■ Показать все телевизоры;
■ Показать телевизоры с заданной диагональю;
■ Показать все телевизоры одного производителя;
■ Показать все телевизоры текущего года;
■ Показать все телевизоры дороже заданной цены;
■ Показать все телевизоры, отсортированные по цене
по возрастанию;
■ Показать все телевизоры, отсортированные по цене
по убыванию.
Практические задания
2
■ Показать все телевизоры, отсортированные по диагонали по возрастанию;
■ Показать все телевизоры, отсортированные по диагонали по убыванию.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TV> tv = new ArrayList<>(List.of(
                new TV("UE43BU8510UX", 2019,49999.99,50,"samsung"),
                new TV("55PUS7956", 2021,54999.99,54,"philips"),
                new TV("75UQ80006LB", 2016,34999.99,39,"LG"),
                new TV("UE55AU7560UXRU", 2019,49999.99,50,"samsung"),
                new TV("Mi TV P1 L32M7-7AEU", 2019,42999.99,50,"xiaomi")
        ));




        System.out.println("Все телевизоры:");
        tv.forEach(System.out::println);
        //Вывести все телевизоры с заданной диагональю
        System.out.println("Введите диагональ:");
        int diagonal = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Все телевизоры с диагональю " + diagonal + ":");
        tv.stream()
                .filter(n -> n.getDiagonal() == diagonal)
                .forEach(System.out::println);

        //Вывести все телевизоры данного производителя
        System.out.println("Введите производителя:");
        String manufacturer = scanner.nextLine();

        System.out.println("Все телевизоры производителя " + manufacturer + ":");
        tv.stream()
                .filter(n -> n.getManufacturer().equals(manufacturer.toLowerCase()))
                .forEach(System.out::println);


        //Вывести все телевизоры текущего года
        System.out.println("Введите год производства:");
        int year = scanner.nextInt();

        System.out.println("Все телевизоры " + year + " года:");
        tv.stream()
                .filter(n -> n.getYear() == year)
                .forEach(System.out::println);

        //Вывести все телевизоры дороже текущей цены
        System.out.println("Введите цену:");
        double price = scanner.nextDouble();

        System.out.println("Все телевизоры дороже " + price+ ":");
        tv.stream()
                .filter(n -> n.getPrice() > price)
                .forEach(System.out::println);


        //■ Показать все телевизоры, отсортированные по цене по возрастанию
        System.out.println("\nТелевизоры отсортированные по цене по возрастанию:");
        tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice))
                .forEach(System.out::println);

        //■ Показать все телевизоры, отсортированные по цене по убыванию
        System.out.println("Телевизоры отсортированные по цене по убыванию:");
        tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .forEach(System.out::println);

        //■ Показать все телевизоры, отсортированные по диагонали по возрастанию
        System.out.println("Телевизоры отсортированные по диагонали по возрастанию:");
        tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .forEach(System.out::println);

        //■ Показать все телевизоры, отсортированные по диагонали по убыванию
        System.out.println("Телевизоры отсортированные по диагонали по убыванию:");
        tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .forEach(System.out::println);



    }
}