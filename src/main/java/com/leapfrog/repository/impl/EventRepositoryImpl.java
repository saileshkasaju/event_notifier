package com.leapfrog.repository.impl;

import com.leapfrog.model.Event;
import com.leapfrog.repository.EventRepository;
import com.leapfrog.repository.util.EventRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge on 5/10/2017.
 */

@Repository("eventRepository")
public class EventRepositoryImpl implements EventRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Event createEvent(Event event) {
//        jdbcTemplate.update("INSERT INTO event (title, destination, alert_date, start_date, end_date, invite, status, user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", event.getTitle(), event.getDestination(), event.getAlertDate(), event.getStartDate(), event.getEndDate(), event.isInvite(), event.isStatus(), event.getUser().getId());

//        return null;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("INSERT INTO event (title, destination, alert_date, start_date, end_date, invite, status, user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new String [] {"id"});
                ps.setString(1, event.getTitle());
                ps.setString(2, event.getDestination());
                ps.setDate(3, event.getAlertDate());
                ps.setDate(4, event.getStartDate());
                ps.setDate(5, event.getEndDate());
                ps.setBoolean(6, event.isInvite());
                ps.setBoolean(7, event.isStatus());
                ps.setInt(8, event.getUser().getId());
                return ps;
            }
        }, keyHolder);
        Number id = keyHolder.getKey();
        return getEvent(id.intValue());
    }

    public Event getEvent(int id) {
        Event event = (Event) jdbcTemplate.queryForObject("select * from event where id = ?", new EventRowMapper(), id);
        return event;
    }
    @Override
    public List<Event> findAll() {
        List<Event> events = jdbcTemplate.query("select * from event", new EventRowMapper());
        return events;
    }

}
