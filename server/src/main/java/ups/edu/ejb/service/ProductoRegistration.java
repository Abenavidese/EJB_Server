package ups.edu.ejb.service;


import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ups.edu.ejb.model.Producto;

@Stateless
public class ProductoRegistration implements ProductoRegistrationLocal, ProductoRegistrationRemote {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void register(Producto producto) {
        em.persist(producto);
    }
}

