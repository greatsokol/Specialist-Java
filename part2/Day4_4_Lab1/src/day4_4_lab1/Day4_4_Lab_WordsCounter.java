package day4_4_lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Day4_4_Lab_WordsCounter {

    static class WordNum implements Comparable<WordNum> {
        private final String w;
        private final int n;
        
        public WordNum(String w, int n) {
            this.w = w;
            this.n = n;
        }

        @Override
        public String toString() {
            return w+" - "+n;
        }

        public int getN() {
            return n;
        }

        public String getW() {
            return w;
        }

        @Override
        public int compareTo(WordNum o) {
            int res = n-o.getN();
            if(res == 0) {
                res = w.compareTo(o.getW());
            }
            return res;
        }

//        @Override
//        public boolean equals(Object obj) {
//            if(obj == null) return false;
//            return w.equals(((WordNum)obj).getW()) && n == ((WordNum)obj).getN();
//        }
        
    }
    
    static class WordCounter {

        private final String inFile;
        private static final String testString = "some test string, do some test test";
        private final Map<String, Integer> words = new TreeMap<>(); // new HashMap();
        
        
        public WordCounter(String inFile) {
            this.inFile = inFile;
        }

        public Map<String, Integer> getWords() {
            return words;
        }
        
        public Set<WordNum> getByValue() {
            Set<WordNum> set = new TreeSet<>();
            for(var item: words.entrySet()) {
                set.add(new WordNum(item.getKey(), item.getValue()));
            }
            return set;
        }

        public void countWords() throws IOException {
            Reader reader;
            if (inFile == null) {
                reader = new StringReader(testString);

            } else {
                reader = new FileReader(inFile);
            }
            try (BufferedReader br = new BufferedReader(reader)) {
                for (String line = br.readLine(); line != null; line = br.readLine()) {
                    StringTokenizer st = new StringTokenizer(line, " ,./\\;:!?()\"={}<>0123456789-|$*©");
                    while (st.hasMoreTokens()) {
                        String token = st.nextToken();
                        if (words.containsKey(token)) {
                            words.put(token, words.get(token) + 1);
                        } else {
                            words.put(token, 1);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws java.io.IOException {

        //WordCounter wc = new WordCounter(null);
        WordCounter wc=new WordCounter("readme.txt");
        wc.countWords();
        for(var item : wc.getByValue()) {
            System.out.println(item);
        }
//        for (Object obj : wc.getWords().entrySet()) {
//            System.out.println(obj);
//        }
    }

}
