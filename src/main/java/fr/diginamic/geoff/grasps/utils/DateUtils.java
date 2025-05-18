package fr.diginamic.geoff.grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils
{
    /**
     * Transforme une date au format String en {@link LocalDateTime}
     * @param dateStr date au format String
     * @return LocalDateTime
     */
    public static LocalDateTime stringToLocalDateTime(String dateStr)
    {
        //formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        return LocalDateTime.parse(dateStr, formatter);
    }
}
