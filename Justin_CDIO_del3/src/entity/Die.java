package entity;
public class Die {
	private int FaceValue, sides; 

	public int roll(){
		// Vi giver udvikler letter mulighed for at ændre antallet af sider på terningen
		this.sides = 6;
		return FaceValue = (int)(Math.random() * sides + 1);
	}

	public int getValue(){
		return FaceValue;   
	}
	//		public void setValue(int FaceValue) 
	//		{
	//			this.FaceValue = FaceValue;
	//		}
}


