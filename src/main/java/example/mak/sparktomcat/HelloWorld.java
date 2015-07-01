package example.mak.sparktomcat;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		Spark.get(new Route("/") {
			
			@Override
			public Object handle(Request request, Response response) {
				// TODO Auto-generated method stub
				return "Spark Tomcat HelloWorld!";
			}
		});
		
		Spark.get(new Route("/mak") {
			
			@Override
			public Object handle(Request request, Response response) {
				// TODO Auto-generated method stub
				return "Hello Mak!";
			}
		});
		
	}

}
