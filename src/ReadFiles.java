import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

    public void readFile() {
        try {
            String filePath = "C:\\Users\\Эдуард\\IdeaProjects\\Java6\\Lb4\\src\\file.txt";
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            Calculator regularCalculator = new Calculator();
            while (line != null) {
                regularCalculator.findSolution(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
