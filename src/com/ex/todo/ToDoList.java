package com.ex.todo;

/**
@author Kim
*/

import java.util.Arrays; 

public class ToDoList {
	private String[] doList;
    private int numberOfStrings;
    private static final int DEFAULT_INITIAL_CAPACITY = 25; 
 
    public ToDoList() {
    	doList = new String[1];
        numberOfStrings =0;
    } //end defualt constructor
    
    public ToDoList(int capacity) {
    	doList = new String[capacity];
    	numberOfStrings = 0;
    }

    //����ڰ� �ؾ������� ��Ʈ������ �޴� �޼ҵ�
    public void add(String task) {
    	ensureCapacity();
    	doList[numberOfStrings] = task; //�Ҵ�
    	numberOfStrings++; // numberOfStrings ����
    	updatingMessage();
    }
    
    //��̰� �������� Ȯ���Ͽ� ��̸� ��ĭ �ø���.
    public void ensureCapacity() {
    	if(numberOfStrings == doList.length)
    	doList = Arrays.copyOf(doList, 1 + doList.length);     
    }
    
    //���� ��� ����� ����
    public int getCurrentSize() {
    	return numberOfStrings;
    }

    //��̰� ����ִ��� Ȯ��
    private boolean isEmpty() {
    	return numberOfStrings ==0;
    }

    public void remove(int give) { 
    	int givenIndex = give - 1; 
    	ensureCapacity();
    	doList[givenIndex] = null;
    	for(int index = givenIndex; index < numberOfStrings; index++) {
    		doList[index] = doList[index+1]; 
    		updatingMessage(); 
    	}// end for    
    	numberOfStrings--;
    }// end remove

    //��� �迭�� �ִ� ���� �����.
    public void clear() {
    	if(!isEmpty())
    		for(int index =0; index < doList.length; index++) {
    			doList[index] = null;
    			numberOfStrings--;       
    		}
    	updatingMessage();
    }// end clear()

    public void replace(int givenIndex1, int givenIndex2) {
    	int index1 = givenIndex1 -1;
    	int index2 = givenIndex2 -1;
    	ensureCapacity(); 
    	doList[doList.length-1] = doList[index1]; 
    	doList[index1] = doList[index2];      
    	doList[index2] = doList[doList.length-1];
    	updatingMessage();
    }
   
    //doList �迭�� ���
    public void display() {
    	if(numberOfStrings==0)
    		System.out.println("You don't have To-Do-List");
    	else
    		System.out.println("------- Your To Do List --------");
    	for(int index=0; index< numberOfStrings; index++) {
    		System.out.println(index + 1 + ". " + doList[index]); 
    	}
    	System.out.println();
    	System.out.println();
    }

    private void updatingMessage() {
    	System.out.println("updating.......");
    	System.out.println();
    }
}// end class
