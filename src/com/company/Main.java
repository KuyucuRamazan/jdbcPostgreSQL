package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dbwork db = new Dbwork();
        db.connect_to_db("techprojdbc", "postgres", "Rh8487");
    }
}
