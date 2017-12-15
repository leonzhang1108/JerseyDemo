package com.leon;

import com.leon.entity.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: jianliangzhang
 * Date: 2017/12/15
 * Time: 14:45
 */
@Path("/user")
public class HelloWorld {

    @GET
    @Path("/showUser")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello() {
        List<Student> lists = new ArrayList<Student>();
        lists.add(new Student("1", "mayun", 23));
        lists.add(new Student("2", "mahuateng", 24));
        lists.add(new Student("3", "zhouhongyi", 25));
        return Response.status(Response.Status.OK).entity(lists).build();
    }

    @GET
    @Path("/{param}")
    @Produces("text/plain;charset=UTF-8")
    public String sayHelloToUTF8(@PathParam("param") String username) {
        return "Hello " + username;
    }

}
