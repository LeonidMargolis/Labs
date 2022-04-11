package com.company.laba8.progect4;

class example_17_1 { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    public int value; // значение
    public example_17_1 next; // поле – ссылка (указатель) на следующий узел
    example_17_1(int value, example_17_1 next) { // конструктор класса
        this.value = value;
        this.next = next;
    }}
public class DSD_manual { // ГЛАВНЫЙ КЛАСС
    public static void main(String[] args) {
// создание несвязанных узлов с помощью конструктора
        example_17_1 node0 = new example_17_1(0, null); // 0-й узел – будет головой в списке
        example_17_1 node1 = new example_17_1(1, null);
        example_17_1 node2 = new example_17_1(2, null);
        example_17_1 node3 = new example_17_1(3, null); // последний узел – будет хвостом в списке
// связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
// вывод списка с использованием вспомогательной переменной ref,
// соответствующей текущему значению ссылки при прохождении по списку
        example_17_1 ref = node0; // для перемещения по списку достаточно помнить голову
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        } }}
