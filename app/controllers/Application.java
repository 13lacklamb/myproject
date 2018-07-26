package controllers;

import models.*;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    // public static String id,name;

    public static pro sale1;
    public static pro sale2;
    public static pro sale3;
    public static pro sale4;
    public static pro sale5;
    public static pro sale6;

    public static Result index() {

        sale1 = new pro();
        sale1.setId("P001");
        sale1.setName("Pilot");
        sale1.setBrand("Pilot");
        sale1.setPrice(300000);
        sale1.setCount(20);


        sale2 = new pro();
        sale2.setId("P002");
        sale2.setName("G-Soft");
        sale2.setBrand("G-Soft");
        sale2.setPrice(300000);
        sale2.setCount(20);


        sale3 = new pro();
        sale3.setId("P003");
        sale3.setName("Lamy");
        sale3.setBrand("Lamy");
        sale3.setPrice(300000);
        sale3.setCount(20);


        sale4 = new pro();
        sale4.setId("P004");
        sale4.setName("Zebra");
        sale4.setBrand("Zebra");
        sale4.setPrice(300000);
        sale4.setCount(20);


        sale5 = new pro();
        sale5.setId("P005");
        sale5.setName("The Dog");
        sale5.setBrand("The Dog");
        sale5.setPrice(300000);
        sale5.setCount(20);


        sale6 = new pro();
        sale6.setId("P006");
        sale6.setName("Faber Castell");
        sale6.setBrand("Faber Castell");
        sale6.setPrice(300000);
        sale6.setCount(20);
        return ok(index.render(sale1,sale2,sale3,sale4,sale5,sale6));

    }

}