package com.coderleopard.icmserver.repository;

import com.coderleopard.icmserver.config.SpringMongoConfig;
import com.coderleopard.icmserver.domain.TestUser;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


//import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// For XML
		//ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");

		// For Annotation
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

		TestUser user = new TestUser("Kavan", "password123");

		// save
		mongoOperation.save(user);

		// now user object got the created id.
		System.out.println("1. user : " + user);

		// query to search user
		Query searchUserQuery = new Query(Criteria.where("username").is("Kavan"));

		// find the saved user again.
		TestUser savedUser = mongoOperation.findOne(searchUserQuery, TestUser.class);
		System.out.println("2. find - savedUser : " + savedUser);

		// update password
		mongoOperation.updateFirst(searchUserQuery, Update.update("password", "new password"),
				TestUser.class);

		// find the updated user object
		TestUser updatedUser = mongoOperation.findOne(
				new Query(Criteria.where("username").is("Kavan")), TestUser.class);

		System.out.println("3. updatedUser : " + updatedUser);

		// delete
		mongoOperation.remove(searchUserQuery, TestUser.class);

		// List, it should be empty now.
		List<TestUser> listUser = mongoOperation.findAll(TestUser.class);
		System.out.println("4. Number of user = " + listUser.size());

	}

}