package OOP_Task1_Generics;
import static print_module.print_library.println;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Generics (Обобщения) - еще один вид параметрического полиморфизма
 * <p>
 * Для чего нужны Generics?
 * </p>
 * <p>
 * <ul>
 *      <li>1. Жизненнная необходимость сохранения типов (Type Save)
 *      <li>2. Ошибки компиляции лучше ошибок выполнения
 *      <li>3. Переиспользование кода
 *      <li>4. Проектирование на уровне экземпляра классов
 * </ul>
 * </p>
 */
public class Generics {

    public static void main(String[] args) {
        println("Hello");

        ParametricWorker<Integer> worker = new ParametricWorker<>(1,
                                                         "Leon",
                                                         "Leonov",
                                                         28,
                                                         1230f);

        
        println(worker);

        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        var el = Methods.getElementFromCollection(data, 0);
        println(el);
        el = Methods.<Integer>getElementFromCollection(data, 2);
        el = Methods.getElementFromCollection(data, 2);
        println(el);
    }
}