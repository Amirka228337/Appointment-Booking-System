public class Appointment {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String service;
    private String date;
    private String profession;
    private String status;

    public Appointment(String name, String service, String date, String profession, String status) {
        this.id = idCounter++;
        this.name = name;
        this.service = service;
        this.date = date;
        this.profession = profession;
        this.status = status;
    }

    public Appointment(int id, String name, String service, String date, String profession, String status) {
        this.id = id;
        this.name = name;
        this.service = service;
        this.date = date;
        this.profession = profession;
        this.status = status;
        if (id >= idCounter) idCounter = id + 1;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getService() { return service; }
    public String getDate() { return date; }
    public String getProfession() { return profession; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return id + "," + name + "," + service + "," + date + "," + profession + "," + status;
    }

    public static Appointment fromCSV(String line) {
        String[] parts = line.split(",");
        return new Appointment(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3], parts[4], parts[5]);
    }
}