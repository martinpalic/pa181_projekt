package dao.kultura;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import entity.kultura.KulturaPamatihodnosti;

import java.sql.SQLException;
/**
 * Class represents:
 * @author xholecko
 */
public class KulturaPamatihodnostiDaoImpl extends BaseDaoImpl<KulturaPamatihodnosti, Long> implements KulturaPamatihodnostiDao {
    public KulturaPamatihodnostiDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, KulturaPamatihodnosti.class);
    }
}