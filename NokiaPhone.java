import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
            1. Phone book
            2. Messages
            3. Chat
            4. Call register
            5. Tones
            6. Settings
            7. Call divert
            8. Games
            9. Calculator
            10. Reminders
            11. Clock
            12. Profiles
            13. SIM services
            """
        );

        int choice = input.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.println("""
                    1. Search
                    2. Service Nos
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send b'card
                    8. Options
                    9. Speed dials
                    10. Voice tags
                    """
                );

                int phoneBook = input.nextInt();

                switch (phoneBook) {

                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");

                    case 8 -> {
                        System.out.println("""
                            1. Type of View
                            2. Memory status
                            """
                        );
                        int option = input.nextInt();

                        switch (option) {
                            case 1 -> System.out.println("Type of View");
                            case 2 -> System.out.println("Memory status");
                            default -> System.out.println("Invalid option");
                        }
                    }

                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");

                    default -> System.out.println("Invalid option");
                }
            }

            case 2 -> {
                System.out.println("""
                    1. Write messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates
                    6. Smileys
                    7. Message settings
                    8. Info service
                    9. Voice mailbox number
                    10. Service command editor
                    """
                );
                int messages = input.nextInt();
                switch (messages) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("""
                            1. Set 1
                            2. Common
                            """
                        );
                        int messageSettings = input.nextInt();
                        switch (messageSettings) {
                            case 1 -> {
                                System.out.println("""
                                    1. Message centre number
                                    2. Messages sent as
                                    3. Message validity
                                    """
                                );
                                int set1 = input.nextInt();
                                switch (set1) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                    default -> System.out.println("Invalid option");
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                    1. Delivery reports
                                    2. Reply via same centre
                                    3. Character support
                                    """
                                );
                                int common = input.nextInt();
                                switch (common) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                    default -> System.out.println("Invalid option");
                                }
                            }
                            default -> System.out.println("Invalid option");
                        }
                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                    default -> System.out.println("Invalid option");
                }
            }

            case 3 -> System.out.println("Chat");

            case 4 -> {
                System.out.println("""
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit
                    """
                );
                int callRegister = input.nextInt();
                switch (callRegister) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("""
                            1. Last call duration
                            2. All calls' duration
                            3. Received calls’ duration
                            4. Dialled calls’ duration
                            5. Clear timers
                            """
                        );
                        int callDuration = input.nextInt();
                        switch (callDuration) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls’ duration");
                            case 4 -> System.out.println("Dialled calls’ duration");
                            case 5 -> System.out.println("Clear timers");
                            default -> System.out.println("Invalid option");
                        }
                    }
                    case 6 -> System.out.println("Show call costs");
                    case 7 -> System.out.println("Call cost settings");
                    case 8 -> System.out.println("Prepaid credit");
                    default -> System.out.println("Invalid option");
                }
            }

            default -> System.out.println("Invalid menu choice");
        }
    }
}
