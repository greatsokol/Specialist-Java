package day2_lab2;

public abstract class ComLineParserBase {
	
    String []keys;
    String []delimiters;

    public ComLineParserBase(String[] keys, String[] delimiters) {
        this.keys = keys;
        this.delimiters = delimiters;
    }
    public ComLineParserBase(String[] keys) {
        this( keys, new String[] { "/", "-" } );
    }
	
    protected abstract void printHelp(String error);
    protected abstract void findParametr(String txt);
    
    public final void parse(String[] args) {

        for(String item : args) {
            
            // проверка наличия правильного разделителя
            boolean isDelimiter = false;
            for (int n = 0; !isDelimiter && (n < delimiters.length); n++) {
               	isDelimiter = item.regionMatches(0, delimiters[n], 0, 1);
            }
            if(!isDelimiter) { printHelp(item); return; }
            
            // проверка наличия требования показать Help файл 
            if(item.substring(1,2).equals("?")) { printHelp(null); return; }
            
            // проверка наличия правильного ключа
            boolean isKey = false;
            for (int i = 0; !isKey && (i < keys.length); i++) {
                isKey = item.regionMatches(true, 1, keys[i], 0, keys[i].length());
            }
            if(!isKey) { printHelp(item); return; }

            findParametr(item);
        }
    }
}
