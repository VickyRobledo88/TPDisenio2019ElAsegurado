package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Formasdepago;


public class FormasdepagoDaoImp implements FormasdepagoDao  {
    
    private final SessionFactory sessionFactory;

    public FormasdepagoDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Formasdepago buscarPorId (int idFormasdepago){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Formasdepago> query = builder.createQuery(Formasdepago.class);
        Root<Formasdepago> root = query.from(Formasdepago.class);
        query.select(root);
        query.where(builder.equal(root.get("idFormasdepago"), idFormasdepago));
        
        Formasdepago formasdepago = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   formasdepago;
    }

    @Override
    public void guardar(Formasdepago formasdepago) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(formasdepago);
        session.getTransaction().commit();
        session.close();
    }


}