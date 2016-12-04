/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.jr.simple;

/**
 *
 * @author vasil
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DAOStub {

    private JdbcTemplate jdЬcTemplate;
    //private DataSource dataSource;

    public List<DataBean> getDataBeanList() {
        List<DataBean> dataBeanList = new ArrayList<>();

        try {

            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            dataSource.setDriverClass(org.postgresql.Driver.class);
            dataSource.setUsername("postgres");
            dataSource.setUrl("jdbc:postgresql://localhost:5432/billing_calc");
            dataSource.setPassword("123");

            jdЬcTemplate = new JdbcTemplate(dataSource);

            return this.jdЬcTemplate.query("SELECT t.id, t.f_date, t.f_price  FROM t_calc t ORDER BY t.id",
                    (ResultSet rs, int rowNum) -> new DataBean(rs.getString("id"),
                            rs.getString("f_date"),
                            rs.getInt("f_price")
                    ));
        } catch (DataAccessException e) {
            return null;
        }
    }

}
