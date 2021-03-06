/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */
/**
 * Extended to add arrays.
 */
import parser.*;

import java.util.ArrayList;


public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, INT_ARRAY, BOOL_ARRAY;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value;

    /** values of an array data */
    private ArrayList<Integer> arrayValues;

    /** Constructor for integers */
    Data(int v) { type = Type.INTEGER; value = v; arrayValues = new ArrayList<Integer>(); }

    /** Constructor for Booleans */
    Data(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; arrayValues = new ArrayList<Integer>(); }

    /** Constructor for Arrays of integers or booleans */
    Data(ArrayList arr) {
        if(arr.size() > 0 && arr.get(0) instanceof Boolean) {
            type = Type.BOOL_ARRAY;
            arrayValues = new ArrayList<Integer>();
            for(int i = 0; i < arr.size(); ++i){
                arrayValues.add((Boolean) arr.get(i) ? 1 : 0);
            }
        }
        else if(arr.get(0) instanceof Integer) {
            type = Type.INT_ARRAY;
            arrayValues = new ArrayList<Integer>(arr);
        }
    }

    /** Constructor for Arrays of integers, with an initial value */
    Data(int v, int index) { 
        type = Type.INT_ARRAY;
        arrayValues = new ArrayList<Integer>();
        for(int i = 0; i < index; ++i){
            arrayValues.add(0);
        }
        arrayValues.add(v);
    }

    /** Constructor for Arrays of booleans, with an initial value */
    Data(boolean b, int index) { 
        type = Type.BOOL_ARRAY;
        arrayValues = new ArrayList<Integer>();
        for(int i = 0; i < index; ++i){
            arrayValues.add(0);
        }
        arrayValues.add(b ? 1 : 0);
    }

    /** Constructor for void data */
    Data() { type = Type.VOID; }

    /** Copy constructor */
    Data(Data d) { type = d.type; value = d.value; arrayValues = d.arrayValues; }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER; }

    /** Indicates whether the data is an Array of integers */
    public boolean isIntArray() { return type == Type.INT_ARRAY; }

    /** Indicates whether the data is an Array of booleans */
    public boolean isBoolArray() { return type == Type.BOOL_ARRAY; }

    /** Indicates whether the data is an Array */
    public boolean isArray() { return type == Type.BOOL_ARRAY || type == Type.INT_ARRAY; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER;
        return value;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN;
        return value == 1;
    }

    /**
     * Gets the value of an integer data at the index i of the array. 
     * The method asserts that the data is an array of integers.
     */
    public int getIntegerValue(int i) {
        assert type == Type.INT_ARRAY;
        return arrayValues.get(i);
    }

    /**
     * Gets the value of an boolean data at the index i of the array. 
     * The method asserts that the data is an array of booleans.
     */
    public boolean getBooleanValue(int i) {
        assert type == Type.BOOL_ARRAY;
        return arrayValues.get(i) == 1;
    }

    /**
     * Gets the size of an Array data. The method asserts that
     * the data is an array.
     */
    public int getArraySize() {
        assert type == Type.INT_ARRAY || type == Type.BOOL_ARRAY;
        return arrayValues.size();
    }

    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; arrayValues = new ArrayList<Integer>(); }

    /** Defines an integer value for the data */
    public void setValue(int v) { type = Type.INTEGER; value = v; arrayValues = new ArrayList<Integer>(); }

    /** Defines an integer at the index i for the data. Modifies array size if needed */
    public void setValue(int v, int index) {
        if(type != Type.INT_ARRAY){
            type = Type.INT_ARRAY;
            arrayValues = new ArrayList<Integer>();
            for(int i = 0; i < index; ++i){
                arrayValues.add(0);
            }
            arrayValues.add(v);
        }
        else {
            if(arrayValues.size() > index) {
                arrayValues.set(index, v);
            }
            else {
                for(int i = arrayValues.size(); i < index; ++i){
                    arrayValues.add(0);
                }
                arrayValues.add(v);
            }
        }
    }

    /** Defines an integer at the index i for the data. Modifies array size if needed */
    public void setValue(boolean b, int index) {
        if(type != Type.BOOL_ARRAY){
            type = Type.BOOL_ARRAY;
            arrayValues = new ArrayList<Integer>();
            for(int i = 0; i < index; ++i){
                arrayValues.add(0);
            }
            arrayValues.add(b ? 1 : 0);
        }
        else {
            if(arrayValues.size() > index) {
                arrayValues.set(index, b ? 1 : 0);
            }
            else {
                for(int i = arrayValues.size(); i < index; ++i){
                    arrayValues.add(0);
                }
                arrayValues.add(b ? 1 : 0);
            }
        }
    }

    /** Copies the value from another data */
    public void setData(Data d) { type = d.type; value = d.value; arrayValues = d.arrayValues; }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (type == Type.BOOLEAN) return value == 1 ? "true" : "false";
        else if (type == Type.INT_ARRAY) {
            String returnStr = "[";
            for(int i = 0; i < arrayValues.size(); ++i) {
                if(i != 0) returnStr += ",";
                returnStr += arrayValues.get(i);
            }
            returnStr += "]";
            return returnStr;
        }
        else if (type == Type.BOOL_ARRAY) {
            String returnStr = "[";
            for(int i = 0; i < arrayValues.size(); ++i) {
                if(i != 0) returnStr += ",";                
                returnStr += arrayValues.get(i) == 1 ? "true" : "false";
            }
            returnStr += "]";
            return returnStr;
        }
        return Integer.toString(value);
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value == 0) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */     
    public void evaluateArithmetic (int op, Data d) {
        assert type == Type.INTEGER && d.type == Type.INTEGER;
        switch (op) {
            case AslLexer.PLUS: value += d.value; break;
            case AslLexer.MINUS: value -= d.value; break;
            case AslLexer.MUL: value *= d.value; break;
            case AslLexer.DIV: checkDivZero(d); value /= d.value; break;
            case AslLexer.MOD: checkDivZero(d); value %= d.value; break;
            default: assert false;
        }
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new Data(value == d.value);
            case AslLexer.NOT_EQUAL: return new Data(value != d.value);
            case AslLexer.LT: return new Data(value < d.value);
            case AslLexer.LE: return new Data(value <= d.value);
            case AslLexer.GT: return new Data(value > d.value);
            case AslLexer.GE: return new Data(value >= d.value);
            default: assert false; 
        }
        return null;
    }
}
