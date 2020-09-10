package de.artemissys.onair.client.data;

import java.sql.Timestamp;
import java.util.List;

public class Jobs
{
    Integer LegCount;
    String Description;
    Integer Heading;
    Integer Distance;
    Integer Cargo;
    Integer Pax;
    Integer Lbs;
    Integer MinimumAirport;
    Timestamp Expires;
    Integer Experience;
    Double Penalty;
    Double Pay;
    Boolean Player;
    List<Legs> Legs;
}
