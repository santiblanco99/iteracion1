/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author sa.yepes
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.uniandes.sistrans.iteracion1.resources.ClienteResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.HabitacionResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.HostalResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.HotelResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.OperadorResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.PersonaNaturalResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.ViviendaExcepcionalResource.class);
        resources.add(co.uniandes.sistrans.iteracion1.resources.ViviendaUniversitariaResource.class);
    }
    
}
