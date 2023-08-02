package com.projectcleancode.jdbc.infrastructure.persistence.configurations.map;

import com.projectcleancode.jdbc.domain.model.Movie;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class MovieRowMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Movie(
                rs.getLong("id"),
                rs.getString("name"),
                LocalDateTime.parse(rs.getString("realise_date")),
                List.of()
                );
    }
}
