
public class Test1 {
    public static void main (String [] args) {
        
   int x = 3;
int y = 3;
do {
	x += 1;
	do {
		System.out.println( "[" + y + "]" );
		y -= 1;
	} while( y > 0 );
} while(x < 5);

   x = 3;
 y = 3;
for(x=3; x<6; x++){
	
	for (y=3; y>-1; y--){
		System.out.println( "[" + y + "]" );
	
	} 
} 
    }
}