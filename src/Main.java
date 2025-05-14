import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManager manager = new AppointmentManager();

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Добавить встречу");
            System.out.println("2. Показать все встречи");
            System.out.println("3. Показать встречи по статусу");
            System.out.println("4. Принять встречу");
            System.out.println("5. Отклонить встречу");
            System.out.println("6. Отменить встречу");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Имя клиента: ");
                    String name = scanner.nextLine();
                    System.out.print("Услуга: ");
                    String service = scanner.nextLine();
                    System.out.print("Дата (yyyy-mm-dd): ");
                    String date = scanner.nextLine();
                    System.out.println("Выберите профессию: 1.Врач 2.Парикмахер 3.Юрист");
                    String prof = switch (scanner.nextInt()) {
                        case 1 -> "Врач";
                        case 2 -> "Парикмахер";
                        case 3 -> "Юрист";
                        default -> "Другое";
                    };
                    scanner.nextLine();
                    manager.addAppointment(new Appointment(name, service, date, prof, "Ожидание"));
                }
                case 2 -> manager.showAppointments("ВСЕ");
                case 3 -> {
                    System.out.print("Введите статус (Ожидание / Принята / Отклонена): ");
                    String status = scanner.nextLine();
                    manager.showAppointments(status);
                }
                case 4 -> {
                    System.out.print("ID встречи для принятия: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    manager.updateStatus(id, "Принята");
                }
                case 5 -> {
                    System.out.print("ID встречи для отклонения: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    manager.updateStatus(id, "Отклонена");
                }
                case 6 -> {
                    System.out.print("ID встречи для удаления: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    manager.cancelAppointment(id);
                }
                case 0 -> {
                    System.out.println("Пока, брат!");
                    return;
                }
                default -> System.out.println("Ошибка ввода.");
            }
        }
    }
}