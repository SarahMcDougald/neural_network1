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



    /**
     * The following is a VERY basic constructor for a 3-layer neural network. i.e. 1 hidden layer
     *
     * @param numLayers
     */
    public Network(int numLayers)
    {


    }





}
