import java.util.*;

public class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager() {
        appointments = Database.loadAppointments();
    }

    public void addAppointment(Appointment a) {
        appointments.add(a);
        Database.saveAppointments(appointments);
        System.out.println("Встреча добавлена со статусом: Ожидание.");
    }

    public void showAppointments(String filterStatus) {
        boolean found = false;
        for (Appointment a : appointments) {
            if (filterStatus.equals("ВСЕ") || a.getStatus().equalsIgnoreCase(filterStatus)) {
                System.out.println("ID: " + a.getId() + " | " + a.getName() + " | " + a.getService() + " | "
                        + a.getDate() + " | " + a.getProfession() + " | " + a.getStatus());
                found = true;
            }
        }
        if (!found) System.out.println("Нет встреч с таким статусом.");
    }

    public void updateStatus(int id, String newStatus) {
        for (Appointment a : appointments) {
            if (a.getId() == id) {
                a.setStatus(newStatus);
                Database.saveAppointments(appointments);
                System.out.println("Статус обновлён.");
                return;
            }
        }
        System.out.println("Встреча с таким ID не найдена.");
    }

    public void cancelAppointment(int id) {
        appointments.removeIf(a -> a.getId() == id);
        Database.saveAppointments(appointments);
        System.out.println("Удалено (если было).");
    }
}