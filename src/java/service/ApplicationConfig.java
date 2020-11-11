package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author DANIELLEGONCALVESPRA
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.EventoServico.class);
        resources.add(service.NotificacaoServico.class);
        resources.add(service.PostServico.class);
        resources.add(service.UsuarioServico.class);
    }
}
