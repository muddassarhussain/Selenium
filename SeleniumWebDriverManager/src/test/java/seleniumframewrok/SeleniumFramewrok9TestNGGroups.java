package seleniumframewrok;

import org.testng.annotations.*;

public class SeleniumFramewrok9TestNGGroups{

	/*-----------------------------Chrome Code Start Here-----------------------------*/

	/*5th Automation Groups-TestNG Code Start Here*/

	@Testtilemountain(groups = {"smoke"})
	public void Test1() {
		System.out.println("Test one");
	}
	@Testtilemountain(groups = {"smoke", "sanity"})
	public void Test2() {
		System.out.println("Test one");
	}
	@Testtilemountain(groups = {"smoke", "regression"})
	public void Test3() {
		System.out.println("Test one");
	}
	@Testtilemountain(groups = {"smoke"})
	public void Test4() {
		System.out.println("Test one");
	}

	/*5th Automation Groups-TestNG Code End Here*/

	/*-----------------------------Chrome Code End Here-----------------------------*/

	//}

}