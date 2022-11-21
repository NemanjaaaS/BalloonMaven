package Server;

import org.example.SolutionAll;
import org.example.writeInFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;

@WebServlet("/Server")
@MultipartConfig

public class Server extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");

        String filename = "src/main/java/files/searchStrings.txt";
        String recname = "src/main/java/files/rec.txt";
        ServletContext context = getServletContext();

        InputStream is = context.getResourceAsStream(filename);

        InputStream is2 = context.getResourceAsStream(recname);


        if(is != null){
            InputStreamReader isr = new InputStreamReader(is);
            InputStreamReader isr2 = new InputStreamReader(is2);
            BufferedReader reader = new BufferedReader(isr);
            BufferedReader reader2 = new BufferedReader(isr2);
            PrintWriter writer = response.getWriter();
            String text;
            String rec = reader2.readLine();


            while((text = reader.readLine())!= null){
                SolutionAll solutionAll = new SolutionAll(text,rec);
                writer.println("WORD "+rec+"is "+solutionAll.solution(text,rec)+" times in word "+text);
            }



        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");

        String filename = "src/main/java/files/searchStrings.txt";
        String recname = "src/main/java/files/rec.txt";
        String fileresult = "src/main/java/files/results.txt";
        ServletContext context = getServletContext();

        InputStream is = context.getResourceAsStream(filename);

        InputStream is2 = context.getResourceAsStream(recname);


        if(is != null){
            InputStreamReader isr = new InputStreamReader(is);
            InputStreamReader isr2 = new InputStreamReader(is2);
            BufferedReader reader = new BufferedReader(isr);
            BufferedReader reader2 = new BufferedReader(isr2);
            PrintWriter writer = response.getWriter();
            String text = reader.readLine();
            String rec = reader2.readLine();

            PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileresult,true));


            while(text!= null){
                SolutionAll solutionAll = new SolutionAll(text,rec);
                writer.println("WORD "+rec+"is "+solutionAll.solution(text,rec)+" times in word "+text);
                fileWriter.println(solutionAll.solution(text,rec));

            }
            fileWriter.close();
            reader2.close();
            reader.close();

        }

    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        String filename = "src/main/java/files/searchStrings.txt";
        String recname = "src/main/java/files/rec.txt";
        String fileresult = "src/main/java/files/results.txt";
        ServletContext context = getServletContext();

        InputStream is = context.getResourceAsStream(filename);

        InputStream is2 = context.getResourceAsStream(recname);


        if(is != null){
            InputStreamReader isr = new InputStreamReader(is);
            InputStreamReader isr2 = new InputStreamReader(is2);
            BufferedReader reader = new BufferedReader(isr);
            BufferedReader reader2 = new BufferedReader(isr2);
            PrintWriter writer = response.getWriter();
            String text = reader.readLine();
            String rec = reader2.readLine();

            PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileresult,false));


            while(text!= null){
                SolutionAll solutionAll = new SolutionAll(text,rec);
                writer.println("WORD "+rec+"is "+solutionAll.solution(text,rec)+" times in word "+text);
                fileWriter.println(solutionAll.solution(text,rec));

            }
            fileWriter.close();
            reader2.close();
            reader.close();

        }

    }
}




   // public void doPost()

