package cz.pa181.project.dao.ekonomika;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import cz.pa181.project.entity.ekonomika.EkonomikaCenyBytov;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;

/**
 * Class represents:
 * @author xholecko
 */
public class EkonomikaCenyBytovDaoImpl   extends BaseDaoImpl<EkonomikaCenyBytov, Long> implements EkonomikaCenyBytovDao {
    public EkonomikaCenyBytovDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, EkonomikaCenyBytov.class);
    }

    public List<String[]> getPriemernuCenuBytovSorted() throws SQLException {
        LocalDate now = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = now.get(weekFields.weekOfWeekBasedYear()) - 1;

        int maxTyzden = getMaxWeek();
        if (weekNumber > maxTyzden){
            weekNumber = maxTyzden;
        }

        return super.queryBuilder().selectRaw("okres").selectRaw("AVG(\"bytm2\") as bytm2s")
                .groupBy("okres")
                .orderByRaw("bytm2s ASC")
                .where().ge("rok", now.getYear())
                .and().ge("tyzden", weekNumber)
                .queryRaw().getResults();
    }

    @Override
    public String getPriemernuCenuBytovByOkres(String okres) throws SQLException {
        LocalDate now = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = now.get(weekFields.weekOfWeekBasedYear()) - 1;

        return super.queryBuilder().selectRaw("bytm2")
                .where().ge("rok", now.getYear())
                .and().ge("tyzden", weekNumber)
                .and().eq("okres", okres)
                .queryRaw().getResults().get(0)[0];
    }

    private int getMaxWeek() throws SQLException{
        String tmp = super.queryBuilder().selectRaw("MAX(\"tyzden\") as maxTyzden").queryRaw().getResults().get(0)[0];
        return Integer.parseInt(tmp);
    }
}
