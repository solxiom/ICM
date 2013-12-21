package com.coderleopard.icmserver.controller;

import com.coderleopard.icmserver.config.SpringMongoConfig;
import com.coderleopard.icmserver.domain.TestUser;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("index");
	}
        @RequestMapping(value="/test")
	public ModelAndView qunit(HttpServletResponse response) throws IOException{
		return new ModelAndView("test");
	}
        
	@RequestMapping(value="/user")
	public @ResponseBody TestUser test2(HttpServletResponse response) throws IOException{
            ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
            MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
            TestUser user = new TestUser("Kavan", "password123");
            mongoOperation.save(user);
            
            user = mongoOperation.findOne(new Query(Criteria.where("username").is("Kavan")), TestUser.class);
            return user;
	}
}
