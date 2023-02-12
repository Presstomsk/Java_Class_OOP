package helloapp;

import java.util.Scanner;

public class Program {
	  public static void main(String[] args) {
		   
	        Book book = new Book("ASP.NET Core in Action", "Andrew Lock", 2021, "Manning", "Computer Science", 832);
	        book.DisplayData();
	        book.SetData();	        
	        System.out.println("Name: " + book.GetName() + ", Author: " + book.GetAuthor() + ", Year of issue: " + book.GetYearOfIssue());
	        System.out.println("Publishing House: " + book.GetPublishingHouse() + ", Genre of book: " + book.GetGenre() + ", Number of pages: " + book.GetNumberOfPages());
	        
	    }
}
class Book{    
    String name;    
    String author;
    int yearOfIssue;
    String publishingHouse;
    String genre;
    int numberOfPages;
    
    Book()
    {    	
    }
    
    Book(String name, String author, int yearOfIssue, String publishingHouse, String genre, int numberOfPages){
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }
    
    public void SetData() {
    	
    	Scanner in = new Scanner(System.in);
    	System.out.print("Input name: ");
        String name = in.nextLine();
        this.name = name;
        System.out.print("Input author: ");
        String author = in.nextLine();
        this.author = author;
        System.out.print("Input Year of issue: ");
        int yearOfIssue = in.nextInt();
        this.yearOfIssue = yearOfIssue;
        System.out.print("Input Publishing House: ");
        String publishingHouse = in.nextLine();
        this.publishingHouse = publishingHouse;
        System.out.print("Input Genre of book: ");
        String genre = in.nextLine();
        this.genre = genre;
        System.out.print("Input Number of pages: ");
        int numberOfPages = in.nextInt();
        this.numberOfPages = numberOfPages;
        in.close();
    }
    
    public void DisplayData(){
        
      System.out.println("Name: " + name + ", Author: " + author + ", Year of issue: " + yearOfIssue);
      System.out.println("Publishing House: " + publishingHouse + ", Genre of book: " + genre + ", Number of pages: " + numberOfPages);
    }
    
    public String GetName() {
    	return this.name;
    }
    public void SetName(String name){
        this.name = name;
    }
    public String GetAuthor() {
    	return this.author;
    }
    public void SetAuthor(String author){
        this.author = author;
    }
    public String GetPublishingHouse() {
    	return this.publishingHouse;
    }
    public void SetPublishingHouse(String publishingHouse){
        this.publishingHouse = publishingHouse;
    }
    public String GetGenre() {
    	return this.genre;
    }
    public void SetGenre(String genre){
        this.genre = genre;
    }
    public int GetYearOfIssue() {
    	return this.yearOfIssue;
    }
    public void SetYearOfIssue(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }
    public int GetNumberOfPages() {
    	return this.numberOfPages;
    }
    public void SetNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
   
}

