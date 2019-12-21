import ui.User;

public class Injector {


    public Injector() {
        Container container = new Container();

        Controller_user controller_user = new Controller_user();
        Controller_seller controller_seller = new Controller_seller();
        Controller_visitor controller_visitor = new Controller_visitor();
        Controller_attraction controller_attraction= new Controller_attraction();


        User_ui user_ui = new User_ui(controller_user);
        Seller_ui seller_ui = new Seller_ui(controller_seller);
        Visitor_ui visitor_ui = new Visitor_ui(controller_visitor);
        Attraction_ui attraction_ui = new Attraction_ui(controller_attraction);

        container.controller_user = controller_user;
        container.user_ui = user_ui;
        container.controller_seller = controller_seller;
        container.seller_ui = seller_ui;
        container.controller_visitor = controller_visitor;
        container.visitor_ui = visitor_ui;
        container.attraction_ui = attraction_ui;
        container.attraction_ui = attraction_ui;

        Visitor visitor = new Visitor();

        Shop shop = new Shop();

        Order order = new Order();

        Responsible_attraction responsible_attraction = new Responsible_attraction();

        User user_ui1 = new User();
        user_ui1.createUI();
    }
}