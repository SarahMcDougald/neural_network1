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
    //  4. rawValue


    public ArrayList<Neural_Node> inputs = new ArrayList<Neural_Node>();
    public ArrayList<Double> weights;
    public ActivationFunction_Listing myFunction;

    //Changed name from 'output' to 'rawValue'.
    //This better reflects the STRUCTURE of the neural node, since a neural node does NOT always keep the same weight!!!!
    /**
     * KEY IDEA: different CONNECTIONS have different weights.
     * See diagram here: https://i.stack.imgur.com/VqOpE.jpg
     *
     */
    public double rawValue;

    public double weightedValue;


    /**
     * Constructor for a neural node.
     * Need to specify its inputs (arraylist), weights (arraylist? ? of doubles), AND activation function (???), and rawValue.
     *
     * /// Wait..... you shouldn't have to specify the rawValue.
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

        /**
         * NEED TO INITIALiZE RAW VALUE!!!
         */
        rawValue = 0;

        //Weighted value starts at 0.
        // NOTE!!! For neural nodes in the input layer, this value should never change.
        weightedValue = 0;




    }

    /**
     *
     * @param newVal the new weighted value
     */
    public void setWeightedValue(double newVal)
    {
        weightedValue = newVal;
    }



    /**
     * Adds a Neural_Node to the list of inputs for this NN_Layer. Adds to the END of the input list. (Shouldn't matter..)
     *
     * @param nn the neural node to be added to this NN_Layer.
     */
    public void addInputNode(Neural_Node nn)
    {
        inputs.add(nn);
    }



    /**
     * Method to calculate this node's rawValue. -- NEED TO FINISH.
     */
    public void calculaterawValue()
    {

        for (int i = 0; i < inputs.size(); i++)
        {
            rawValue += inputs.get(i).getrawValue();
            //// DOES THIS MAKE SENSE ? ? ? ? ? ?  ? ? ? ? ?  ? ? ? ? ? ? ?

        }

    }

    public double getrawValue()
    {
        return rawValue;
    }


}
