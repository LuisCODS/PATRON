package calculeSalaireNetEmployee;

public class test_employee_salary {

	public static void main(String[] args) {
		
		Employee e = new Employee("Luis", "bb", "01/02/18", "01/02/99", new SalaryInfermiere(),
				18, 4, 4, 1);

		e.getSalaire();
	}

}
