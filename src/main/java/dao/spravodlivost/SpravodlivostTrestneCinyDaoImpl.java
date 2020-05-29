package dao.spravodlivost;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import entity.spravodlivost.SpravodlivostTrestneCiny;

import java.sql.SQLException;
/**
 * Class represents:
 * @author xholecko
 */
public class SpravodlivostTrestneCinyDaoImpl extends BaseDaoImpl<SpravodlivostTrestneCiny, Long> implements SpravodlivostTrestneCinyDao {
    public SpravodlivostTrestneCinyDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, SpravodlivostTrestneCiny.class);
    }
}