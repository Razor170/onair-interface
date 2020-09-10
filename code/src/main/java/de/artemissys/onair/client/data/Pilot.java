package de.artemissys.onair.client.data;

import java.sql.Timestamp;
import java.util.List;

public class Pilot
{
    String FirstName;
    String LastName;
    //TODO: Status Status;  // Maybe String? or Enum
    Timestamp Until;
    String Position;
    String Base;
    Double SalaryPerWeek;
    Double SalaryPerHour;
    List<AircraftType> licens;
}
