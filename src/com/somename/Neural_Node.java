package com.somename;

import sun.rmi.server.Activation;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import java.lang.Math;

/**
 * Created by Sarah on 8/12/2017.
 *
 * Class for the neurons in a neural network.
 */
public class Neural_Node
{
    //  1. inputs
    //  2. weights
    //ARRAYLIST of doubles. A little different. https://stackoverflow.com/questions/17481206/java-arraylist-of-doubles
    // = new ArrayList<Double>();
    //List<Double> list = new ArrayList<>(Arrays.asList(1.38, 2.56, 4.3));
    //  3. activation function
    ///Make an instance of ActivationFunction class. Might as well have all activation functions available at once for a node.
    //(Layers with nodes that each have different activation functions is possible with this structure. May be either useful
    //or entirely superfluous.)
    //--NOTE: The activation function class is basically a helper class.
    //  4. output


    public ArrayList<Neural_Node> inputs = new ArrayList<Neural_Node>();
    public ArrayList<Double> weights;
    public ActivationFunction_Listing myFunction;
    public double output;


    /**
     * Constructor for a neural node.
     * Need to specify its inputs (arraylist), weights (arraylist? ? of doubles), AND activation function (???), and output.
     *
     * /// Wait..... you shouldn't have to specify the output.
     * /// Wait.... weights should be set randomly, not specified.
     *
     */
    public Neural_Node(ArrayList<Neural_Node> inputList)
    {

        inputs = inputList;

        int numWeights = inputList.size();
        weights = new ArrayList<Double>();
        for (int i = 0; i < numWeights; i++)
        {
            //Add a weight to the "weights" arraylist, as many as there are inputs.

            /**
             weights must be SET RANDOMLY. For now: DUMMY VARIABLE, 1.0, instead of random double.
             Basically find a good randomization function. Not sure what to use. Math.rand()?
             */
            weights.add(new Double(1.0));

        }




        myFunction = new ActivationFunction_Listing();

        //Output is always 0 to start.
        output = 0;




    }


    /**
     * Method to calculate this node's output. -- NEED TO FINISH.
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
