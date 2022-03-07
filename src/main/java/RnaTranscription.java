import java.util.*;  
class RnaTranscription {

    String transcribe(String dnaStrand) {
        Dictionary dict = new Hashtable();  
        dict.put('G', 'C');  
        dict.put('C', 'G');  
        dict.put('T', 'A');  
        dict.put('A', 'U');  
        StringBuilder transcribedRna = new StringBuilder();

        for (char ch: dnaStrand.toCharArray()) {
            transcribedRna.append(dict.get(ch));
        }
        return transcribedRna.toString();
        // throw new UnsupportedOperationException("Delete this statement and write //your own implementation.");
    }

}
