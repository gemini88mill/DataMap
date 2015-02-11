package com.company;


/**
 * A Data map that allows the user to look at political maps through time
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        SQLController sql = new SQLController();
        sql.SQLConnection();
    }
}
