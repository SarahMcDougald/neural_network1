package com.somename;

import java.util.ArrayList;

/**
 * Created by Sarah on 8/17/2017.
 */
public class Network
{

    /*
    Parts of a Neural Network:

    - how many layers. Assume there MUST be at least THREE layers, for this neural network: input, output, and at least
    one hidden.
    - how many nodes in each layer. Assume at least ONE node. (May not be listed in the Network class itself, but accessed.)

    - function for feedForward().
    - function for backPropagate().
    - function for train(), which calls forward and back functions with a bunch of iterations.
    - SMALL main() function for very basic testing. Will move to a "Testing" class or similar, in the future, which
    will hold code for pre-made neural network tests.

     */

    public int totalLayers;
    public int numHiddenLayers;
    public NN_Layer inputLayer;
    public NN_Layer outputLayer;
    public ArrayList<NN_Layer> hiddenLayers;



    //The following is a VERY basic constructor for a 3-layer neural network. i.e. 1 hidden layer

    public Network(int numInputNodes, int numHiddenNodes, int numOutputNodes)
    {
        totalLayers = 3;
        numHiddenLayers = 1;

        inputLayer = new NN_Layer(numInputNodes);
        outputLayer = new NN_Layer(numOutputNodes);

        for (int i = 0; i < numHiddenLayers; i++)
        {
            hiddenLayers.add(i, new NN_Layer(numHiddenNodes) );

            /* NOTE!!!!: for this particular constructor, a for loop is sort of redundant, because there is only
            one hidden layer to loop through and create a node list for.

            However, future constructors-- that will allow a network with multiple hidden layers-- will probably
            use a for loop, so this code will be left for future consideration.

            */

        }


        // Connect all the nodes together. Make sure the inputs of the input layers point to the right nodes, etc...


    }


    /**
     * This function will connect list all of the inputLayer nodes as inputs of each hiddenLayer node,
     * and all of the hiddenLayer nodes as inputs of each outputLayer node.
     *
     * GOAL: structure this function so that it works with ANY number of input nodes, ANY number of output nodes!,
     * and ANY number of hidden layers.
     */
    public void connect()
    {

    }



    public void feedForward()
    {

    }

    public void backPropagate()
    {

    }





}
