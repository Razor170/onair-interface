package de.artemissys.onair.client.data;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

public class WorkOrder
{
    Pilot Pilot;
    Aircraft Aircraft;
    Timestamp StartTime;
    List<WorkOrderLegs> WorkOrderLegs;
}
