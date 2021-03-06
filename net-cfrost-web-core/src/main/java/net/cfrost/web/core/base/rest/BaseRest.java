package net.cfrost.web.core.base.rest;

import javax.servlet.http.HttpServletRequest;

import net.cfrost.web.core.base.controller.BaseController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract class BaseRest extends BaseController {
    
    @Override
    @ResponseBody
    @RequestMapping(value={"", "/", "index"},method=RequestMethod.GET)
    public String index(HttpServletRequest request) {
        return null;
    }
    
}
