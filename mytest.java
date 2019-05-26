package test;
/**
 * write a program that prints the numbers from 1 to 100
 * but for multiples of three print 'Fizz' instead of the number
 * and for the multiples of five print 'Buzz'.
 * for numbers witch are multiples of both three and five print 'FizzBuzz'
 * @author JYP
 *
 */
public class mytest {
	 boolean IsFizz(int num){
		if((num%3==0)&&(num%5!=0) &&(num%15!=0)){
			return true;
		}
		return false;
	}
	 boolean IsBuzz(int num){
			if((num%5==0)&&(num%3!=0) &&(num%15!=0)){
				return true;
			}
			return false;
		}
	 boolean IsBFizzuzz(int num){
			if(((num%5==0)&&(num%3==0) )||(num%15==0)){
				return true;
			}
			return false;
		}
	public static void main(String[] args) {
		mytest test = new mytest();
		for (int i=1;i<=100;i++){
			if(test.IsFizz(i)){
				System.out.println("Fizz");
			}else{
				if(test.IsBuzz(i)){
					System.out.println("Buzz");
				}else{
					if(test.IsBFizzuzz(i)){
						System.out.println("FizzBuzz");
					}else{
						System.out.println(i);
					}
				}
			}		
		}
	}

}
