import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;


public class RandomController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");
        Student student = new Student();

        get("/", (req, res) -> {
            ArrayList<String> result = student.getStudent();
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            model.put("result", result);
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/one", (req, res) -> {
            String result = student.getRandomStudent();
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            model.put("result", result);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            ArrayList<String> result = student.getTwoStudents();
            String randomStudent1 = result.get(0);
            String randomStudent2 = result.get(1);
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            model.put("randomStudent1", randomStudent1);
            model.put("randomStudent2", randomStudent2);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }


}





