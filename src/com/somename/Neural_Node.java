package com.somename;

import sun.rmi.server.Activation;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * Created by Sarah on 8/12/2017.
 *
 * Class for the neurons in a neural network.
 */
public class Neural_Node
{
    //  1. inputs
    public ArrayList<Neural_Node> inputs = new ArrayList<Neural_Node>();

    //  2. weights
    //ARRAYLIST of doubles. A little different. https://stackoverflow.com/questions/17481206/java-arraylist-of-doubles
    public ArrayList<Double> weights = new ArrayList<Double>();
    //List<Double> list = new ArrayList<>(Arrays.asList(1.38, 2.56, 4.3));



    //  3. activation function
    ///Make another class with the activaton function? Specify that this neural node has that activation function.
    ///(DECIDE ON STRUCTURE)
    public ActivationFunction_Listing myFunction = new ActivationFunction_Listing();


    //  4. output
    public double output;

    //HELLO


    /*

    What methods? What should each node be able to do?
     */

    /**
     * Constructor for a neural node.
     * Need to specify its inputs (arraylist), weights (arraylist? ? of doubles), AND activation function (???)
     *
     * /// Wait..... you shouldn't have to specify the output.
     */
    public Neural_Node(ArrayList<Neural_Node> inputList, List<Double> weights)
    {
        //Output is always 0 to start.
        output = 0;



    }


    /**
     * Method to calculate this node's output.
     */
    public void calculateOutput()
    {

        for (int i = 0; i < inputs.size(); i++)
        {
            output += inputs.get(i).getOutput();
            //// DOES THIS MAKE SENSE ? ? ? ? ? ?  ? ? ? ? ?  ? ? ? ? ? ? ?

        }

    }

    public double getOutput()
    {
        return output;
    }


}
