import java.util.Scanner;

abstract class Shape{
	int sides;
	public abstract void print_sides();
}




class Square extends Shape{
	public Square(){
		sides = 4;
	}
	public void print_sides(){
		System.out.println("This shape has " + sides + " sides." );
	}	
}



class Triangle extends Shape{
	public Triangle(){
		sides = 3;
	}

	public void print_sides(){
 		System.out.println("This shape has " + sides + " sides." );
        }
	
}


class demo{

	public static void main(String args[]){
 		Scanner scan = new Scanner(System.in);
		Shape s = null;
		String in = "";
		while(!(in.equals("1") || in.equals("2"))){		
			System.out.println("What shape do you choose?\n1.) Triangle\n2.) Square");
			in = scan.nextLine();
			try{
				if(in.equals("1")){
					s = new Triangle();
					s.print_sides();
				}
				else if(in.equals("2")){
					s = new Square();
                       		        s.print_sides();
				}
				else{
					throw new IllegalArgumentException("Invalid choice");
				}
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Choose again.");
			}
		
		}
	}
}












