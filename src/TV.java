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
public class TV {
    private String name;
    private int year;
    private double price;
    private int diagonal;
    private String manufacturer;


    public TV(String name, int year, double price, int diagonal, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer.toLowerCase();
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "модель '" + name + '\'' +
                ", год " + year +
                ", цена " + price +
                ", диагональ " + diagonal +
                ", производитель '" + manufacturer + '\'' +
                '}';
    }
}
