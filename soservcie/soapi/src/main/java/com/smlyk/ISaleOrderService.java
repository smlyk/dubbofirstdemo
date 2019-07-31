package com.smlyk;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author yekai
 */
@Path("order")
public interface ISaleOrderService {

    @GET
    @Path("list")
    @Produces({MediaType.APPLICATION_JSON})
    List getSaleOrderList();

}
