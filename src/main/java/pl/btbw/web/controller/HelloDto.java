package pl.btbw.web.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloDto {

    @XmlElement
    private String message;

    public HelloDto() {
    }

    public HelloDto(String message) {
        this.message = message;
    }
}
