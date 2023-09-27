package linkedList.linkedList.myLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("предпоследний");
        stringLinked.addLast("последний");
        stringLinked.addFirst("первый");
        stringLinked.addFirst("перед первым");
        System.out.println(stringLinked.size());
//        for (int i = 0; i < stringLinked.size(); i++) { //Первый вариант пробежаться по списку (цикл)
//            System.out.println(stringLinked.getElementByIndex(i));
//        }
//        for (String s : stringLinked){ //Второй вариант пробежаться по списку (анонимная функция)
//            System.out.println(s);
//        }
        Iterator iterator = stringLinked.descendingIterator();//Третий вариант пробежаться по списку с конца (итератор)
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
