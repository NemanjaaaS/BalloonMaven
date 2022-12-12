package Server;

import org.example.SolutionAll;
<<<<<<< HEAD

=======
>>>>>>> e63d4eb2d0e8a6cd6036b100ea28555314442ef2
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;


@WebServlet("/Server")


public class Server extends HttpServlet{

    ArrayList<Integer> arr = new ArrayList<>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();

        File file = new File("BalloonMaven/src/main/java/files/searchStrings.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;

        File recFile = new File("BalloonMaven/src/main/java/files/rec.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(recFile));
        String rec = br2.readLine();


        while ((str= br.readLine())!= null){
            SolutionAll solutionAll = new SolutionAll(str,rec);
            writer.println(str);
            writer.println(solutionAll.solution(str,rec));
            arr.add(solutionAll.solution(str,rec));

        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        String filePath ="C:\\Users\\nstefanovic\\IdeaProjects\\BalloonMaven\\src\\main\\java\\files\\results.txt";
        File file = new File("C:\\Users\\nstefanovic\\IdeaProjects\\BalloonMaven\\src\\main\\java\\files\\searchStrings.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;

        File recFile = new File("C:\\Users\\nstefanovic\\IdeaProjects\\BalloonMaven\\src\\main\\java\\files\\rec.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(recFile));
        String rec = br2.readLine();

        BufferedWriter fw = new BufferedWriter(new FileWriter(filePath));

        while ((str= br.readLine())!= null){
            SolutionAll solutionAll = new SolutionAll(str,rec);
            int res = solutionAll.solution(str,rec);
            writer.println(res);

            fw.write("" + res + "\n");

        }
        fw.close();

    }

}