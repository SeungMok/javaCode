package customer;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpManager {

	public static void main(String[] args) {

		IEmpDAO dao = new EmpDAO();
		EmpVO emp = new EmpVO();
		
		boolean run = true;
		int menu;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.입력  2.수정  3.삭제  4.리스트  5.종료");
			System.out.println("--------------------------------");
			System.out.println("메뉴선택>>");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				System.out.print("사원번호 : ");
				int sno = sc.nextInt();
				System.out.print("사원이름 : ");
				sc.nextLine();
				String sname = sc.nextLine();
				System.out.print("매니저 : ");
				int mno = sc.nextInt();
				emp.setEmployeeId(sno);
				emp.setFirstName(sname);
				emp.setManagerId(mno);
				
				dao.insertEmp(emp);
				System.out.println("입력 성공!!!");
				break;
			case 2:
				dao.updateEmp(emp);
				System.out.println("수정 성공");
				break;
			case 3:
				dao.deleteEmp(400);
				System.out.println("삭제 성공");
				break;
			case 4:
				List<EmpVO> empList1 = dao.selectEmpByDeptno(60);
				List<EmpVO> empList = dao.selectAllEmp();
				for (EmpVO vo : empList) {
					System.out.println(vo);
				}
				break;
			case 5:
				run = false;
				break;
			default:
				break;
			}
		}
	}
}