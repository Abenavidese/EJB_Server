package ups.edu.ejb.service;

import jakarta.ejb.Remote;
import ups.edu.ejb.model.Producto;

@Remote
public interface ProductoRegistrationRemote {
    void register(Producto producto);
}
