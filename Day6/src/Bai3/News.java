package Bai3;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tieu de: ");
        title = sc.nextLine();
        System.out.print("Nhap vao ngay dua tin: ");
        publishDate = sc.nextLine();
        System.out.print("Nhap vao tac gia: ");
        author = sc.nextLine();
        System.out.print("Nhap vao noi dung: ");
        content = sc.nextLine();
    }

    @Override
    public void Display(){
        System.out.println("Title: " + title);
        System.out.println("Public Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }

    int[] rateList = new int[3];

    public void Calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 3 diem danh gia: ");
        rateList[0] = sc.nextInt();
        rateList[1] = sc.nextInt();
        rateList[2] = sc.nextInt();
        averageRate = (float)(rateList[0] + rateList[1] + rateList[2]) / 3;
        System.out.println(averageRate);
    }

}
