import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarkdownParseTest {

    @Test
    public void test1() throws IOException {
        Path filename = Path.of("test1.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test2() throws IOException {
        Path filename = Path.of("test2.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test3() throws IOException {
        Path filename = Path.of("test3.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test4() throws IOException {
        Path filename = Path.of("test4.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("anotherlink", "((li)nk)", "anotherlink");
        assertEquals(expected, links);
    }
    @Test
    public void testSnippet1() throws IOException {
        Path filename = Path.of("snippet1.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(expected, links);
    }
    @Test
    public void testSnippet2() throws IOException {
        Path filename = Path.of("snippet2.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expected, links);
    }
    @Test
    public void testSnippet3() throws IOException {
        Path filename = Path.of("snippet3.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(expected, links);
    }
    
}