package net.cfrost.web.module.root.rest;

import java.util.List;

import javax.annotation.Resource;

import net.cfrost.web.core.base.entity.RetResult;
import net.cfrost.web.core.base.rest.BaseRest;
import net.cfrost.web.core.security.authentication.entity.User;
import net.cfrost.web.core.security.authentication.service.IUserService;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class RootRest extends BaseRest {
    
    @Resource
    private IUserService userService;    
    
    @RequestMapping(value = { "/createUser" }, method = RequestMethod.POST)
    public String createUser(@ModelAttribute( "user" ) User user){
        this.userService.createUser(user.getUsername(), user.getPassword());
        return "/root/login";
    }
    
    @ResponseBody
    @RequestMapping(value = { "/getUser/all" }, method = RequestMethod.GET)
    public RetResult<User> getUserAll(){
        List<User> allUsers = this.userService.findAllUsers(true);
        RetResult<User> ret = new RetResult<User>(allUsers);
        ret.setReturnFlag(RetResult.SUCCESS);
        return ret;
    }
    
    @ResponseBody
    @RequestMapping(value = { "/getUser/current" }, method = RequestMethod.GET)
    public RetResult<User> getUserCurrent(@AuthenticationPrincipal User user){
        RetResult<User> ret = new RetResult<User>(user);
        ret.setReturnFlag(RetResult.SUCCESS);
        return ret;
    }
}
