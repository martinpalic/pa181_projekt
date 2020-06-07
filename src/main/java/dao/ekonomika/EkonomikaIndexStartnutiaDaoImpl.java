package dao.ekonomika;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import entity.ekonomika.EkonomikaIndexStartnutia;

import java.sql.SQLException;
import java.util.List;

/**
 * Class represents:
 * @author xholecko
 */
public class EkonomikaIndexStartnutiaDaoImpl  extends BaseDaoImpl<EkonomikaIndexStartnutia, Long> implements EkonomikaIndexStartnutiaDao {
    public EkonomikaIndexStartnutiaDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, EkonomikaIndexStartnutia.class);
    }

    @Override
    public List<String[]> getIndexStarnutiaByOkres(int rok) throws SQLException{
        return super.queryBuilder().selectRaw("okres").selectRaw("AVG (indexStarnutia) as indexStarnutias")
                .groupBy("okres")
                .orderByRaw("indexStarnutias")
                .where().ge("rok",rok)
                .queryRaw().getResults();
    }
}
