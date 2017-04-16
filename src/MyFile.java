import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class MyFile {
	private int countLines = 0;
    private File inputFile;
    private String input;
    
    public MyFile(File inputFile) {
    	this.inputFile = inputFile;
    	this.input = new String();
	}

	public void readFile(){
        BufferedReader br = null;
 
        try {
        	String currentLine;
            br = new BufferedReader(new FileReader(inputFile.getAbsoluteFile()));

            while ((currentLine = br.readLine()) != null) 
            {
            	input += currentLine + "\n";
                if (!currentLine.isEmpty() && !currentLine.contains("/"))
                    countLines++;
          	}
           
           input += "\n";
        } catch (IOException e) {
               
        } finally {
            try {
                if (br != null)
                	br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
	
    public File getInputFile() {
		return inputFile;
	}

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void setCountLines(int countLines) {
		this.countLines = countLines;
	}

	public int getCountLines() {
        return countLines;
    }
}
