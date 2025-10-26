import java.io.*;
import java.util.Scanner;

public class NotesManager {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== TEXT-BASED NOTES MANAGER =====");
            System.out.println("1. Write a new note");
            System.out.println("2. View all notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    writeNote(sc);
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void writeNote(Scanner sc) {
        System.out.println("Enter your note (type 'END' on a new line to finish):");

        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END"))
                    break;
                fw.write(line + "\n");
            }
            fw.write("-------------------------------\n");
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readNotes() {
        System.out.println("\n===== YOUR SAVED NOTES =====");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean isEmpty = true;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }
            if (isEmpty) {
                System.out.println("(No notes found)");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes file found. Start by writing a note first!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
