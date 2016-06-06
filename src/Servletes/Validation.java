package Servletes;

import Exceptions.ByteStrException;
import Exceptions.MailException;
import Exceptions.NumberException;
import Exceptions.PasswordException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 1 on 06.06.2016.
 */
public class Validation extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean result = true;
        int number;
        Matcher matcher;
        String email=new String();
        String password=new String();
        String str_number=new String();
        String byte_string=new String();
        char symbol;
        String email_pattern_str = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern email_pattern= Pattern.compile(email_pattern_str);
        Pattern hasUppercase = Pattern.compile("[A-Z]");
        Pattern hasLowercase = Pattern.compile("[a-z]");
        Pattern hasNumber = Pattern.compile("\\d");
        Pattern hasSpecialChar = Pattern.compile("[^a-zA-Z0-9 ]");
        String str_task=request.getParameter("task");
        int num_of_task = Integer.parseInt(str_task);
        switch (num_of_task){
            case 1:{
                try {
                    email = request.getParameter("email");
                    if (email.isEmpty()) throw new MailException("Email field is empty");
                    if (email_pattern.matcher(email).find()==false) throw new MailException("Invalid email address");
                    else response.getWriter().println("Your email address is correct");
                }
                catch(MailException e){
                    response.getWriter().println(e.getMessage());
                }
                break;
            }
            case 2:{
                password=request.getParameter("password");
                try {
                    if (password.isEmpty())
                        throw new PasswordException("Password field is empty");
                    if (hasUppercase.matcher(password).find() == false)
                        throw new PasswordException("Password needs an upper case");
                    if (hasLowercase.matcher(password).find() == false)
                        throw new PasswordException("Password needs a lowercase");
                    if (hasNumber.matcher(password).find() == false)
                        throw new PasswordException("Password needs a number");
                    if (hasSpecialChar.matcher(password).find() == false)
                        throw new PasswordException("Password needs a special character");
                    response.getWriter().println("Your password is correct");
                }
                catch (PasswordException e){
                    response.getWriter().println(e.getMessage());
                }
                break;
            }
            case 3:{
                byte_string=request.getParameter("byte_string");
                try{
                    if(byte_string.isEmpty()) throw new ByteStrException("Byte string field is empty");
                    for (int i = 0; i < byte_string.length(); i++) {
                        symbol = byte_string.charAt(i);
                        if (symbol=='0'||symbol=='1')continue;
                        else throw new ByteStrException("Invalid byte string");
                    }
                    response.getWriter().println("Your number is correct");
                }
                catch(ByteStrException e){
                    response.getWriter().println(e.getMessage());
                }
                break;
            }
            case 4:{
                str_number=request.getParameter("number");
                try {
                    if (str_number.isEmpty()) throw new NumberException("Number field is empty");
                    for (int i = 0; i < str_number.length(); i++) {
                        symbol = str_number.charAt(i);
                        if (symbol > 47 && symbol < 58) continue;
                        else throw new NumberException("Invalid number");
                    }
                    response.getWriter().println("Your number is correct");
                }
                catch(NumberException e){
                    response.getWriter().println(e.getMessage());
                }
                break;
            }
            default:{
                break;
            }
        }
    }
}
