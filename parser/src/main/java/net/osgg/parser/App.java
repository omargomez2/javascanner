package net.osgg.parser;

import java.io.IOException;

/**
 * Example adapted from http://www.javapractices.com/topic/TopicAction.do?Id=87
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
    		ReadWithScanner parser = new ReadWithScanner("test.txt");
    		parser.processLineByLine();
    }
}
