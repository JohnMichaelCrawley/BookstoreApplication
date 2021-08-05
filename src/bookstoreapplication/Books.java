package bookstoreapplication;
//Import list//
import java.io.Serializable;

/**
 * Books.Java
 * @author john f . x19141301
 * 03/01/2021
 */
public class Books implements Serializable 
{
    //************************************************//
    //            Private variables of books          //
    //************************************************//
    private String bookAuthor = "";
    private String bookTitle = "";
    private Double bookCost = 0.00;
    private String fileFormat = "";
    private String audioBookNarrator = "";
     //************************************************//
    //           Default Constructor for books         //
    //************************************************//
    public Books()
    {
        bookAuthor = "";
        bookTitle = "";
        bookCost = 0.00;
        fileFormat = "";
        audioBookNarrator = "";
    }
     //************************************************//
    //          Overload Constructor for books         //
    //************************************************//
    public Books(String authorSetter, String titleSetter, Double costSetter, String fileSetter, String narratorSetter)
    {
        this.bookAuthor = authorSetter;
        this.bookTitle = titleSetter;
        this.bookCost = costSetter;
        this.fileFormat = fileSetter;
        this.audioBookNarrator = narratorSetter;
    }
    //************************************************//
    //                 Getters for books              //
    //************************************************//
    //*********************************//
    //        Book Author Getter       //
    //*********************************//
    public String getBookAuthor() 
    {
        return bookAuthor;
    }
    //*********************************//
    //        Book Title Getter        //
    //*********************************//
    public String getBookTitle() 
    {
        return bookTitle;
    }
    //*********************************//
    //         Book Cost Getter        //
    //*********************************//
     public Double getBookCost() 
    {
        return bookCost;
    }
    //*********************************//
    //         File Format Getter      //
    //*********************************//
    public String getFileFormat() 
    {
        return fileFormat;
    }
    //*********************************//
    //    Audio Book Narrator Getter    //
    //*********************************//
    public String getAudioBookNarrator() 
    {
        return audioBookNarrator;
    }
     //************************************************//
    //                 Setters for books               //
    //************************************************//
    //*********************************//
    //        Book Author Setter       //
    //*********************************//
     public void setBookAuthor(String bookAuthorSetter) 
    {
        this.bookAuthor = bookAuthorSetter;
    }
    //*********************************//
    //        Book Title Setter        //
    //*********************************//
    public void setBookTitle(String bookTitleSetter) 
    {
        this.bookTitle = bookTitleSetter;
    }
    //*********************************//
    //         Book Cost Setter        //
    //*********************************//
     public void setBookCost(Double bookCostSetter) 
    {
        this.bookCost = bookCostSetter;
    }
    //*********************************//
    //         File Format Setter      //
    //*********************************//
    public void setFileFormat(String fileFormatSetter) 
    {
        this.fileFormat = fileFormatSetter;
    }
    //*********************************//
    //    Audio Book Narrator Setter    //
    //*********************************//
    public void setAudioBookNarrator(String audioBookNarratorSetter) 
    {
        this.audioBookNarrator = audioBookNarratorSetter;
    }
}