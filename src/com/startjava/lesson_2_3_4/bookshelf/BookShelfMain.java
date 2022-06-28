package com.startjava.lesson_2_3_4.bookshelf;
import java.util.Scanner;

public class BookShelfMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shelf shelf = new Shelf();
        System.out.println("The program is running");
        String command;
        menu();

        do {
            System.out.print("Type the command:");
            command = scan.nextLine();
            if(command.equals("how many books")) {
                shelf.howManyBooks();
            } else if(command.equals("how much free space")) {
                shelf.howMuchFreeSpace();
            } else if(command.equals("show the shelf")) {
                shelf.showTheShelf();
            } else if(command.equals("add the book")) {
                shelf.addTheBook();
                shelf.showTheShelf();
            } else if(command.equals("delete the book")) {
                shelf.deleteTheBook();
                shelf.showTheShelf();
            } else if(command.equals("find the book by name")) {
                shelf.findTheBook();
            }
        } while(!command.equals("close"));
    }
    public static void menu() {
        System.out.println("""
                MENU:
                show the shelf
                add the book
                delete the book
                find the book by name
                how many books
                how much free space
                close
                """);
    }
}
