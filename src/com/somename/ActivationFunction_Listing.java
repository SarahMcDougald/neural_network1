package com.somename;

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
     * @param double inputSum the sum of the input values of a particular neural node
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



}
