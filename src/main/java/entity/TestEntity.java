package entity;

import javax.persistence.*;

public class TestEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        //SELECT e FROM Todo WHERE e.dept.name='Java Advocacy'
        //SELECT e FROM KullaniciEntity e WHERE e.dbisim='asd'
        //SELECT e FROM KullaniciEntity e
        try {
                transaction.begin();
//                KullaniciEntity yeni=new KullaniciEntity();
//                yeni.setDbisim("yeni");
//                yeni.setDbsoyisim("kullanici");
//                yeni.setDbno(25);
//                yeni.setDbyetki("hayir");
//                entityManager.persist(yeni);
                transaction.commit();
                TypedQuery<KullaniciEntity> kullaniciEntityTypedQuery=entityManager.createNamedQuery("KullaniciEntity.dbyetki",KullaniciEntity.class);
                for (KullaniciEntity kullaniciEntity:kullaniciEntityTypedQuery.getResultList()){
                    System.out.println(kullaniciEntity);
                }

        }finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
