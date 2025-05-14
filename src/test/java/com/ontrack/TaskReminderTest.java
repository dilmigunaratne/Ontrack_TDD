package com.ontrack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TaskReminderTest {

    @Test
    public void testReminderForUpcomingTask() {
        String result = TaskReminder.getReminder("12345", "Math Assignment", LocalDate.now().plusDays(1));
        assertEquals("Reminder: Your task 'Math Assignment' is due soon.", result);
    }

    @Test
    public void testReminderForOverdueTask() {
        String result = TaskReminder.getReminder("12345", "Math Assignment", LocalDate.now().minusDays(1));
        assertEquals("Overdue: Your task 'Math Assignment' is overdue.", result);
    }

    @Test
    public void testNoReminder() {
        String result = TaskReminder.getReminder("12345", "Math Assignment", LocalDate.now().plusDays(5));
        assertEquals("No notification.", result);
    }
}
