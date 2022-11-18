package controller;

import view.Login;
import java.io.IOException;
import model.Slack;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;

public class App {

    public static void main(String[] args) {
        Login log = new Login();
        log.login();
    }
}
