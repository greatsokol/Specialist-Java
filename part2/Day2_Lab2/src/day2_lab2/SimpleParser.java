/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2_lab2;

/**
 *
 * @author Administrator
 */
public class SimpleParser extends ComLineParserBase {

    private String inFile, outFile;
    
    public SimpleParser(String[] keys) {
        super(keys);
    }
    
    public void setInFile(String inFile) {
        this.inFile = inFile;
    }

    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }
    
    protected void printHelp(String error) {
        if(error!=null)  System.out.println("Command-line error in: " +error);
        
        System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
        System.out.println("   -?  показать Help файл");
        System.out.println("   -r  задать имя входного файла");
		System.out.println("   -w  выполнить вывод в указанный файл");
    }
    protected void findParametr(String txt) {
        String key = txt.substring(1,2);
        String par = txt.substring(2);
        switch(key) {
            case "r": inFile = par; break;
            case "w": outFile = par; break;
        }
        
        
        System.out.println("find: "+ txt.substring(2));
        
    }
}
