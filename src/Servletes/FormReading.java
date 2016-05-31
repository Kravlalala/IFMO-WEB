package Servletes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 1 on 31.05.2016.
 */
public class FormReading extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String task;
        String var1;
        String var2;
        String operation;
        String a_str;
        String b_str;
        String c_str;
        String array_string = new String();
        String buf = new String();
        int num_of_task;
        int num1;
        int num2;
        int result = 0;
        int a;
        int b;
        int c;
        double disc;
        double x1;
        double x2;
        double min = 0;
        double[][] array = new double[8][5];
        //Num of task
        task = request.getParameter("task");
        num_of_task = Integer.parseInt(task);
        switch (num_of_task) {
            case 0: {
                response.getWriter().println("Hi, friend");
                break;
            }
            case 1: {
                var1 = request.getParameter("num1");
                num1 = Integer.parseInt(var1);
                var2 = request.getParameter("num2");
                num2 = Integer.parseInt(var2);
                operation = request.getParameter("operation");
                if (operation.equals("0")) {
                    result = num1 + num2;
                } else if (operation.equals("1")) {
                    result = num1 - num2;
                } else if (operation.equals("2")) {
                    result = num1 * num2;
                } else {
                    result = num1 / num2;
                }
                response.getWriter().println(result);
                break;
            }
            case 2: {
                var1 = request.getParameter("var1");
                num1 = Integer.parseInt(var1);
                var2 = request.getParameter("var2");
                num2 = Integer.parseInt(var2);
                if (Math.abs(num1 - 10) < Math.abs(num2 - 10)) {
                    result = num1;
                } else {
                    result = num2;
                }
                response.getWriter().println(result);
                break;
            }
            case 3: {
                a_str = request.getParameter("a");
                b_str = request.getParameter("b");
                c_str = request.getParameter("c");
                a = Integer.parseInt(a_str);
                b = Integer.parseInt(b_str);
                c = Integer.parseInt(c_str);
                disc = b * b - 4 * a * c;
                if (disc < 0) {
                    response.getWriter().println("No solutions");
                }
                if (disc > 0) {
                    x1 = (-b - Math.sqrt(disc)) / (2 * a);
                    x2 = (-b + Math.sqrt(disc)) / (2 * a);
                    response.getWriter().println("x1=" + x1 + " ");
                    response.getWriter().println("x2=" + x2 + " ");
                }
                if (disc == 0) {
                    x1 = b / (2 * a);
                    response.getWriter().println(x1);
                }
                break;
            }
            case 4: {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        array[i][j] = Math.random() * 80 + 19;
                    }
                }
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        buf = Double.toString(array[i][j]);
                        array_string += buf;
                        array_string += "  ";
                    }
                }
                response.getWriter().println(array_string);
            }
            break;
            case 5: {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        array[i][j] = Math.random() * 198 - 99;
                    }
                }
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        buf = Double.toString(array[i][j]);
                        array_string += buf;
                        array_string += "  ";
                    }
                }
                min = array[0][0];
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (array[i][j] < min) min = array[i][j];
                    }
                }
                response.getWriter().println(array_string + "\n");
                response.getWriter().println("min= " + min);

            }
            default:
                break;
        }
    }
}
