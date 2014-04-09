package pl.btbw.web.controller;

import pl.btbw.web.service.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloController {

    @Inject
    private HelloService helloService;

    @GET
    public HelloDto doHello() {
        return new HelloDto(helloService.getT());
    }
}
