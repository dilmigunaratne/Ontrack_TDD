package com.ontrack;

import java.time.LocalDate;

public class TaskReminder {
    public static String getReminder(String studentId, String taskTitle, LocalDate dueDate) {
        LocalDate currentDate = LocalDate.now();
        if (dueDate.isBefore(currentDate)) {
            return "Overdue: Your task '" + taskTitle + "' is overdue.";
        } else if (dueDate.isEqual(currentDate) || dueDate.minusDays(2).isBefore(currentDate)) {
            return "Reminder: Your task '" + taskTitle + "' is due soon.";
        } else {
            return "No notification.";
        }
    }
}
