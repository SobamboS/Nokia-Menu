import java.util.Scanner;

public class Menu{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


            System.out.println("MENU");

            System.out.println("""
                    1. Phonebook
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10. Reminder
                    11. Clock
                    12. Profiles
                    13. Sim services
                    0. Back
                    """);


        int menu=input.nextInt();


                switch (menu) {
                    case 1 -> {
                        System.out.println("""
                                1. Search
                                2. Service No
                                3. Add Name
                                4. Erase
                                5. Edit
                                6. Assign tone
                                7. Send b'card
                                """);


                        int menu1=input.nextInt();

                        switch (menu1) {
                            case 1 -> System.out.println("Search");
                            case 2 -> System.out.println("Service No");
                            case 3 -> System.out.println("Add Name");
                            case 4 -> System.out.println("Erase");
                            case 5 -> System.out.println("Edit");
                            case 6 -> System.out.println("Assign tone");
                            case 7 -> System.out.println("Send b'card");
                            case 8 -> {
                                System.out.println("8. Options");
                                System.out.println("""
                                        Sub-options
                                        
                                        1. Type of view
                                        2. Memory status
                                        """);
                                int eight=input.nextInt();
                                switch (eight) {
                                    case 1 -> System.out.println("1. Type of view");
                                    case 2 -> System.out.println("2. Memory status");
                                    default -> System.out.println("Invalid option");
                                }
                            }
                            case 9 -> System.out.println("1. Speed  dials");
                            case 10 -> System.out.println("2. Voice tags");
                            default -> System.out.println("Invalid option");
                        }
                    }


                    case 2 -> {
                        System.out.println("2. Messages");
                        int menu2=input.nextInt();

                        switch (menu2) {
                            case 1 -> System.out.println("1. Write messages");
                            case 2 -> System.out.println("2. Inbox");
                            case 3 -> System.out.println("3. Outbox");
                            case 4 -> System.out.println("4. Picture messages");
                            case 5 -> System.out.println("5. Templates");
                            case 6 -> System.out.println("6. Smileys");
                            case 7 -> {
                                System.out.println("7. Message settings");


                                int menu2_7=input.nextInt();

                                switch (menu2_7) {
                                    case 1 -> {
                                        System.out.println("1. Set");

                                        System.out.println("""
                                                Sub-option
                                                
                                                1. Message center number
                                                2. Message sent as
                                                3. Message validity""");
                                        int menu2_7_1=input.nextInt();

                                        switch (menu2_7_1) {
                                            case 1 -> System.out.println("1. Message center number");
                                            case 2 -> System.out.println("2. Message sent as");
                                            case 3 -> System.out.println("3. Message validity");
                                            default -> System.out.println("Invild option");
                                        }
                                    }


                                    case 2 -> {
                                        System.out.println("2. Common");


                                        int menu_2_7_2=input.nextInt();

                                        switch (menu_2_7_2) {
                                            case 1 -> System.out.println("1. Delivery report");
                                            case 2 -> System.out.println("2. Reply via same centre");
                                            case 3 -> System.out.println("3. Character support");
                                            default -> System.out.println("Invalid option");
                                        }
                                    }
                                }
                            }
                            case 8 -> System.out.println("Info services");
                            case 9 -> System.out.println("Voice mailbox number");
                            case 10 -> System.out.println("Service command editor");
                            default -> System.out.println("Invalid option");

                        }
                    }

                    case 3 -> System.out.println("3. Chat");

                    case 4 -> {
                        System.out.println("4. Call Register");

                        System.out.println("""
                                Sub-option
                                
                                1. Missed calls
                                2. Received calls
                                3. Dialled Numbers
                                4. Erase recent calls list""");
                        int menu4=input.nextInt();

                        switch (menu4) {
                            case 1 -> System.out.println("1. Missed calls");
                            case 2 -> System.out.println("2. Received calls");
                            case 3 -> System.out.println("3. Dialled Numbers");
                            case 4 -> System.out.println("4. Erase recent calls list");
                            case 5 -> {
                                System.out.println("5. Show call duration");


                                int menu4_5=input.nextInt();

                                switch (menu4_5) {
                                    case 1 -> System.out.println("1. Last call duration");
                                    case 2 -> System.out.println("2. All call's duration");
                                    case 3 -> System.out.println("3. Received calls duration");
                                    case 4 -> System.out.println("4. Dialled calls duration");
                                    case 5 -> System.out.println("5. Clear timer");
                                    default -> System.out.println("Invalid option");
                                }

                            }


                            case 6 -> {
                                System.out.println("6. Show all costs");

                                int menu4_6=input.nextInt();

                                switch (menu4_6) {
                                    case 1 -> System.out.println("1. Last call costs");
                                    case 2 -> System.out.println("2. All call costs");
                                    case 3 -> System.out.println("3. Clear counter");
                                    default -> System.out.println("Invalid option");
                                }

                            }
                            case 7 -> {
                                System.out.println("7. Call cost settings");

                                int menu4_7=input.nextInt();

                                switch (menu4_7) {
                                    case 1 -> System.out.println("1. Call cost settings");
                                    case 2 -> System.out.println("2. Show cost in");
                                    default -> System.out.println("Invalid option");

                                }
                            }
                            case 8 -> System.out.println("8. Prepaid Credits");
                            default -> System.out.println("Invalid option");


                        }
                    }
//            case 5 -> System.out.println("Tones");
//            case 6 -> System.out.println("Settings");
//            case 7 -> System.out.println("Call Divert");
//            case 8 -> System.out.println("Games");
//            case 9 -> System.out.println("Calculator");
//            case 10 -> System.out.println("Reminders");
//            case 11 -> System.out.println("Clock");
//            case 12 -> System.out.println("Profiles");
//            case 13 -> System.out.println("Sim Services");
     //               default -> System.out.println()("Invalid option");


                }


            }
        }
