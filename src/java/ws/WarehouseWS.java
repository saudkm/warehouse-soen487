/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.OnTransit;
import model.Warehouse;

/**
 *
 * @author Dell_SKM
 */
@WebService(serviceName = "WarehouseWS")
@Stateless()
public class WarehouseWS {
    @PersistenceContext(unitName = "soen487-warehouse-pu")
    private EntityManager em;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "order")
    public Integer order(@WebParam(name = "type") final String type, @WebParam(name = "amount") final Integer amount) {
        OnTransit transit = new OnTransit();
        transit.setAmount(amount);
        transit.setDate(new BigInteger(String.valueOf((System.currentTimeMillis()/1000))));
        
        transit.setType(type);
        transit.setZip(Warehouse.getInstance().getZip());
        this.persist(transit);
        
        return transit.getAmount();
        
        
    }

    public void persist(Object object) {
        em.persist(object);
    }
    
}
