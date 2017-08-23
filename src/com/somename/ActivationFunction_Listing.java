package com.somename;

import java.lang.Math;

/**
 * Created by Sarah on 8/12/2017.
 */
public class ActivationFunction_Listing
{

    /**
     *
     */
    public void additionFunction()
    {


    }

    /**
     * Sigmoid activation function.
     *
     */
    public void sigmoidFunction()
    {


    }


    /**
     * "Leaky" RELU function, in which the derivative is never 0, but a negligible slope when x < 0.
     * 'x' being the sum of the input values of a particular neural node.
     *
     * @param inputSum the sum of the input values of a particular neural node
     * @return double output -the output produced by a particular neural node
     */
    public double leakyRELU(double inputSum)
    {
        double outputValue = 0;

        if (inputSum < 0)
        {
            outputValue = inputSum * .01;
        }
        else
        {
            outputValue = inputSum;
        }

        return outputValue;
    }


    /**
     *
     * @param inputSum the sum of all the weights * inputs, for one node.
     * @return
     */
    public double sigmoid(double inputSum)
    {
        double sig = 0.0;

        sig = 1.0 / (1 + Math.exp(-inputSum) ); // where exp() is e^(x).

        return sig;

    }

    /**
     *
     *
     * @param inputSum the same value as is put into sigmoid(), i.e. the sum of all the weights and inputs of one node.
     * @return
     */
    public double derivSigmoid(double inputSum)
    {
        double derivSig = inputSum*(1.0 - inputSum);

        //double check tutorial, logic of equation: https://databoys.github.io/Feedforward/
        // (my derivative-of-sigmoid function is slightly different, I substituted)


        return derivSig;

    }

}
