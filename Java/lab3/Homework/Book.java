package library;

public class Book {
    String title;
    String author;
    int year_0f_publish;
    int no_0f_pages;
    boolean borrowable;

    public Book(String title_input,String author_input,int year_0f_publish_input, int no_0f_pages_input, boolean borowable_input)
    {
        if (title_input == null || author_input == null)
        {
            throw new IllegalArgumentException("String cannnot be NULL");
        }
        this.title = title_input;
        this.author = author_input;
        this.year_0f_publish = year_0f_publish_input;
        this.no_0f_pages = year_0f_publish_input;
        this.borrowable = borowable_input;
    }
    public Book(final Book other)
    {
        if (other.title == null || other.author == null)
        {
            throw new IllegalArgumentException("String cannnot be NULL");
        }
        this.title = other.title;
        this.author = other.author;
        this.year_0f_publish = other.year_0f_publish;
        this.no_0f_pages = other.year_0f_publish;
        this.borrowable = other.borrowable;
    }
    public String toString()
    {
        return title + " " + author + " " + year_0f_publish + " " + no_0f_pages + " " + borrowable; 
    }
    public boolean sameAs(Book that)
    {
        return (that!= null) && (that.title.equals(this.title)) &&(that.title.equals(this.title)) && that.year_0f_publish == this.year_0f_publish && that.no_0f_pages == this.no_0f_pages; 
    }

}