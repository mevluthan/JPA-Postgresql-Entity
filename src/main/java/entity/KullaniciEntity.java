package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kullanici", schema = "public", catalog = "postgres")
@NamedQuery(name="KullaniciEntity.dbyetki",query = "SELECT e FROM KullaniciEntity e")
public class KullaniciEntity {
    private String dbisim;
    private String dbsoyisim;
    private int dbno;
    private String dbyetki;

    @Override
    public String toString() {
        return "KullaniciEntity{" +
                "dbisim='" + dbisim + '\'' +
                ", dbsoyisim='" + dbsoyisim + '\'' +
                ", dbno=" + dbno +
                ", dbyetki='" + dbyetki + '\'' +
                '}';
    }

    @Basic
    @Column(name = "dbisim")
    public String getDbisim() {
        return dbisim;
    }

    public void setDbisim(String dbisim) {
        this.dbisim = dbisim;
    }

    @Basic
    @Column(name = "dbsoyisim")
    public String getDbsoyisim() {
        return dbsoyisim;
    }

    public void setDbsoyisim(String dbsoyisim) {
        this.dbsoyisim = dbsoyisim;
    }

    @Id
    @Column(name = "dbno")
    public int getDbno() {
        return dbno;
    }

    public void setDbno(int dbno) {
        this.dbno = dbno;
    }

    @Basic
    @Column(name = "dbyetki")
    public String getDbyetki() {
        return dbyetki;
    }

    public void setDbyetki(String dbyetki) {
        this.dbyetki = dbyetki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KullaniciEntity that = (KullaniciEntity) o;
        return dbno == that.dbno && Objects.equals(dbisim, that.dbisim) && Objects.equals(dbsoyisim, that.dbsoyisim) && Objects.equals(dbyetki, that.dbyetki);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbisim, dbsoyisim, dbno, dbyetki);
    }
}
