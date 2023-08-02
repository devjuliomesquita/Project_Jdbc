package com.projectcleancode.jdbc.infrastructure.persistence.configurations.map;

import com.projectcleancode.jdbc.domain.model.Actor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ActorRowMapper implements RowMapper<Actor> {
    @Override
    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Actor(
                rs.getLong("id"),
                rs.getString("name")
        );
    }
}
