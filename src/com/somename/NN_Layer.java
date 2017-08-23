package com.somename;

import java.util.ArrayList;

/**
 * Created by Sarah on 8/12/2017.
 */
public class NN_Layer
{

    public ArrayList<Neural_Node> myNodes;

    public NN_Layer(int numNodes)
    {
        myNodes = new ArrayList<Neural_Node>();

        for (int i = 0; i < numNodes; i++)
        {
            myNodes.add(i, new Neural_Node(null));

            /**
             *  FIX THIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             *
             */

        }

    }


}
