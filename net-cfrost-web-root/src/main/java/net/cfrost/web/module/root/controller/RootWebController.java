package net.cfrost.web.module.root.controller;

import net.eulerform.web.core.annotation.WebController;
import net.eulerform.web.core.base.controller.web.BaseController;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@WebController
@Scope("prototype")
@RequestMapping("/")
public class RootWebController extends BaseController {
    
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "/about/index";
    }

    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public String login()
    {
        return "/root/login";
    }
}