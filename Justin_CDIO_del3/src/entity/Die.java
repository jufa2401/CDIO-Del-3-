package entity;

public class Die {
	 int faceValue, sides; 
	 	 	
	    public int roll(){
	        // Vi giver udvikler letter mulighed for at ændre antallet af sider på terningen
	    	this.sides = 6;
	    	return faceValue = (int)(Math.random() * sides + 1);
	   }

	    public int getValue(){
	        return faceValue;   
	    }
	}


