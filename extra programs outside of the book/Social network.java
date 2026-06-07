/*

Project: Social Network Simulation

Write a Java program that simulates a simple social network with menus.

MENU 1:
    1: Log in
    2: Register
    3: Exit

If the user selects 1:
    - Ask for username and password.
    - Check if the username exists and password is valid.
    - If successful, display "Login successful!" and go to MENU 3.

If the user selects 2:
    - Ask for username and password.
    - The password must be at least 6 characters long.
    - If the username already exists, ask for a different one.
    - Display "Registration successful!" and return to MENU 1.

MENU 3:
    1: View Friend Requests
    2: View Friends
    3: Send Friend Request
    4: Accept Friend Request
    5: Log Out

When logging out, return to MENU 1.

If the user selects 3 in MENU 1, the program ends.

Save the program as SocialNetwork.java
*/

import java.util.Scanner;

public class SocialNetwork {

    // Constants and global variables
    static final int MAX_USERS = 25;
    static String[] users = new String[MAX_USERS];
    static String[] passwords = new String[MAX_USERS];
    static int userCount = 0;
    static boolean[][] friendRequests = new boolean[MAX_USERS][MAX_USERS];
    static boolean[][] friends = new boolean[MAX_USERS][MAX_USERS];
    static int currentUser = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu1();
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> login(scanner);
                case 2 -> registerUser(scanner);
                case 3 -> {
                    System.out.println("Thank you for using the Java Social Network!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }

    // MENU 1 display
    static void menu1() {
        System.out.println("\nWelcome to the Java Social Network!");
        System.out.println("MENU 1:");
        System.out.println("1: Log in");
        System.out.println("2: Register");
        System.out.println("3: Exit\n");
    }

    // Returns the index of a username in the array, or -1 if not found
    static int userIndex(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].equals(username)) {
                return i;
            }
        }
        return -1;
    }

    // Registration menu
    static void registerUser(Scanner scanner) {
        if (userCount >= MAX_USERS) {
            System.out.println("ERROR: User limit reached. No new registrations allowed.");
            return;
        }

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (userIndex(username) != -1) {
            System.out.println("This username is already taken! Please choose another.");
            return;
        }

        System.out.print("Enter a password (minimum 6 characters): ");
        String password = scanner.nextLine();

        if (password.length() < 6) {
            System.out.println("Password too short! Registration failed.");
            return;
        }

        users[userCount] = username;
        passwords[userCount] = password;
        userCount++;

        System.out.println("Registration successful!");
    }

    // Login menu
    static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int index = userIndex(username);
        if (index != -1 && passwords[index].equals(password)) {
            currentUser = index;
            System.out.println("Login successful!");
            menu3(scanner);
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    // MENU 3 display and logic
    static void menu3(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nMENU 3:");
            System.out.println("1: View Friend Requests");
            System.out.println("2: View Friends");
            System.out.println("3: Send Friend Request");
            System.out.println("4: Accept Friend Request");
            System.out.println("5: Log Out");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewFriendRequests();
                case 2 -> viewFriends();
                case 3 -> sendFriendRequest(scanner);
                case 4 -> acceptFriendRequest(scanner);
                case 5 -> logout();
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }

    // View pending friend requests
    static void viewFriendRequests() {
        System.out.println("\nFriend Requests:");
        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            if (friendRequests[i][currentUser]) {
                System.out.println("- " + users[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("You have no friend requests.");
        }
    }

    // Send a friend request
    static void sendFriendRequest(Scanner scanner) {
        System.out.print("Enter the username to send a friend request to: ");
        String friendName = scanner.nextLine();
        int friendIndex = userIndex(friendName);

        if (friendIndex != -1 && currentUser != -1 &&
            !friends[currentUser][friendIndex] && !friendRequests[currentUser][friendIndex]) {

            friendRequests[currentUser][friendIndex] = true;
            System.out.println("Friend request sent to " + friendName);
        } else {
            System.out.println("Error: User not found, already a friend, or request already sent.");
        }
    }

    // Accept a friend request
    static void acceptFriendRequest(Scanner scanner) {
        System.out.print("Enter the username of the person who sent the request: ");
        String friendName = scanner.nextLine();
        int friendIndex = userIndex(friendName);

        if (friendIndex != -1 && friendRequests[friendIndex][currentUser]) {
            friends[currentUser][friendIndex] = true;
            friends[friendIndex][currentUser] = true;
            friendRequests[friendIndex][currentUser] = false;
            System.out.println("You and " + friendName + " are now friends!");
        } else {
            System.out.println("No such friend request found.");
        }
    }

    // View list of friends
    static void viewFriends() {
        System.out.println("\nYour Friends:");
        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            if (friends[currentUser][i]) {
                System.out.println("- " + users[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("You have no friends yet.");
        }
    }

    // Log out current user
    static void logout() {
        currentUser = -1;
        System.out.println("You have been logged out.");
    }
}
