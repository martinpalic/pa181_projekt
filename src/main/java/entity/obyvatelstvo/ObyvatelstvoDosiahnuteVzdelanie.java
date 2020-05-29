package entity.obyvatelstvo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import dao.obyvatelstvo.ObyvatelstvoDosiahnuteVzdelanieDaoImpl;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Class represents: POČET OBYVATEĽOV PODĽA NAJVYŠŠIEHO DOSIAHNUTÉHO VZDELANIA V ZÁKLADNÝCH SÍDELNÝCH JEDNOTKÁCH - ANONYMIZOVANÉ
 * https://opendata.bratislava.sk/dataset/show/pocet-obyvatelov-podla-najvyssieho-dosiahnuteho-vzdelania-v-zakladnych-sidelnych-jednotkach-anonymizovane
 * @author xholecko
 */
@Getter
@Setter
@DatabaseTable(tableName = "obyvatelstvo_dosiahnute-vzdelanie", daoClass = ObyvatelstvoDosiahnuteVzdelanieDaoImpl.class)
public class ObyvatelstvoDosiahnuteVzdelanie {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(canBeNull = false)
    private String okres;

    @DatabaseField(canBeNull = false)
    private String mestskaCast;

    @DatabaseField(canBeNull = false)
    private String ulica;

    @DatabaseField(canBeNull = false)
    private String pocetBakalarske;

    @DatabaseField(canBeNull = false)
    private String pocetMgrIngDoctor;

    @DatabaseField(canBeNull = false)
    private String pocetDoktorand;

    @DatabaseField(canBeNull = false)
    private String pocetSpolu;

    public ObyvatelstvoDosiahnuteVzdelanie(String okres, String mestskaCast, String ulica, String pocetBakalarske, String pocetMgrIngDoctor, String pocetDoktorand, String pocetSpolu) {
        this.okres = okres;
        this.mestskaCast = mestskaCast;
        this.ulica = ulica;
        this.pocetBakalarske = pocetBakalarske;
        this.pocetMgrIngDoctor = pocetMgrIngDoctor;
        this.pocetDoktorand = pocetDoktorand;
        this.pocetSpolu = pocetSpolu;
    }

    public ObyvatelstvoDosiahnuteVzdelanie() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObyvatelstvoDosiahnuteVzdelanie that = (ObyvatelstvoDosiahnuteVzdelanie) o;
        return getOkres().equals(that.getOkres()) &&
                getMestskaCast().equals(that.getMestskaCast()) &&
                getUlica().equals(that.getUlica()) &&
                getPocetBakalarske().equals(that.getPocetBakalarske()) &&
                getPocetMgrIngDoctor().equals(that.getPocetMgrIngDoctor()) &&
                getPocetDoktorand().equals(that.getPocetDoktorand()) &&
                getPocetSpolu().equals(that.getPocetSpolu());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOkres(), getMestskaCast(), getUlica(), getPocetBakalarske(), getPocetMgrIngDoctor(), getPocetDoktorand(), getPocetSpolu());
    }

    @Override
    public String toString() {
        return "ObyvatelstvoDosiahnuteVzdelanie{" +
                "id=" + id +
                ", okres='" + okres + '\'' +
                ", mestskaCast='" + mestskaCast + '\'' +
                ", ulica='" + ulica + '\'' +
                ", pocetBakalarske='" + pocetBakalarske + '\'' +
                ", pocetMgrIngDoctor='" + pocetMgrIngDoctor + '\'' +
                ", pocetDoktorand='" + pocetDoktorand + '\'' +
                ", pocetSpolu='" + pocetSpolu + '\'' +
                '}';
    }
}
