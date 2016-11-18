package com.parse4cn1.operation;


/**
 *  This class defines an operation to 'atomically' add objects to an array field 
 *  of a ParseObject.
 */
public class AddToArrayOperation implements ParseOperation {

	protected final java.util.ArrayList objects;

	public AddToArrayOperation(java.util.Collection coll) {
	}

	public AddToArrayOperation(Object o) {
	}

	@java.lang.Override
	public Object apply(Object oldValue, com.parse4cn1.ParseObject parseObject, String key) {
	}

	@java.lang.Override
	public Object encode(com.parse4cn1.encode.IParseObjectEncodingStrategy objectEncoder) {
	}
}
