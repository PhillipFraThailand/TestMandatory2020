package com.example.ciprocess.Model;

public interface IPurchaseModel {


    /* Variables
    Internet connection (boolean)
    Phone lines (integer)
    Cell phones (array of strings)
    Price (integer)
    */

    // Metods
    // Including/excluding the Internet connection and return the new total price
    int toggleInternetConnection(boolean IConnection);

    // Incrementing the number of phone lines and return new total price
    int incrementNumberOfPhoneLines();

    // Decrementing the number of phone lines and return new total price
    int decrementNumberOfPhoneLines();

    // Select a cell phone and return new total price
    int selectPhone(String modelName);

    // Unselect a cell phone and return new total price
    int unSelectPhone(String modelName);

    // Display an alert with the list of all selected phones. Returns a String to be shown in the alert
    // If no phones are selected, the alert will suggest the user to select a or some phones. Returns the suggestion as a string
    String buying();


}
