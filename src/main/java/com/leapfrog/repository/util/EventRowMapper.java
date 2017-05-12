package com.leapfrog.repository.util;

import com.leapfrog.model.Event;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Edge on 5/12/2017.
 */
public class EventRowMapper implements RowMapper {
    @Override
    public Event mapRow(ResultSet resultSet, int i) throws SQLException {
        Event event = new Event();
        event.setStatus(resultSet.getBoolean("status"));
        event.setTitle(resultSet.getString("title"));
        event.setStartDate(resultSet.getDate("start_date"));
        event.setEndDate(resultSet.getDate("end_date"));
        event.setAlertDate(resultSet.getDate("alert_date"));
        event.setInvite(resultSet.getBoolean("invite"));
        event.setDestination(resultSet.getString("destination"));
        return event;
    }
}
