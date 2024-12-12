package ups.edu.ejb.service;

import jakarta.ejb.Local;
import ups.edu.ejb.model.Producto;

@Local
public interface ProductoRegistrationLocal {
    void register(Producto producto);
}
