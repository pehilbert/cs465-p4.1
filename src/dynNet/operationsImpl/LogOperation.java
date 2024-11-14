package dynNet.operationsImpl;

import dynNet.dynCalculator.Operation;



/**
 * Class [AdditionOperation]
 * <p>
 * This is a concrete operation class, that implements the
 * interface <code>Operation</code>.
 *
 * @author Prof. Dr.-Ing. Wolf-Dieter Otte
 * @version May 20002
 */
public class LogOperation implements Operation{
	
	public float calculate(float firstNumber, float secondNumber){
		return (float)(Math.log(firstNumber) / Math.log(secondNumber));
	}
}