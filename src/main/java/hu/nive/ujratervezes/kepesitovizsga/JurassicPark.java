package hu.nive.ujratervezes.kepesitovizsga;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public List<String> checkOverpopulation(){

        List<String> returnList = new ArrayList<>();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT breed FROM dinosaur WHERE actual > expected");
            )
        {
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    returnList.add(rs.getString(1));
                }
        }
        catch (SQLException se) {
            throw new IllegalStateException(se);
        }

        Collections.sort(returnList);

        return returnList;

    }

}
