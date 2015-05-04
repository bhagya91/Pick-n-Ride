package com.picknride.WebApp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@Path("db")
public class Database extends Application{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String checkMon() throws Exception{
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB picknride = mongo.getDB("picknride");
		DBCollection table = picknride.getCollection("passengers");
		
		BasicDBObject search = new BasicDBObject();
		search.put("_id", "222");
		
		List<DBObject> cursor = table.find(search).toArray();
		String myList= null;
		myList = cursor.toString();
		
		return myList;
	}
}
