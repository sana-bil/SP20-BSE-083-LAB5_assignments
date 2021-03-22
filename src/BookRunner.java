public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setAuthor("sanabil");
        b1.setChapterNames(new String[] {"bliss of spring", "safest heaven", "soothing bloosom","soaking mighty sun"});
        Book b2 = new Book("nimra", new String[] {"Anne with an E", "The Wichter","The outlanders"});
        Book b3 = new Book();
        System.out.println( "Are author's names same? "+b3.compareBooks(b1,b2));
        System.out.println("Greater number of chapters are "+b3.compareChapterNames(b1,b2));

    }
}
