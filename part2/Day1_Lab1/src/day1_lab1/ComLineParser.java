package day1_lab1;

public class ComLineParser {

    private String[] keys;
    private String[] delimiters;

    public ComLineParser(String[] keys) {
        this(keys, new String[]{"-", "/"});
    }

    public ComLineParser(String[] keys, String[] delimiters) {
        this.keys = keys;
        this.delimiters = delimiters;
    }

    public void findParameter(String txt) {
        System.out.println("find: " + txt.substring(2));
    }

    public void parse(String[] args) {
        for(String item: args) {
            boolean isDelimeter = false;
            for(int n=0; !isDelimeter && (n < delimiters.length); n++){
                isDelimeter = item.regionMatches(0, delimiters[n], 0, 1);
            }
            if(!isDelimeter){
                printHelp(item);
                return;
            }
            if(item.substring(1,2).equals("-?")) {
                printHelp(null);
                return;
            }
            //проверка наличия правильного ключа
            boolean isKey = false;
            for(int i=0; !isKey && (i < keys.length); i++){
                isKey = item.regionMatches(true, 1, keys[i], 0, keys[i].length());
            }            
            if(!isKey){
                printHelp(item);
                return;
            }
            findParameter(item);
        }
    }

    static void printHelp(String error) {
        if (error != null) {
            System.out.println(error);
        }
        System.out.println("формат ком. строки: ИмяПрограммы [-r<input-filename> [-w<output-filename>]]");
        System.out.println(" -? показать help");
        System.out.println(" -r задать имя входного файла");
        System.out.println(" -w выполнть вывод в указанный файл");
    }

}
