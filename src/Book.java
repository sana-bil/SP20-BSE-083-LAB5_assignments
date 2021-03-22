public class Book {
    private String author;
    private String chapterNames[]= new String[100];

    public Book(){
    }
    public Book(String a, String [] arr){
        author=a;
        chapterNames=arr;
    }
    public void setAuthor(String a){
        author=a;
    }
    public String getAuthor(){
        return author;
    }
    public void setChapterNames(String [] arr){
        chapterNames=arr;
    }
    public String [] getChapterNames(){
        return chapterNames;
    }
    public boolean compareBooks (Book b, Book bb) {
        if (b.author!=bb.author){
            return false;
        }
        else return true;
    }
    public int compareChapterNames(Book b, Book bb){
        if (b.chapterNames.length>bb.chapterNames.length){
            System.out.println("Author with greater number of chapters is  " + b.getAuthor());
            return b.chapterNames.length;
        }
        else
            System.out.println("Author with greater number of chapters is  "+ bb.getAuthor());
            return bb.chapterNames.length;
    }

}
