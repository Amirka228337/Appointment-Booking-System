import java.io.*;
import java.util.*;

public class Database {
    private static final String FILE = "appointments.csv";

    public static void saveAppointments(List<Appointment> appointments) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Appointment a : appointments) {
                pw.println(a);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении базы данных.");
        }
    }

    public static List<Appointment> loadAppointments() {
        List<Appointment> list = new ArrayList<>();
        File file = new File(FILE);
        if (!file.exists()) return list;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                list.add(Appointment.fromCSV(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл базы не найден.");
        }
        return list;
    }
}