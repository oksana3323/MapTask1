import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


 /*//TOO DO       изобрести его
        НАПИШИТЕ ПРОГРАММУ,
        КОТОРАЯ СЧИТЫВАЕТ СТРОКУ ИЗ
        КОНСОЛИ И ВЫВОДИТ НА ЭКРАН
        ЧАСТОТУ ВСТРЕЧАЕМОСТИ
        КАЖДОГО СИМВОЛА В ЭТОЙ
        СТРОКЕ. НАПРИМЕР, ЕСЛИ
        ПОЛЬЗОВАТЕЛЬ ВВОДИТ СТРОКУ
        "HELLO WORLD", ПРОГРАММА
        ДОЛЖНА ВЫВЕСТИ:  H - 1 E - 1 L - 3 O
                - 2 W - 1 R - 1 D - 1  ДЛЯ РЕШЕНИЯ
        ЗАДАЧИ ИСПОЛЬЗУЙТЕ
        MAP<CHARACTER, INTEGER>.
        TA*/
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();

        Map<Character, Integer> map = new HashMap<>();
        for (char c:name.toCharArray()){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);

            }
            System.out.println(map);
        }


        }
    }







