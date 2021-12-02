import java.util.*;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        String input = new String();
        String newItem = new String();
        String takenItem = new String();

        /*code for Stack
        Stack<String> bag = new Stack<String>();

        while(choice == 0){

            System.out.println("What do you want to do?");
            input = sc.nextLine();

            switch(input){

                case "add":
                    System.out.println("What kind of item do you want to add?");
                    newItem = sc.nextLine();
                    bag.add(newItem);
                    break;
                case "take":
                    System.out.println("Taken item is " + bag.pop());
                    break;
                case "print":
                    System.out.println("Your stack looks like this: " + bag);
                    break;
                case "exit":
                    choice++;
                    break;
                default:
                    System.out.println("Sorry, I don't understand!");
                    break;
            }

        }
        */

        //code for Linked List
        /*
        LinkedList<String> ll = new LinkedList<String>();

        while(choice == 0){

            System.out.println("What do you want to do?");
            input = sc.nextLine();

            switch(input){

                case "add":
                    System.out.println("What kind of item do you want to add?");
                    newItem = sc.nextLine();
                    ll.add(newItem);
                    break;
                case "take":
                    System.out.println("Taken item is " + ll.removeFirst());
                    break;
                case "print":
                    System.out.println("Your stack looks like this: " + ll);
                    break;
                case "exit":
                    choice++;
                    break;
                default:
                    System.out.println("Sorry, I don't understand!");
                    break;
            }

        }
        */

        //code for Hash Set
        /*
        HashSet<String> set = new HashSet<String>();

        while(choice == 0){

            System.out.println("What do you want to do?");
            input = sc.nextLine();

            switch(input){

                case "add":
                    System.out.println("What kind of item do you want to add?");
                    newItem = sc.nextLine();
                    set.add(newItem);
                    break;
                case "take":
                    System.out.println("What kind of item do you want to take?");
                    takenItem = sc.nextLine();
                    set.remove(takenItem);
                    break;
                case "print":
                    System.out.println("Your stack looks like this: " + set);
                    break;
                case "exit":
                    choice++;
                    break;
                default:
                    System.out.println("Sorry, I don't understand!");
                    break;
            }

        }
         */
