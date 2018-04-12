/*
 * Cube class by Joshua Yuan.
 */
public class Cube extends RectangularPrism implements Shape{
	
	public Cube(){
		super();
	}
	
	public Cube(double len){
		super(len, len, len);
	}
	//returns dimensions of one side
	public double getSize() {
		return getLength();
	}
	//returns surface area of cube
	@Override
	public double getSurfaceArea(){
		return super.getSurfaceArea();
	}
	//returns volume of cube
	@Override
	public double getVolume(){
		return super.getVolume();
	}
}
