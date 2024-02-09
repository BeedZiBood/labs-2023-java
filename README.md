# labs-2023-java
Репозиторий с работами по java

Само описание работ:

1.	В компьютерной игре герой (класс Hero) может перемещаться между двумя точками (метод move) различными способами: идти пешком, ехать на лошади, лететь и т. п. Реализовать классы, позволяющие выбирать и менять в ходе выполнения программы способ перемещения героя, используя паттерн “стратегия” (strategy). Продемонстрировать работу реализованных классов. 
2.	Написать аннотацию с целочисленным параметром. Создать класс, содержащий публичные, защищенные и приватные методы (2-3 каждого вида) с параметрами, аннотировать любые из них. Вызвать из другого класса все аннотированные защищенные и приватные методы столько раз, сколько указано в параметре аннотации. Вызывающий методы код не должен зависеть от количества и типов параметров этих методов.
3.	Дана иерархия животного царства:
   Создать метод segregate вида:
  	segregate(SrcCollection, Collection1, Collection2, Collection3)
  	Где:
  	SrcCollection – исходная коллекция животных
  	Collection1, Collection2, Collection3 – коллекции, в которые должны быть распределены соответственно ежи, манулы и рыси из SrcCollection
  	Необходимо, чтобы была возможность вызвать метод следующими способами:
  	segregate(Млекопитающие, Ежовые, Кошачьи, Хищные)
  	segregate(Хищные, Хордовые, Манулы, Кошачьи)
  	segregate(Ежовые, Насекомоядные, Хищные, Хищные)
  	Продемонстрировать работу метода
4.	Реализовать программу-переводчик
   4.1 При запуске программы выполняется чтение словаря в следующем формате: слово или выражение | перевод
 4.2	Затем читается входной файл и выполняется перевод
 4.3	Перевод осуществляется по следующим правилам:
  *	регистр букв игнорируется
  *	если искомого слова нет в словаре – выводится без перевода
  *	если есть несколько подходящих вариантов, выбирается вариант максимальной длиной левой части, т. е. если в словаре есть переводы для look и look forward to, то выбираться должен наиболее подходящий вариант
 4.4	Результат перевода выводится в консоль
 4.5	Создать и применить пользовательские исключения:
  *	InvalidFileFormatException см. пункт 4.1;
  *	FileReadException файла не существует, нет доступа к файлу и т.д.
5.	С использованием только Stream API реализовать следующие методы:
 *	метод, возвращающий среднее значение списка целых чисел;
 *	метод, приводящий все строки в списке в верхний регистр и добавляющий к ним префикс «_new_»;
 *	метод, возвращающий список квадратов всех встречающихся только один раз элементов списка;
 *	метод, принимающий на вход коллекцию строк и возвращает все строки, начинающиеся с заданной буквы, отсортированные по алфавиту;
 *	метод, принимающий на вход коллекцию и возвращающий ее последний элемент или кидающий исключение, если коллекция пуста;
 *	метод, принимающий на вход массив целых чисел, возвращающий сумму чётных чисел или 0, если чётных чисел нет;
 *	метод, преобразовывающий все строки в списке в Map, где первый символ – ключ, оставшиеся – значение;
