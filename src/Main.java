import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //Вопросы по билету №13.
    //1. Что такое переопределение (override) метода?
    //2. Дайте краткую характеристику класса Object в Java.
    //3. Зачем в Java такое многообразие имплементации key-value storage?
    //4. Дайте определение переменной. Перечислите типы переменных и хранимые в них данные
    //- Задача на лайв-кодинг
    //  Напишите программу, которая переворачивает массив.
    //- Задача на лайв-кодинг
    //Напишите Java-программу для удаления всех пробелов из строки с помощью replace()
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        System.out.println(arrList);
        Collections.reverse(arrList);
        System.out.println(arrList);
    }
}
