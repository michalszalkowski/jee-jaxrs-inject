package pl.btbw.web.service;

import javax.ejb.Stateless;

@Stateless
public class HelloService {

    public String getT() {
        return "Hello lorem ipsum !";
    }

}
