package com.cursor;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Task 1 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        MyFunctionalInterface division = () -> System.out.println("Show text using functional Interface");
        division.show();

        LocalDate localDate = LocalDate.now().minusDays(7);
        List<User> users = Arrays.asList(
                new User("user_@corsor.com", LocalDate.of(2021, 12, 1), "Java"),
                new User("user1@corsor.com", LocalDate.of(2021, 12, 15), "Java"),
                new User("user2@corsor.com", LocalDate.of(2021, 12, 25), "Java"),
                new User("user3@corsor.com", LocalDate.of(2022, 1, 4), "Java"),
                new User("user4@corsor.com", LocalDate.of(2022, 1, 7), "Python"),
                new User("user5@corsor.com", LocalDate.of(2022, 1, 30), "Python"),
                new User("user6@corsor.com", LocalDate.of(2022, 2, 1), "Python"),
                new User("user7@corsor.com", LocalDate.of(2022, 2, 3), "Python"),
                new User("user8@corsor.com", LocalDate.of(2022, 2, 5), "Python"));
        List<Films> filmsList = Arrays.asList(
                new Films("Comedy", " Hot Fuzz", 250),
                new Films("Comedy", " 21 Jump Street", 350),
                new Films("Comedy", " School of Rock", 270),
                new Films("Action", " Spider-Man: No Way Home ", 270),
                new Films("Drama", " Euphoria", 292),
                new Films("Romance", " Emily in Paris ", 221),
                new Films("Sci-Fi", " The Matrix ", 435),
                new Films("Romance", " Brazen", 154),
                new Films("Drama", " Don't Look Up ", 387),
                new Films("Sci-Fi", " Dune", 385),
                new Films("Romance", " The King's Daughter", 278),
                new Films("Drama", " Dexter: New Blood", 253),
                new Films("Sci-Fi", " The Expanse", 187),
                new Films("Action", "11. The Last Duel", 125));

        var list = users.stream()
                .filter(it -> it.getEntered_Data().isAfter(LocalDate.now().minusDays(7)))
                .toList();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~ Task 2 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n Users who logged in after week ago: \n" + "\n" + list);
        System.out.println("\n Users grouping by team: \n");
        users.stream()
                .collect(Collectors.groupingBy(User::getTeam))
                .entrySet().forEach(System.out::println);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~ Task 3 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        var filmList = filmsList.stream()
                .collect(Collectors.groupingBy(Films::getGenre, Collectors.counting()));
        System.out.println("Count of movies for each genre: \n" + filmList);
        var averagePrice = filmsList.stream()
                .collect(Collectors.groupingBy(Films::getGenre, Collectors.averagingDouble(Films::getPrice)));
        System.out.println("\nThe average price of tickets for each genre: \n" + averagePrice);

    }
}