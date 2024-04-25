package HRDatabaseofficial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.util.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;


public class GUIhelper {

    public GUIhelper(){} //default constructor

    public String[] convertObjectArray(ArrayList<Demographics> list) //converts Object[] to String[]
    {
        String[] finalList = new String[list.size()];
        for(int i=0; i<list.size(); i++)
        {      
            // made a temp object OF THE TARGET CLASS THAT CONTAINS THE ORIGINAL STRING
            Demographics iterator = list.get(i); //finds object at the specified index
            String name = iterator.getFirstAndLastName(); //loops through object and returns name;
            finalList = addTo(name, finalList); //adds the found name to the array
        }
        return finalList;
    }

    public String[] addTo(String name, String[] list) //appends a variable to a String[]
    {
        String[] newArray = Arrays.copyOf(list, list.length + 1); //creates a bigger duplicate list
        newArray[list.length] = name; //adds the name to the end of the array
        return newArray;
    } 


    public Demographics returnObject(String name, ArrayList<Demographics> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            // made a temp object OF THE TARGET CLASS THAT CONTAINS THE ORIGINAL STRING
            Demographics iterator = list.get(i); //finds object at the specified index
            String found = iterator.getFirstAndLastName(); //loops through object and returns name;
            if(found == name)
                return iterator;
        }

        Demographics nullObj = new Demographics();
        return nullObj;
    }
}