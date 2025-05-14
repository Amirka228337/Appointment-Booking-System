
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
Main.java — Точка входа в приложение
Appointment.java — Определение объекта встречи
AppointmentManager.java — Логика добавления, обновления и отображения встреч
```

---

## ✅ Sample Output

### ➕ Add Appointment

```
Введите имя: Айжан
Выберите профессию: Врач
Введите дату (гггг-мм-дд): 2025-05-15
Встреча успешно забронирована.
```

### ❌ Cancel Appointment

```
Введите ID для отмены: 1
Встреча отменена.
```

### ✅ Accept Appointment

```
Введите ID для подтверждения: 2
Встреча подтверждена.
```

### 📋 View Appointments by Status

```
--- Ожидающие встречи ---
ID: 3 | Имя: Тимур | Профессия: Парикмахер | Дата: 2025-05-18

--- Принятые встречи ---
ID: 2 | Имя: Армен | Профессия: Юрист | Дата: 2025-05-17

--- Отменённые встречи ---
ID: 1 | Имя: Айжан | Профессия: Врач | Дата: 2025-05-15
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
