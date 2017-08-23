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
        //1. Populate arraylist of hidden layers with NN_Layers.
        //2. Populate the input, hidden, and output layers with Neural_Nodes.
        //3. Connect all the layers.


        totalLayers = 3;
        numHiddenLayers = 1;

        inputLayer = new NN_Layer(numInputNodes);
        outputLayer = new NN_Layer(numOutputNodes);

        //1.
        // First populate the Arraylist of hidden layers with the correct number of hidden layers.

        for (int i = 0; i < numHiddenLayers; i++)
        {
            hiddenLayers.add(i, new NN_Layer(numHiddenNodes) );

            /* NOTE!!!!: for this particular constructor, a for loop is sort of redundant, because there is only
            one hidden layer to loop through and create a node list for.

            However, future constructors-- that will allow a network with multiple hidden layers-- will probably
            use a for loop, so this code will be left for future consideration.

            */

        }


        //2.

        //Input layer:
        for (int a = 0; a < numInputNodes; a++)
        {
            // NOTE: dummy value to start with.
            /** each neural_node's "inputlist" variable will later be set during the "connections" phase. */
            inputLayer.myNodes.add(a, new Neural_Node(null));
        }

        //Output layer:
        for (int b = 0; b < numOutputNodes; b++)
        {
            /** each neural_node's "inputlist" variable will later be set during the "connections" phase. */
            outputLayer.myNodes.add(b, new Neural_Node(null));
        }

        //Hidden layer: in this constructor, we assume there is ONE hidden layer.
        for (int c = 0; c < numHiddenNodes; c++)
        {
            /** each neural_node's "inputlist" variable will later be set during the "connections" phase. */
            hiddenLayers.get(0).myNodes.add(c, new Neural_Node(null));
        }


        //3.

        // Connect all the nodes together. Make sure the inputs of the input layers point to the right nodes, etc...
        connect();






        // ...Anything else to do in this Network() constructor?


    }


    /**
     * This function will connect list all of the inputLayer nodes as inputs of each hiddenLayer node,
     * and all of the hiddenLayer nodes as inputs of each outputLayer node.
     *
     * FINAL GOAL: structure this function so that it works with ANY number of input nodes, ANY number of output nodes!,
     * and ANY number of hidden layers.
     * -- use totalLayers and numHiddenLayers.
     *
     *
     * This will be "version 1" in which there is assumed to be *ONE* hidden layer.
     *
     */
    public void connect()
    {
        // First, connect between input layer and hidden layer 1.

        /*
        By 'connect', we mean put every neural node on the inputLayer list on the "inputs" list of each Neural_Node in
        Hidden Layer 1.

        And so forth, for the other cases.
        */
        // !!! PROBLEM: setting equal '=' with arraylists uses a reference. Is that fine? Or should we "rebuild" the arraylists
        // and their elements...?
        // Maybe set equal for the time being. CONSIDER. __________________________________
        for (int i = 0; i < totalLayers; i++)
        {
            if (i == 0)
            {
                //If we're on the first connection-layer, i.e. between input and hidden layer 1, then connect those.

                for (int j = 0; j < hiddenLayers.get(i).myNodes.size(); j++ )
                {

                }


            }

            else if (i == totalLayers - 1)
            {
                //If we're on the LAST connection-layer, i.e. between hidden layer n and output, then connect those.
            }

            else
            {
                /*
                OTHERWISE:

                if we're not on a connection-layer involving either the input or the output, then we must be
                connecting two hidden layers.

                Therefore, use their current ordering in the Arraylist<NN_Layer> called hiddenLayers.
                Use 'i' to reference.
                */


            }


        }


        // After the for loop finishes... anything else? (double-check)



    }



    public void feedForward()
    {

    }

    public void backPropagate()
    {

    }





}
