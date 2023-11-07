package main.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class GroceryFetch {
    public static void main(String[] args) {
        GroceryFetch obj = new GroceryFetch();
        try{
            obj.getItems();
            System.out.println("print");
        }catch (IOException  | SQLException ex){ //key to observer this
            System.out.println(ex);
        }finally{
            System.out.println("d");
        }

    }
    public void getItems() throws IOException, SQLException {
        throw new SQLException();
    }


}
