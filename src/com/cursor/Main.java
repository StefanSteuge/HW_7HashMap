package com.cursor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2021, 12, 1);
        LocalDate date2 = LocalDate.of(2021, 12, 2);
        LocalDate date3 = LocalDate.of(2021, 12, 5);
        LocalDate date4 = LocalDate.of(2021, 12, 7);
        LocalDate date5 = LocalDate.of(2021, 12, 10);
        LocalDate date6 = LocalDate.of(2021, 12, 12);
        LocalDate date7 = LocalDate.of(2021, 12, 15);
        LocalDate date8 = LocalDate.of(2021, 12, 18);
        LocalDate date9 = LocalDate.of(2021, 12, 22);
        LocalDate date10 = LocalDate.of(2022, 2, 8);
        LocalDate date11 = LocalDate.of(2022, 2, 10);

        Map<LocalDate, String> book = new HashMap<>();
        book.put(date1, """
                 Practical Shader Development: Vertex and Fragment Shaders for Game Developers (2019)
                Kyle Halladay
                """);
        book.put(date2, """
                 The Art of Statistics: How to Learn from Data (2022)
                David Spiegelhalter
                """);
        book.put(date3, """
                 Introduction to C & GUI Programming (2019)
                Simon Long
                """);
        book.put(date4, """
                 Deep Learning Patterns and Practices (2021)
                Andrew Ferlitsch\s
                """);
        book.put(date5, """
                 Beginning Python: From Novice to Professional (2019)
                Magnus Lie Hetland
                """);
        book.put(date6, """
                 Practical Mathematical Optimization (2018)
                Jan A Snyman, Daniel N Wilke
                """);
        book.put(date7, """
                 The Missing README: A Guide for the New Software Engineer (2021)
                Chris Riccomini, Dmitriy Ryaboy
                """);
        book.put(date8, """
                 Algorithmic Thinking: A Problem-Based Introduction (2020)
                Daniel Zingaro
                """);
        book.put(date9, """
                 Machine Learning for Kids: A Project-Based Introduction to Artificial Intelligence (2021)
                Dale Lane
                """);
        book.put(date10, """
                 Five Lines of Code: How and when to refactor (2021)
                Christian Clausen
                """);

        System.out.println();
        System.out.println(book.keySet());
        System.out.println();
        System.out.println(book.values());
        if (book.get(date2) == null) {
            System.out.println("Sorry, on this date not any book was taken");
        } else {
            System.out.println(book.get(date2));
        }
    }
}


