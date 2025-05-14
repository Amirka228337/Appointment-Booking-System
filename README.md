
# Appointment Booking System

## 📌 Overview

**Title:** Appointment Booking System  
**Author:** Amir Rozybaev

A Java console-based application that allows users to manage appointment bookings for various professionals. Users can schedule, accept, and cancel appointments. Appointments are uniquely identified and categorized by status.

---

## 🎯 Features

- 📅 Add Appointment: Book a new appointment with name, profession, and date.
- ✅ Accept Appointment: Approve and move an appointment to accepted.
- ❌ Cancel Appointment: Cancel and move appointment to cancelled.
- 🚫 No Duplicates: Prevents creating appointments with the same name.
- 🔍 View by Status: Appointments grouped as Pending, Accepted, or Cancelled.
- 👨‍⚕️ Choose Profession: Select from available professions (e.g., Doctor, Lawyer, etc.).

---

## 🧠 Data Model

Each appointment includes:
- Unique ID (int)
- Name (String)
- Profession (String)
- Date (String)
- Status (String) [Pending, Accepted, Cancelled]

---

## 🖥️ How It Works

```
Main.java — Entry point for the system
Appointment.java — Appointment object definition
AppointmentManager.java — Logic for adding, updating, listing appointments
```

---

## ✅ Sample Output

### ➕ Add Appointment

```
Enter name: Aijan
Choose profession: Doctor
Enter date (yyyy-mm-dd): 2025-05-15
Appointment booked.
```

### ❌ Cancel Appointment

```
Enter ID to cancel: 1
Appointment cancelled.
```

### ✅ Accept Appointment

```
Enter ID to accept: 2
Appointment accepted.
```

### 📋 View Appointments by Status

```
--- Pending Appointments ---
ID: 3 | Name: Timur | Profession: Barber | Date: 2025-05-18

--- Accepted Appointments ---
ID: 2 | Name: Armen | Profession: Lawyer | Date: 2025-05-17

--- Cancelled Appointments ---
ID: 1 | Name: Aijan | Profession: Doctor | Date: 2025-05-15
```

---

## 🛠 Requirements

- Java 8+

---

## 📦 Run Instructions

1. Compile:
```
javac *.java
```

2. Run:
```
java Main
```

---

## 🙌 Thanks!

Made by Amir Rozybaev. For questions or suggestions — feel free to reach out.
